# NumberWithValidations
org.openapijsonschematools.client.components.schemas.NumberWithValidations.java
public class NumberWithValidations<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NumberWithValidations.NumberWithValidations1Boxed](#numberwithvalidations1boxed)<br> sealed interface for validated payloads |
| record | [NumberWithValidations.NumberWithValidations1BoxedNumber](#numberwithvalidations1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NumberWithValidations.NumberWithValidations1](#numberwithvalidations1)<br> schema class |

## NumberWithValidations1Boxed
public sealed interface NumberWithValidations1Boxed<br>
permits<br>
[NumberWithValidations1BoxedNumber](#numberwithvalidations1boxednumber)

sealed interface that stores validated payloads using boxed classes

## NumberWithValidations1BoxedNumber
public record NumberWithValidations1BoxedNumber<br>
implements [NumberWithValidations1Boxed](#numberwithvalidations1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberWithValidations1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberWithValidations1
public static class NumberWithValidations1<br>
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
import org.openapijsonschematools.client.components.schemas.NumberWithValidations;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// int validation
int validatedPayload = NumberWithValidations.NumberWithValidations1.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Number | maximum = 20 |
| Number | minimum = 10 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| [NumberWithValidations1BoxedNumber](#numberwithvalidations1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NumberWithValidations1Boxed](#numberwithvalidations1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
