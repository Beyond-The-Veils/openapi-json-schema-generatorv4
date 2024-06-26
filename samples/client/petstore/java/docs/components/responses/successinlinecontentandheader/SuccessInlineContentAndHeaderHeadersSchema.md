# SuccessInlineContentAndHeaderHeadersSchema
public class SuccessInlineContentAndHeaderHeadersSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchema1Boxed](#successinlinecontentandheaderheadersschema1boxed)<br> sealed interface for validated payloads |
| record | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchema1BoxedMap](#successinlinecontentandheaderheadersschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchema1](#successinlinecontentandheaderheadersschema1)<br> schema class |
| static class | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMapBuilder](#successinlinecontentandheaderheadersschemamapbuilder)<br> builder for Map payloads |
| static class | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap](#successinlinecontentandheaderheadersschemamap)<br> output class for Map payloads |
| sealed interface | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderAdditionalPropertiesBoxed](#successinlinecontentandheaderadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderAdditionalPropertiesBoxedVoid](#successinlinecontentandheaderadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderAdditionalPropertiesBoxedBoolean](#successinlinecontentandheaderadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderAdditionalPropertiesBoxedNumber](#successinlinecontentandheaderadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderAdditionalPropertiesBoxedString](#successinlinecontentandheaderadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderAdditionalPropertiesBoxedList](#successinlinecontentandheaderadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderAdditionalPropertiesBoxedMap](#successinlinecontentandheaderadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderAdditionalProperties](#successinlinecontentandheaderadditionalproperties)<br> schema class |

## SuccessInlineContentAndHeaderHeadersSchema1Boxed
public sealed interface SuccessInlineContentAndHeaderHeadersSchema1Boxed<br>
permits<br>
[SuccessInlineContentAndHeaderHeadersSchema1BoxedMap](#successinlinecontentandheaderheadersschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## SuccessInlineContentAndHeaderHeadersSchema1BoxedMap
public record SuccessInlineContentAndHeaderHeadersSchema1BoxedMap<br>
implements [SuccessInlineContentAndHeaderHeadersSchema1Boxed](#successinlinecontentandheaderheadersschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessInlineContentAndHeaderHeadersSchema1BoxedMap([SuccessInlineContentAndHeaderHeadersSchemaMap](#successinlinecontentandheaderheadersschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessInlineContentAndHeaderHeadersSchemaMap](#successinlinecontentandheaderheadersschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessInlineContentAndHeaderHeadersSchema1
public static class SuccessInlineContentAndHeaderHeadersSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.SuccessInlineContentAndHeaderHeadersSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap validatedPayload =
    SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchema1.validate(
    new SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMapBuilder()
        .someHeader("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someHeader", [SomeHeaderSchema.SomeHeaderSchema1.class](../../../components/responses/successinlinecontentandheader/headers/someheader/SomeHeaderSchema.md#someheaderschema1))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [SuccessInlineContentAndHeaderAdditionalProperties.class](#successinlinecontentandheaderadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessInlineContentAndHeaderHeadersSchemaMap](#successinlinecontentandheaderheadersschemamap) | validate([Map&lt;?, ?&gt;](#successinlinecontentandheaderheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SuccessInlineContentAndHeaderHeadersSchema1BoxedMap](#successinlinecontentandheaderheadersschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#successinlinecontentandheaderheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SuccessInlineContentAndHeaderHeadersSchema1Boxed](#successinlinecontentandheaderheadersschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## SuccessInlineContentAndHeaderHeadersSchemaMapBuilder
public class SuccessInlineContentAndHeaderHeadersSchemaMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessInlineContentAndHeaderHeadersSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [SuccessInlineContentAndHeaderHeadersSchemaMapBuilder](#successinlinecontentandheaderheadersschemamapbuilder) | someHeader(String value) |

## SuccessInlineContentAndHeaderHeadersSchemaMap
public static class SuccessInlineContentAndHeaderHeadersSchemaMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SuccessInlineContentAndHeaderHeadersSchemaMap](#successinlinecontentandheaderheadersschemamap) | of([Map<String, String>](#successinlinecontentandheaderheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | someHeader()<br>[optional] |

## SuccessInlineContentAndHeaderAdditionalPropertiesBoxed
public sealed interface SuccessInlineContentAndHeaderAdditionalPropertiesBoxed<br>
permits<br>
[SuccessInlineContentAndHeaderAdditionalPropertiesBoxedVoid](#successinlinecontentandheaderadditionalpropertiesboxedvoid),
[SuccessInlineContentAndHeaderAdditionalPropertiesBoxedBoolean](#successinlinecontentandheaderadditionalpropertiesboxedboolean),
[SuccessInlineContentAndHeaderAdditionalPropertiesBoxedNumber](#successinlinecontentandheaderadditionalpropertiesboxednumber),
[SuccessInlineContentAndHeaderAdditionalPropertiesBoxedString](#successinlinecontentandheaderadditionalpropertiesboxedstring),
[SuccessInlineContentAndHeaderAdditionalPropertiesBoxedList](#successinlinecontentandheaderadditionalpropertiesboxedlist),
[SuccessInlineContentAndHeaderAdditionalPropertiesBoxedMap](#successinlinecontentandheaderadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## SuccessInlineContentAndHeaderAdditionalPropertiesBoxedVoid
public record SuccessInlineContentAndHeaderAdditionalPropertiesBoxedVoid<br>
implements [SuccessInlineContentAndHeaderAdditionalPropertiesBoxed](#successinlinecontentandheaderadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessInlineContentAndHeaderAdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessInlineContentAndHeaderAdditionalPropertiesBoxedBoolean
public record SuccessInlineContentAndHeaderAdditionalPropertiesBoxedBoolean<br>
implements [SuccessInlineContentAndHeaderAdditionalPropertiesBoxed](#successinlinecontentandheaderadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessInlineContentAndHeaderAdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessInlineContentAndHeaderAdditionalPropertiesBoxedNumber
public record SuccessInlineContentAndHeaderAdditionalPropertiesBoxedNumber<br>
implements [SuccessInlineContentAndHeaderAdditionalPropertiesBoxed](#successinlinecontentandheaderadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessInlineContentAndHeaderAdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessInlineContentAndHeaderAdditionalPropertiesBoxedString
public record SuccessInlineContentAndHeaderAdditionalPropertiesBoxedString<br>
implements [SuccessInlineContentAndHeaderAdditionalPropertiesBoxed](#successinlinecontentandheaderadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessInlineContentAndHeaderAdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessInlineContentAndHeaderAdditionalPropertiesBoxedList
public record SuccessInlineContentAndHeaderAdditionalPropertiesBoxedList<br>
implements [SuccessInlineContentAndHeaderAdditionalPropertiesBoxed](#successinlinecontentandheaderadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessInlineContentAndHeaderAdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessInlineContentAndHeaderAdditionalPropertiesBoxedMap
public record SuccessInlineContentAndHeaderAdditionalPropertiesBoxedMap<br>
implements [SuccessInlineContentAndHeaderAdditionalPropertiesBoxed](#successinlinecontentandheaderadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessInlineContentAndHeaderAdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessInlineContentAndHeaderAdditionalProperties
public static class SuccessInlineContentAndHeaderAdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
