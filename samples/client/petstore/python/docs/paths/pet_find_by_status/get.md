petstore_api.paths.pet_find_by_status.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| find_pets_by_status | [PetApi](../../apis/tags/pet_api.md) | This api is only for tag=pet |
| get | ApiForGet | This api is only for this endpoint |
| get | PetFindByStatus | This api is only for path=/pet/findByStatus |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Security](#security)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Finds Pets by status |
| Description | Multiple status values can be provided with comma separated strings |
| Path | "/pet/findByStatus" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_params) | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0, 1, 2]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned
### query_params
### QueryParameters
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) |

#### QueryParameters QueryParametersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [schema.SchemaTupleInput](../../paths/pet_find_by_status/get/parameters/parameter_0/schema.md#schematupleinput), [schema.SchemaTuple](../../paths/pet_find_by_status/get/parameters/parameter_0/schema.md#schematuple) |  |

#### QueryParameters QueryParametersDict
```
base class: schemas.immutabledict[str, SchemaTuple]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**status** | [schema.SchemaTupleInput](../../paths/pet_find_by_status/get/parameters/parameter_0/schema.md#schematupleinput), [schema.SchemaTuple](../../paths/pet_find_by_status/get/parameters/parameter_0/schema.md#schematuple) |  |

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**status** | [schema.SchemaTuple](../../paths/pet_find_by_status/get/parameters/parameter_0/schema.md#schematuple) |  |

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessfulXmlAndJsonArrayOfPet.ApiResponse](../../components/responses/response_successful_xml_and_json_array_of_pet.md#apiresponse) | successful operation, multiple content types
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Invalid status value

## ResponseFor400

### Description
Invalid status value

### ResponseFor400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Security

Set auth info by setting ApiConfiguration.security_scheme_info to a dict where the
key is the below security scheme quoted name, and the value is an instance of the linked
component security scheme class.
Select the security index by setting ApiConfiguration.security_index_info or by
passing in security_index into the endpoint method.
See how to do this in the code sample.
- these securities are specific to this to this endpoint

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["api_key"](../../components/security_schemes/security_scheme_api_key.md) []<br> |
| 1       | ["http_signature_test"](../../components/security_schemes/security_scheme_http_signature_test.md) []<br> |
| 2       | ["petstore_auth"](../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are specific to this "/pet/findByStatus" path
- defaults to server_index=0, server.url = https://path-server-test.petstore.local/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](#server0) |
1 | [Server1](#server1) |

### Server0

#### Url
https://path-server-test.petstore.local/v2

### Server1

#### Url
https://petstore.swagger.io/{version}

#### Variables
Key | Type | Description | Notes
--- | ---- | ----------- | ------
**version** | str |  |  must be one of ["v1", "v2"] if omitted the client will use the default value of v1

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import pet_api
from petstore_api.paths.pet_find_by_status.get import operation
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_api_key
# security_index 1
from petstore_api.components.security_schemes import security_scheme_http_signature_test
# security_index 2
from petstore_api.components.security_schemes import security_scheme_petstore_auth

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}


# security_scheme_info for security_index 1
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "http_signature_test": security_scheme_http_signature_test.HttpSignatureTest(
        signing_info=petstore_api.signing.HttpSigningConfiguration(
            key_id='my-key-id',
            private_key_path='rsa.pem',
            signing_scheme=petstore_api.signing.SCHEME_HS2019,
            signing_algorithm=petstore_api.signing.ALGORITHM_RSASSA_PSS,
            signed_headers=[
                petstore_api.signing.HEADER_REQUEST_TARGET,
                petstore_api.signing.HEADER_CREATED,
                petstore_api.signing.HEADER_EXPIRES,
                petstore_api.signing.HEADER_HOST,
                petstore_api.signing.HEADER_DATE,
                petstore_api.signing.HEADER_DIGEST,
                'Content-Type',
                'User-Agent'
            ],
            signature_max_validity=datetime.timedelta(minutes=5)
        )

    ),
}


# security_scheme_info for security_index 2
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

security_index_info: api_configuration.SecurityIndexInfo = {
    "security": 0,  # default value
    "paths//pet/findByStatus/get/security": 0,
    # only set one "paths//pet/findByStatus/get/security": 1,
    # only set one "paths//pet/findByStatus/get/security": 2,
}
used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info,
    security_index_info=security_index_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    query_params: operation.QueryParametersDictInput = {
        'status': [
        "available"
    ],
    }
    try:
        # Finds Pets by status
        api_response = api_instance.find_pets_by_status(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->find_pets_by_status: %s\n" % e)
```

[[Back to top]](#top)
[[Back to PetApi API]](../../apis/tags/pet_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)