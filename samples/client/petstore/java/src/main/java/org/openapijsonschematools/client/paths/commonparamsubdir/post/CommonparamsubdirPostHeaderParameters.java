package org.openapijsonschematools.client.paths.commonparamsubdir.post;
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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class CommonparamsubdirPostHeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class HeaderParametersMap extends FrozenMap<String> {
        protected HeaderParametersMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "someHeader"
        );
        public static HeaderParametersMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return CommonparamsubdirPostHeaderParameters1.getInstance().validate(arg, configuration);
        }
        
        public String someHeader() throws UnsetPropertyException {
            return getOrThrow("someHeader");
        }
    }
    
    public interface SetterForSomeHeader <T> {
        Map<String, String> getInstance();
        T getBuilderAfterSomeHeader(Map<String, String> instance);
        
        default T someHeader(String value) {
            var instance = getInstance();
            instance.put("someHeader", value);
            return getBuilderAfterSomeHeader(instance);
        }
    }
    
    public static class HeaderParametersMapBuilder implements GenericBuilder<Map<String, String>>, SetterForSomeHeader<HeaderParametersMapBuilder> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "someHeader"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public HeaderParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public HeaderParametersMapBuilder getBuilderAfterSomeHeader(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public sealed interface CommonparamsubdirPostHeaderParameters1Boxed permits CommonparamsubdirPostHeaderParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record CommonparamsubdirPostHeaderParameters1BoxedMap(HeaderParametersMap data) implements CommonparamsubdirPostHeaderParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class CommonparamsubdirPostHeaderParameters1 extends JsonSchema<CommonparamsubdirPostHeaderParameters1Boxed> implements MapSchemaValidator<HeaderParametersMap, CommonparamsubdirPostHeaderParameters1BoxedMap> {
        private static @Nullable CommonparamsubdirPostHeaderParameters1 instance = null;
    
        protected CommonparamsubdirPostHeaderParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("someHeader", Schema0.Schema01.class)
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static CommonparamsubdirPostHeaderParameters1 getInstance() {
            if (instance == null) {
                instance = new CommonparamsubdirPostHeaderParameters1();
            }
            return instance;
        }
        
        public HeaderParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, String> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof String)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new HeaderParametersMap(castProperties);
        }
        
        public HeaderParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public CommonparamsubdirPostHeaderParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new CommonparamsubdirPostHeaderParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public CommonparamsubdirPostHeaderParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
