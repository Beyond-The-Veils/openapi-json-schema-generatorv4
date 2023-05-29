# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class Schema(
    schemas.ListSchema[schemas.T]
):


    class Schema_:
        types = {tuple}
        
        
        class Items(
            schemas.StrSchema[schemas.T]
        ):
        
        
            class Schema_:
                types = {
                    str,
                }
                default = "$"
                enum_value_to_name = {
                    ">": "GREATER_THAN_SIGN",
                    "$": "DOLLAR_SIGN",
                }
            
            @schemas.classproperty
            def GREATER_THAN_SIGN(cls):
                return cls(">") # type: ignore
            
            @schemas.classproperty
            def DOLLAR_SIGN(cls):
                return cls("$") # type: ignore

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                Schema_.Items[str],
                str
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> Schema[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            Schema[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> Schema_.Items[str]:
        return super().__getitem__(name)
