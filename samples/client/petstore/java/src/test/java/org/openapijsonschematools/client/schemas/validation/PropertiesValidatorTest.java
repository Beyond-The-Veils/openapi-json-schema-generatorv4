package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PropertiesValidatorTest {
    public sealed interface ObjectWithPropsSchemaBoxed permits ObjectWithPropsSchemaBoxedMap {}
    public record ObjectWithPropsSchemaBoxedMap() implements ObjectWithPropsSchemaBoxed {}

    public static class ObjectWithPropsSchema extends JsonSchema<ObjectWithPropsSchemaBoxed> {
        private ObjectWithPropsSchema() {
            super(new JsonSchemaInfo()
                    .type(Set.of(Map.class))
                    .properties(Map.ofEntries(
                            new PropertyEntry("someString", StringJsonSchema.StringJsonSchema1.class)
                    ))
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
        public ObjectWithPropsSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectWithPropsSchemaBoxedMap();
        }
    }

    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    @Test
    public void testCorrectPropertySucceeds() throws ValidationException {
        final PropertiesValidator validator = new PropertiesValidator();
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
        PathToSchemasMap pathToSchemas = validator.validate(
                new ValidationData(
                    new ObjectWithPropsSchema(),
                    arg,
                    validationMetadata
                )
        );
        if (pathToSchemas == null) {
            throw new RuntimeException("Invalid null value for pathToSchemas for this test case");
        }
        List<Object> expectedPathToItem = new ArrayList<>();
        expectedPathToItem.add("args[0]");
        expectedPathToItem.add("someString");
        LinkedHashMap<JsonSchema<?>, Void> expectedClasses = new LinkedHashMap<>();
        expectedClasses.put(JsonSchemaFactory.getInstance(StringJsonSchema.StringJsonSchema1.class), null);
        PathToSchemasMap expectedPathToSchemas = new PathToSchemasMap();
        expectedPathToSchemas.put(expectedPathToItem, expectedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }

    @Test
    public void testNotApplicableTypeReturnsNull() throws ValidationException {
        final PropertiesValidator validator = new PropertiesValidator();
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        PathToSchemasMap pathToSchemas = validator.validate(
                new ValidationData(
                    new ObjectWithPropsSchema(),
                    1,
                    validationMetadata
                )
        );
        assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectPropertyValueFails() {
        final PropertiesValidator validator = new PropertiesValidator();
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("someString", 1);
        FrozenMap<Object> arg = new FrozenMap<>(mutableMap);
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    new ObjectWithPropsSchema(),
                    arg,
                    validationMetadata
                )
        ));
    }
}