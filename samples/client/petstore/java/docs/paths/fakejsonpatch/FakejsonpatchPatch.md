# FakejsonpatchPatch

public class FakejsonpatchPatch

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Patch](#patch)<br>The class that has a patch method to call the endpoint |
| interface | [JsonPatchOperation](#jsonpatchoperation)<br>The interface that has a jsonPatch method to call the endpoint |
| static class | [PatchRequest](#patchrequest)<br>The request inputs class |
| static class | [PatchRequestBuilder](#patchrequestbuilder)<br>A builder for the request input class |

## Patch
public static class Patch extends ApiClient.ApiClient1 implements PatchOperation<br>

a class that allows one to call the endpoint using a method named patch

### Code Sample
```
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.FakejsonpatchPatchRequestBody;
import org.openapijsonschematools.client.components.schemas.JSONPatchRequest;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.RootServer0;
import org.openapijsonschematools.client.servers.RootServer1;
import org.openapijsonschematools.client.servers.RootServer2;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.responses.FakejsonpatchPatchCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.fakejsonpatch.FakejsonpatchPatch;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.FakejsonpatchPatchResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

// if you want to use a server that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfoBuilder()
    .rootServerInfo(
        new RootServerInfo.RootServerInfoBuilder()
            .rootServer0(new RootServer0())
            .build()
    )
    .build();
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfoBuilder()
    .rootServerInfoServerIndex(RootServerInfo.ServerIndex.SERVER_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator/1.0.0/java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
FakejsonpatchPatch.Patch apiClient = new FakejsonpatchPatch.Patch(apiConfiguration, schemaConfiguration);


var request = new FakejsonpatchPatch.PatchRequestBuilder().build();

FakejsonpatchPatchResponses.EndpointResponse response;
try {
    response = apiClient.patch(request);
} catch (ApiException e) {
    // server returned a response/contentType not defined in the openapi document
    throw e;
} catch (ValidationException e) {
    // the returned response body or header values do not conform the the schema validation requirements
    throw e;
} catch (IOException | InterruptedException e) {
    // an exception happened when making the request
    throw e;
} catch (NotImplementedException e) {
    // the request body serialization or deserialization has not yet been implemented
    // or the header content type deserialization has not yet been implemented for this contentType
    throw e;
}
FakejsonpatchPatchResponses.EndpointFakejsonpatchPatchCode200Response castResponse = (FakejsonpatchPatchResponses.EndpointFakejsonpatchPatchCode200Response) response;
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Patch(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakejsonpatchPatchResponses.EndpointResponse](../../paths/fakejsonpatch/patch/FakejsonpatchPatchResponses.md#endpointresponse) | patch([PatchRequest](#patchrequest) request) |

## JsonPatchOperation
public interface JsonPatchOperation<br>

an interface that allows one to call the endpoint using a method named jsonPatch by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakejsonpatchPatchResponses.EndpointResponse](../../paths/fakejsonpatch/patch/FakejsonpatchPatchResponses.md#endpointresponse) | jsonPatch([PatchRequest](#patchrequest) request) |

## PatchRequest
public static class PatchRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakejsonpatchPatchRequestBody.@Nullable SealedRequestBody](../../paths/fakejsonpatch/patch/FakejsonpatchPatchRequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PatchRequestBuilder
public static class PatchRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatchRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PatchRequest](#patchrequest) | build()<br>Returns the request input used to call an endpoint method |
| [PatchRequestBuilder](#patchrequestbuilder) | requestBody([FakejsonpatchPatchRequestBody.SealedRequestBody](../../paths/fakejsonpatch/patch/FakejsonpatchPatchRequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [PatchRequestBuilder](#patchrequestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [PatchRequestBuilder](#patchrequestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

[[Back to top]](#top) [[Back to README]](../../../README.md)
