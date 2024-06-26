package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.DefaultValueMethod;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing {
    // nest classes so all schemas and input/output classes can be public
    
    
    public sealed interface AlphaBoxed permits AlphaBoxedNumber {
        @Nullable Object getData();
    }
    
    public record AlphaBoxedNumber(Number data) implements AlphaBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Alpha extends JsonSchema<AlphaBoxed> implements NumberSchemaValidator<AlphaBoxedNumber> {
        private static @Nullable Alpha instance = null;
    
        protected Alpha() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .maximum(3)
                .defaultValue(5.0)
            );
        }
    
        public static Alpha getInstance() {
            if (instance == null) {
                instance = new Alpha();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AlphaBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new AlphaBoxedNumber(validate(arg, configuration));
        }
        @Override
        public AlphaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap extends FrozenMap<@Nullable Object> {
        protected TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "alpha"
        );
        public static TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance().validate(arg, configuration);
        }
        
        public Number alpha() throws UnsetPropertyException {
            String key = "alpha";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for alpha");
            }
            return (Number) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForAlpha <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAlpha(Map<String, @Nullable Object> instance);
        
        default T alpha(int value) {
            var instance = getInstance();
            instance.put("alpha", value);
            return getBuilderAfterAlpha(instance);
        }
        
        default T alpha(float value) {
            var instance = getInstance();
            instance.put("alpha", value);
            return getBuilderAfterAlpha(instance);
        }
        
        default T alpha(long value) {
            var instance = getInstance();
            instance.put("alpha", value);
            return getBuilderAfterAlpha(instance);
        }
        
        default T alpha(double value) {
            var instance = getInstance();
            instance.put("alpha", value);
            return getBuilderAfterAlpha(instance);
        }
    }
    
    public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder extends UnsetAddPropsSetter<TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForAlpha<TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "alpha"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder getBuilderAfterAlpha(Map<String, @Nullable Object> instance) {
            return this;
        }
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed permits TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap {
        @Nullable Object getData();
    }
    
    public record TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap(TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap data) implements TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1 extends JsonSchema<TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed> implements MapSchemaValidator<TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap, TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1 instance = null;
    
        protected TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("alpha", Alpha.class)
                ))
            );
        }
    
        public static TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1 getInstance() {
            if (instance == null) {
                instance = new TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1();
            }
            return instance;
        }
        
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new RuntimeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap(castProperties);
        }
        
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap(validate(arg, configuration));
        }
        @Override
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
