# Schema0
public class Schema0<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema0.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| record | [Schema0.Schema01BoxedList](#schema01boxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema0.Schema01](#schema01)<br> schema class |
| static class | [Schema0.SchemaListBuilder0](#schemalistbuilder0)<br> builder for List payloads |
| static class | [Schema0.SchemaList0](#schemalist0)<br> output class for List payloads |
| sealed interface | [Schema0.Items0Boxed](#items0boxed)<br> sealed interface for validated payloads |
| record | [Schema0.Items0BoxedString](#items0boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema0.Items0](#items0)<br> schema class |

## Schema01Boxed
public sealed interface Schema01Boxed<br>
permits<br>
[Schema01BoxedList](#schema01boxedlist)

sealed interface that stores validated payloads using boxed classes

## Schema01BoxedList
public record Schema01BoxedList<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedList([SchemaList0](#schemalist0) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaList0](#schemalist0) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01
public static class Schema01<br>
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
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter0.Schema0;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
Schema0.SchemaList0 validatedPayload =
    Schema0.Schema01.validate(
    new Schema0.SchemaListBuilder0()
        .add("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items0.class](#items0) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaList0](#schemalist0) | validate([List<?>](#schemalistbuilder0) arg, SchemaConfiguration configuration) |
| [Schema01BoxedList](#schema01boxedlist) | validateAndBox([List<?>](#schemalistbuilder0) arg, SchemaConfiguration configuration) |
| [Schema01Boxed](#schema01boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## SchemaListBuilder0
public class SchemaListBuilder0<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaListBuilder0()<br>Creates an empty list |
| SchemaListBuilder0(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SchemaListBuilder0 | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## SchemaList0
public class SchemaList0<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList0](#schemalist0) | of([List<String>](#schemalistbuilder0) arg, SchemaConfiguration configuration) |

## Items0Boxed
public sealed interface Items0Boxed<br>
permits<br>
[Items0BoxedString](#items0boxedstring)

sealed interface that stores validated payloads using boxed classes

## Items0BoxedString
public record Items0BoxedString<br>
implements [Items0Boxed](#items0boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items0
public static class Items0<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
