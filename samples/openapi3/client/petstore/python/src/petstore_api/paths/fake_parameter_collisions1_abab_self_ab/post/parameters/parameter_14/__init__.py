# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.header_imports import *

from . import schema


class Parameter14(api_client.CookieParameter):
    name = "1"
    style = api_client.ParameterStyle.FORM
    schema: typing_extensions.TypeAlias = schema.Schema[str]
    explode = True
