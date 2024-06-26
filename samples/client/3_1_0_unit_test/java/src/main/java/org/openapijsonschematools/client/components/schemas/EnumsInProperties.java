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
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class EnumsInProperties {
    // nest classes so all schemas and input/output classes can be public
    
    public enum StringFooEnums implements StringValueMethod {
        FOO("foo");
        private final String value;
    
        StringFooEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface FooBoxed permits FooBoxedString {
        @Nullable Object getData();
    }
    
    public record FooBoxedString(String data) implements FooBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Foo extends JsonSchema<FooBoxed> implements StringSchemaValidator<FooBoxedString>, StringEnumValidator<StringFooEnums> {
        private static @Nullable Foo instance = null;
    
        protected Foo() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "foo"
                ))
            );
        }
    
        public static Foo getInstance() {
            if (instance == null) {
                instance = new Foo();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringFooEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public FooBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new FooBoxedString(validate(arg, configuration));
        }
        @Override
        public FooBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    public enum StringBarEnums implements StringValueMethod {
        BAR("bar");
        private final String value;
    
        StringBarEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface BarBoxed permits BarBoxedString {
        @Nullable Object getData();
    }
    
    public record BarBoxedString(String data) implements BarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Bar extends JsonSchema<BarBoxed> implements StringSchemaValidator<BarBoxedString>, StringEnumValidator<StringBarEnums> {
        private static @Nullable Bar instance = null;
    
        protected Bar() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "bar"
                ))
            );
        }
    
        public static Bar getInstance() {
            if (instance == null) {
                instance = new Bar();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringBarEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public BarBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new BarBoxedString(validate(arg, configuration));
        }
        @Override
        public BarBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class EnumsInPropertiesMap extends FrozenMap<@Nullable Object> {
        protected EnumsInPropertiesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "bar"
        );
        public static final Set<String> optionalKeys = Set.of(
            "foo"
        );
        public static EnumsInPropertiesMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return EnumsInProperties1.getInstance().validate(arg, configuration);
        }
        
        public String bar() {
                        @Nullable Object value = get("bar");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for bar");
            }
            return (String) value;
        }
        
        public String foo() throws UnsetPropertyException {
            String key = "foo";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for foo");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForBar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterBar(Map<String, @Nullable Object> instance);
        
        default T bar(String value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(StringBarEnums value) {
            var instance = getInstance();
            instance.put("bar", value.value());
            return getBuilderAfterBar(instance);
        }
    }
    
    public interface SetterForFoo <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoo(Map<String, @Nullable Object> instance);
        
        default T foo(String value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(StringFooEnums value) {
            var instance = getInstance();
            instance.put("foo", value.value());
            return getBuilderAfterFoo(instance);
        }
    }
    
    public static class EnumsInPropertiesMap0Builder extends UnsetAddPropsSetter<EnumsInPropertiesMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFoo<EnumsInPropertiesMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "bar",
            "foo"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public EnumsInPropertiesMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public EnumsInPropertiesMap0Builder getBuilderAfterFoo(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumsInPropertiesMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class EnumsInPropertiesMapBuilder implements SetterForBar<EnumsInPropertiesMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public EnumsInPropertiesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public EnumsInPropertiesMap0Builder getBuilderAfterBar(Map<String, @Nullable Object> instance) {
            return new EnumsInPropertiesMap0Builder(instance);
        }
    }
    
    
    public sealed interface EnumsInProperties1Boxed permits EnumsInProperties1BoxedMap {
        @Nullable Object getData();
    }
    
    public record EnumsInProperties1BoxedMap(EnumsInPropertiesMap data) implements EnumsInProperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class EnumsInProperties1 extends JsonSchema<EnumsInProperties1Boxed> implements MapSchemaValidator<EnumsInPropertiesMap, EnumsInProperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable EnumsInProperties1 instance = null;
    
        protected EnumsInProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("foo", Foo.class),
                    new PropertyEntry("bar", Bar.class)
                ))
                .required(Set.of(
                    "bar"
                ))
            );
        }
    
        public static EnumsInProperties1 getInstance() {
            if (instance == null) {
                instance = new EnumsInProperties1();
            }
            return instance;
        }
        
        public EnumsInPropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new EnumsInPropertiesMap(castProperties);
        }
        
        public EnumsInPropertiesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public EnumsInProperties1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new EnumsInProperties1BoxedMap(validate(arg, configuration));
        }
        @Override
        public EnumsInProperties1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
