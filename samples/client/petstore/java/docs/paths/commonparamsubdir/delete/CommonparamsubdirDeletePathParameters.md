# CommonparamsubdirDeletePathParameters
public class CommonparamsubdirDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1Boxed](#commonparamsubdirdeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1BoxedMap](#commonparamsubdirdeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1](#commonparamsubdirdeletepathparameters1)<br> schema class |
| static class | [CommonparamsubdirDeletePathParameters.PathParametersMapBuilder](#pathparametersmapbuilder)<br> builder for Map payloads |
| static class | [CommonparamsubdirDeletePathParameters.PathParametersMap](#pathparametersmap)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirDeletePathParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeletePathParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirDeletePathParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirDeletePathParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirDeletePathParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirDeletePathParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirDeletePathParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeletePathParameters.AdditionalProperties](#additionalproperties)<br> schema class |

## CommonparamsubdirDeletePathParameters1Boxed
public sealed interface CommonparamsubdirDeletePathParameters1Boxed<br>
permits<br>
[CommonparamsubdirDeletePathParameters1BoxedMap](#commonparamsubdirdeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirDeletePathParameters1BoxedMap
public record CommonparamsubdirDeletePathParameters1BoxedMap<br>
implements [CommonparamsubdirDeletePathParameters1Boxed](#commonparamsubdirdeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters1BoxedMap([PathParametersMap](#pathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap](#pathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeletePathParameters1
public static class CommonparamsubdirDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.CommonparamsubdirDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirDeletePathParameters.PathParametersMap validatedPayload =
    CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1.validate(
    new CommonparamsubdirDeletePathParameters.PathParametersMapBuilder()
        .subDir("c")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("subDir", [Schema1.Schema11.class](../../../paths/commonparamsubdir/delete/parameters/parameter1/Schema1.md#schema11))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"subDir"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap](#pathparametersmap) | validate([Map&lt;?, ?&gt;](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeletePathParameters1BoxedMap](#commonparamsubdirdeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeletePathParameters1Boxed](#commonparamsubdirdeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PathParametersMap0Builder
public class PathParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## PathParametersMapBuilder
public class PathParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap0Builder](#pathparametersmap0builder) | subDir(String value) |
| [PathParametersMap0Builder](#pathparametersmap0builder) | subDir([Schema1.StringSchemaEnums1](../../../paths/commonparamsubdir/delete/parameters/parameter1/Schema1.md#stringschemaenums1) value) |

## PathParametersMap
public static class PathParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PathParametersMap](#pathparametersmap) | of([Map<String, String>](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | subDir()<br> |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
