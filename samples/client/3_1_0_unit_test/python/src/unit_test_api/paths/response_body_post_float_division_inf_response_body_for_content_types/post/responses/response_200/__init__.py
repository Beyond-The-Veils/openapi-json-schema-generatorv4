# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from unit_test_api.shared_imports.response_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .content.application_json import schema as application_json_schema


@dataclasses.dataclass(frozen=True)
class ApiResponse(api_response.ApiResponse):
    body: int
    headers: schemas.Unset


class ResponseFor200(api_client.OpenApiResponse[ApiResponse]):
    @classmethod
    def get_response(cls, response, headers, body) -> ApiResponse:
        return ApiResponse(response=response, body=body, headers=headers)


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_json_schema.Schema2
    content = {
        'application/json': ApplicationJsonMediaType,
    }
