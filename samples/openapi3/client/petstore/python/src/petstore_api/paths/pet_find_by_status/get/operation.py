# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api import api_client, security_schemes
from petstore_api.shared_imports.operation_imports import *

from .. import path
from .responses import (
    response_200,
    response_400,
)
from .parameters import parameter_0
from .security import (
    security_requirement_object_0,
    security_requirement_object_1,
    security_requirement_object_2,
)



class RequestQueryParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'status': typing.Union[parameter_0.Parameter0.schema, list, tuple],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = (
        parameter_0.Parameter0,
    )
_security: typing.List[security_schemes.SecurityRequirementObject] = [
    security_requirement_object_0.security_requirement_object,
    security_requirement_object_1.security_requirement_object,
    security_requirement_object_2.security_requirement_object,
]


__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '200': typing.Type[response_200.ResponseFor200],
        '400': typing.Type[response_400.ResponseFor400],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '200': response_200.ResponseFor200,
    '400': response_400.ResponseFor400,
}

_all_accept_content_types = (
    "application/xml",
    "application/json",
)


class BaseApi(api_client.Api):
    @typing.overload
    def _find_pets_by_status(
        self,
        query_params: RequestQueryParameters.Params,
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = False
    ) -> response_200.ResponseFor200.response_cls: ...

    @typing.overload
    def _find_pets_by_status(
        self,
        query_params: RequestQueryParameters.Params,
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[True] = ...
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _find_pets_by_status(
        self,
        query_params: RequestQueryParameters.Params,
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: bool = False
    ):
        """
        Finds Pets by status
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs(RequestQueryParameters.Params, query_params)
        used_path = self._get_used_path(
            path,
            query_parameters=RequestQueryParameters.parameters,
            query_params=query_params
        )
        _headers = self._get_headers(accept_content_types=accept_content_types)
        # TODO add cookie handling
        host = self.api_client.configuration.get_server_url(
            'paths/' + path + '/servers', server_index
        )
        security_requirement_object = self.api_client.configuration.get_security_requirement_object(
            'paths/' + path + '/get/security',
            _security,
            security_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='get',
            host=host,
            headers=_headers,
            security_requirement_object=security_requirement_object,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        else:
            status = str(raw_response.status)
            if status in _status_code_to_response:
                status = typing.cast(
                    typing_extensions.Literal[
                    '200',
                    '400',
                    ],
                    status
                )
                response = _status_code_to_response[status].deserialize(
                    raw_response, self.api_client.schema_configuration)
            else:
                response = api_response.ApiResponseWithoutDeserialization(response=raw_response)

        self._verify_response_status(response)

        return response


class FindPetsByStatus(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    find_pets_by_status = BaseApi._find_pets_by_status


class ApiForGet(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    get = BaseApi._find_pets_by_status
