# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *


class RefInItems(
    schemas.ListSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {tuple}
        
        @staticmethod
        def items() -> typing.Type[property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference]:
            return property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]],
                dict,
                frozendict.frozendict,
                str,
                datetime.date,
                datetime.datetime,
                uuid.UUID,
                int,
                float,
                decimal.Decimal,
                bool,
                None,
                list,
                tuple,
                bytes,
                io.FileIO,
                io.BufferedReader
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> RefInItems[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            RefInItems[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]:
        return super().__getitem__(name)

from unit_test_api.components.schema import property_named_ref_that_is_not_a_reference
