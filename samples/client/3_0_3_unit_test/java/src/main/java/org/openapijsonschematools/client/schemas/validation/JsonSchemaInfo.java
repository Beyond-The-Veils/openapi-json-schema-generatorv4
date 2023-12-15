package org.openapijsonschematools.client.schemas.validation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class JsonSchemaInfo {
    public Set<Class<?>> type;
    public JsonSchemaInfo type(Set<Class<?>> type) {
        this.type = type;
        return this;
    }
    public String format;
    public JsonSchemaInfo format(String format) {
        this.format = format;
        return this;
    }
    public Class<? extends JsonSchema> items;
    public JsonSchemaInfo items(Class<? extends JsonSchema> items) {
        this.items = items;
        return this;
    }
    public Map<String, Class<? extends JsonSchema>> properties;
    public JsonSchemaInfo properties(Map<String, Class<? extends JsonSchema>> properties) {
        this.properties = properties;
        return this;
    }
    public Set<String> required;
    public JsonSchemaInfo required(Set<String> required) {
        this.required = required;
        return this;
    }
    public Number exclusiveMaximum;
    public JsonSchemaInfo exclusiveMaximum(Number exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
        return this;
    }
    public Number exclusiveMinimum;
    public JsonSchemaInfo exclusiveMinimum(Number exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
        return this;
    }
    public Integer maxItems;
    public JsonSchemaInfo maxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer minItems;
    public JsonSchemaInfo minItems(Integer minItems) {
        this.minItems = minItems;
        return this;
    }
    public Integer maxLength;
    public JsonSchemaInfo maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Integer minLength;
    public JsonSchemaInfo minLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }
    public Integer maxProperties;
    public JsonSchemaInfo maxProperties(Integer maxProperties) {
        this.maxProperties = maxProperties;
        return this;
    }
    public Integer minProperties;
    public JsonSchemaInfo minProperties(Integer minProperties) {
        this.minProperties = minProperties;
        return this;
    }
    public Number maximum;
    public JsonSchemaInfo maximum(Number maximum) {
        this.maximum = maximum;
        return this;
    }
    public Number minimum;
    public JsonSchemaInfo minimum(Number minimum) {
        this.minimum = minimum;
        return this;
    }
    public BigDecimal multipleOf;
    public JsonSchemaInfo multipleOf(BigDecimal multipleOf) {
        this.multipleOf = multipleOf;
        return this;
    }
    public Class<? extends JsonSchema> additionalProperties;
    public JsonSchemaInfo additionalProperties(Class<? extends JsonSchema> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
    public List<Class<? extends JsonSchema>> allOf;
    public JsonSchemaInfo allOf(List<Class<? extends JsonSchema>> allOf) {
        this.allOf = allOf;
        return this;
    }
    public List<Class<? extends JsonSchema>> anyOf;
    public JsonSchemaInfo anyOf(List<Class<? extends JsonSchema>> anyOf) {
        this.anyOf = anyOf;
        return this;
    }
    public List<Class<? extends JsonSchema>> oneOf;
    public JsonSchemaInfo oneOf(List<Class<? extends JsonSchema>> oneOf) {
        this.oneOf = oneOf;
        return this;
    }
    public Class<? extends JsonSchema> not;
    public JsonSchemaInfo not(Class<? extends JsonSchema> not) {
        this.not = not;
        return this;
    }
    public Boolean uniqueItems;
    public JsonSchemaInfo uniqueItems(Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
        return this;
    }
    public Set<Object> enumValues;
    public JsonSchemaInfo enumValues(Set<Object> enumValues) {
        this.enumValues = enumValues;
        return this;
    }
    public Pattern pattern;
    public JsonSchemaInfo pattern(Pattern pattern) {
        this.pattern = pattern;
        return this;
    }
}