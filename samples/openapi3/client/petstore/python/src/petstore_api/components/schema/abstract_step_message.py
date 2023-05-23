# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class AbstractStepMessage(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Abstract Step
    """


    class Schema_:
        types = {
            frozendict.frozendict,
        }
        required = {
            "description",
            "discriminator",
            "sequenceNumber",
        }
        
        @staticmethod
        def discriminator():
            return {
                'discriminator': {
                    'AbstractStepMessage': AbstractStepMessage,
                }
            }
        
        class Properties:
            Discriminator: typing_extensions.TypeAlias = schemas.StrSchema[U]
            __annotations__ = {
                "discriminator": Discriminator,
            }
        
        class AnyOf:
        
            @staticmethod
            def _0() -> typing.Type[AbstractStepMessage]:
                return AbstractStepMessage
            classes = [
                _0,
            ]

    
    @property
    def description(self) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]:
        return self.__getitem__("description")
    
    @property
    def discriminator(self) -> Schema_.Properties.Discriminator[str]:
        return self.__getitem__("discriminator")
    
    @property
    def sequenceNumber(self) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]:
        return self.__getitem__("sequenceNumber")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["discriminator"]) -> Schema_.Properties.Discriminator[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sequenceNumber"]) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["description"],
            typing_extensions.Literal["discriminator"],
            typing_extensions.Literal["sequenceNumber"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        description: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader],
        discriminator: typing.Union[Schema_.Properties.Discriminator, str],
        sequenceNumber: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> AbstractStepMessage[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            description=description,
            discriminator=discriminator,
            sequenceNumber=sequenceNumber,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            AbstractStepMessage[frozendict.frozendict],
            inst
        )
        return inst
