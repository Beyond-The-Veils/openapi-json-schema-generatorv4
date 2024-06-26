# FakepetiduploadimagewithrequiredfilePost

public class FakepetiduploadimagewithrequiredfilePost

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Post](#post)<br>The class that has a post method to call the endpoint |
| interface | [UploadFileWithRequiredFileOperation](#uploadfilewithrequiredfileoperation)<br>The interface that has a uploadFileWithRequiredFile method to call the endpoint |
| static class | [PostRequest](#postrequest)<br>The final request inputs class |
| static class | [PostNullableRequest](#postnullablerequest)<br>The initial request inputs class |
| static class | [Post0RequestBuilder](#post0requestbuilder)<br>A builder for the request input class |
| static class | [PostRequestBuilder](#postrequestbuilder)<br>A builder for the request input class |

## Post
public static class Post extends ApiClient.ApiClient1 implements PostOperation<br>

a class that allows one to call the endpoint using a method named post

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
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostRequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostSecurityInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostPathParameters;
import org.openapijsonschematools.client.servers.RootServer0;
import org.openapijsonschematools.client.servers.RootServer1;
import org.openapijsonschematools.client.servers.RootServer2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.responses.FakepetiduploadimagewithrequiredfilePostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.FakepetiduploadimagewithrequiredfilePost;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .fakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0SecurityIndex(FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0.SecurityIndex.SECURITY_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator/1.0.0/java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
FakepetiduploadimagewithrequiredfilePost.Post apiClient = new FakepetiduploadimagewithrequiredfilePost.Post(apiConfiguration, schemaConfiguration);


// Map validation
FakepetiduploadimagewithrequiredfilePostPathParameters.PathParametersMap pathParameters =
    FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1.validate(
    new FakepetiduploadimagewithrequiredfilePostPathParameters.PathParametersMapBuilder()
        .petId(1L)

    .build(),
    schemaConfiguration
);

var request = new FakepetiduploadimagewithrequiredfilePost.PostRequestBuilder()
    .pathParameters(pathParameters)
    .build();

FakepetiduploadimagewithrequiredfilePostResponses.EndpointResponse response;
try {
    response = apiClient.post(request);
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
FakepetiduploadimagewithrequiredfilePostResponses.EndpointFakepetiduploadimagewithrequiredfilePostCode200Response castResponse = (FakepetiduploadimagewithrequiredfilePostResponses.EndpointFakepetiduploadimagewithrequiredfilePostCode200Response) response;
FakepetiduploadimagewithrequiredfilePostCode200Response.ApplicationjsonResponseBody deserializedBody = (FakepetiduploadimagewithrequiredfilePostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostResponses.EndpointResponse](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostResponses.md#endpointresponse) | post([PostRequest](#postrequest) request) |

## UploadFileWithRequiredFileOperation
public interface UploadFileWithRequiredFileOperation<br>

an interface that allows one to call the endpoint using a method named uploadFileWithRequiredFile by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostResponses.EndpointResponse](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostResponses.md#endpointresponse) | uploadFileWithRequiredFile([PostRequest](#postrequest) request) |

## PostRequest
public static class PostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakepetiduploadimagewithrequiredfilePostPathParameters.PathParametersMap](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostPathParameters.md#pathparametersmap) | pathParameters |
| [FakepetiduploadimagewithrequiredfilePostRequestBody.@Nullable SealedRequestBody](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostRequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PostNullableRequest
public static class PostNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakepetiduploadimagewithrequiredfilePostPathParameters.@Nullable PathParametersMap](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostPathParameters.md#pathparametersmap) | pathParameters |
| [FakepetiduploadimagewithrequiredfilePostRequestBody.@Nullable SealedRequestBody](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostRequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| [FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostSecurityInfo.md#securityindex) | securityIndex |
| @Nullable Duration | timeout |

## Post0RequestBuilder
public static class Post0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post0RequestBuilder(Post0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PostRequest](#postrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Post0RequestBuilder](#post0requestbuilder) | requestBody([FakepetiduploadimagewithrequiredfilePostRequestBody.SealedRequestBody](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostRequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [Post0RequestBuilder](#post0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Post0RequestBuilder](#post0requestbuilder) | securityIndex([FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Post0RequestBuilder](#post0requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## PostRequestBuilder
public static class PostRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PostRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Post0RequestBuilder](#post0requestbuilder) | pathParameters([FakepetiduploadimagewithrequiredfilePostPathParametersPathParametersMap](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostPathParameters.md#pathparametersmap) pathParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
