package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RequiredValidatorTest {
    public sealed interface ObjectWithRequiredSchemaBoxed permits ObjectWithRequiredSchemaBoxedMap {}
    public record ObjectWithRequiredSchemaBoxedMap() implements ObjectWithRequiredSchemaBoxed {}

    public static class ObjectWithRequiredSchema extends JsonSchema<ObjectWithRequiredSchemaBoxed> {
        private ObjectWithRequiredSchema() {
            super(new JsonSchemaInfo()
                    .type(Set.of(Map.class))
                    .required(Set.of("someString"))
            );

        }

        @Override
        public Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map<?, ?> mapArg) {
                return getNewInstance(mapArg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }

        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> mapArg) {
                return validate(mapArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }

        @Override
        public ObjectWithRequiredSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectWithRequiredSchemaBoxedMap();
        }
    }

    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    @Test
    public void testCorrectPropertySucceeds() throws ValidationException {
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("someString", "abc");
        FrozenMap<Object> arg = new FrozenMap<>(mutableMap);
        final RequiredValidator validator = new RequiredValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                new ValidationData(
                    new ObjectWithRequiredSchema(),
                    arg,
                    validationMetadata
                )
        );
        assertNull(pathToSchemas);
    }

    @Test
    public void testNotApplicableTypeReturnsNull() throws ValidationException {
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        final RequiredValidator validator = new RequiredValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                new ValidationData(
                    new ObjectWithRequiredSchema(),
                    1,
                    validationMetadata
                )
        );
        assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectPropertyFails() {
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("aDifferentProp", 1);
        FrozenMap<Object> arg = new FrozenMap<>(mutableMap);
        final RequiredValidator validator = new RequiredValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    new ObjectWithRequiredSchema(),
                    arg,
                    validationMetadata
                )
        ));
    }
}