# ArrayWithValidationsInItems
org.openapijsonschematools.client.components.schemas.ArrayWithValidationsInItems.java
public class ArrayWithValidationsInItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ArrayWithValidationsInItems.ArrayWithValidationsInItems1Boxed](#arraywithvalidationsinitems1boxed)<br> sealed interface for validated payloads |
| record | [ArrayWithValidationsInItems.ArrayWithValidationsInItems1BoxedList](#arraywithvalidationsinitems1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayWithValidationsInItems.ArrayWithValidationsInItems1](#arraywithvalidationsinitems1)<br> schema class |
| static class | [ArrayWithValidationsInItems.ArrayWithValidationsInItemsListBuilder](#arraywithvalidationsinitemslistbuilder)<br> builder for List payloads |
| static class | [ArrayWithValidationsInItems.ArrayWithValidationsInItemsList](#arraywithvalidationsinitemslist)<br> output class for List payloads |
| sealed interface | [ArrayWithValidationsInItems.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [ArrayWithValidationsInItems.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ArrayWithValidationsInItems.Items](#items)<br> schema class |

## ArrayWithValidationsInItems1Boxed
public sealed interface ArrayWithValidationsInItems1Boxed<br>
permits<br>
[ArrayWithValidationsInItems1BoxedList](#arraywithvalidationsinitems1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayWithValidationsInItems1BoxedList
public record ArrayWithValidationsInItems1BoxedList<br>
implements [ArrayWithValidationsInItems1Boxed](#arraywithvalidationsinitems1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayWithValidationsInItems1BoxedList([ArrayWithValidationsInItemsList](#arraywithvalidationsinitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayWithValidationsInItemsList](#arraywithvalidationsinitemslist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayWithValidationsInItems1
public static class ArrayWithValidationsInItems1<br>
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
import org.openapijsonschematools.client.components.schemas.ArrayWithValidationsInItems;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
ArrayWithValidationsInItems.ArrayWithValidationsInItemsList validatedPayload =
    ArrayWithValidationsInItems.ArrayWithValidationsInItems1.validate(
    new ArrayWithValidationsInItems.ArrayWithValidationsInItemsListBuilder()
        .add(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |
| Integer | maxItems = 2 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayWithValidationsInItemsList](#arraywithvalidationsinitemslist) | validate([List<?>](#arraywithvalidationsinitemslistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayWithValidationsInItems1BoxedList](#arraywithvalidationsinitems1boxedlist) | validateAndBox([List<?>](#arraywithvalidationsinitemslistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayWithValidationsInItems1Boxed](#arraywithvalidationsinitems1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayWithValidationsInItemsListBuilder
public class ArrayWithValidationsInItemsListBuilder<br>
builder for `List<Number>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayWithValidationsInItemsListBuilder()<br>Creates an empty list |
| ArrayWithValidationsInItemsListBuilder(List<Number> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayWithValidationsInItemsListBuilder | add(int item) |
| ArrayWithValidationsInItemsListBuilder | add(float item) |
| ArrayWithValidationsInItemsListBuilder | add(long item) |
| ArrayWithValidationsInItemsListBuilder | add(double item) |
| List<Number> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayWithValidationsInItemsList
public class ArrayWithValidationsInItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayWithValidationsInItemsList](#arraywithvalidationsinitemslist) | of([List<Number>](#arraywithvalidationsinitemslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
public sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedNumber](#itemsboxednumber)

sealed interface that stores validated payloads using boxed classes

## ItemsBoxedNumber
public record ItemsBoxedNumber<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items
public static class Items<br>
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
import org.openapijsonschematools.client.components.schemas.ArrayWithValidationsInItems;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// long validation
long validatedPayload = ArrayWithValidationsInItems.Items.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int64"; |
| Number | maximum = 7 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [ItemsBoxedNumber](#itemsboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ItemsBoxed](#itemsboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
