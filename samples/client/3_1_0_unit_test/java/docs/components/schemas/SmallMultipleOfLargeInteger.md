# SmallMultipleOfLargeInteger
org.openapijsonschematools.client.components.schemas.SmallMultipleOfLargeInteger.java
public class SmallMultipleOfLargeInteger<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1Boxed](#smallmultipleoflargeinteger1boxed)<br> sealed interface for validated payloads |
| record | [SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1BoxedNumber](#smallmultipleoflargeinteger1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1](#smallmultipleoflargeinteger1)<br> schema class |

## SmallMultipleOfLargeInteger1Boxed
public sealed interface SmallMultipleOfLargeInteger1Boxed<br>
permits<br>
[SmallMultipleOfLargeInteger1BoxedNumber](#smallmultipleoflargeinteger1boxednumber)

sealed interface that stores validated payloads using boxed classes

## SmallMultipleOfLargeInteger1BoxedNumber
public record SmallMultipleOfLargeInteger1BoxedNumber<br>
implements [SmallMultipleOfLargeInteger1Boxed](#smallmultipleoflargeinteger1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SmallMultipleOfLargeInteger1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SmallMultipleOfLargeInteger1
public static class SmallMultipleOfLargeInteger1<br>
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
import org.openapijsonschematools.client.components.schemas.SmallMultipleOfLargeInteger;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// int validation
int validatedPayload = SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int"; |
| BigDecimal | multipleOf = new BigDecimal("1.0E-8") |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [SmallMultipleOfLargeInteger1BoxedNumber](#smallmultipleoflargeinteger1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [SmallMultipleOfLargeInteger1Boxed](#smallmultipleoflargeinteger1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
