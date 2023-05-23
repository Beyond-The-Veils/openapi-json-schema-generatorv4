# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class FormatTest(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        required = {
            "byte",
            "date",
            "number",
            "password",
        }
        
        class Properties:
            
            
            class Integer(
                schemas.IntSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'int'
                    inclusive_maximum = 100
                    inclusive_minimum = 10
                    multiple_of = 2
            Int32: typing_extensions.TypeAlias = schemas.Int32Schema[U]
            
            
            class Int32withValidations(
                schemas.Int32Schema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'int32'
                    inclusive_maximum = 200
                    inclusive_minimum = 20
            Int64: typing_extensions.TypeAlias = schemas.Int64Schema[U]
            
            
            class Number(
                schemas.NumberSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        decimal.Decimal,
                    }
                    inclusive_maximum = 543.2
                    inclusive_minimum = 32.1
                    multiple_of = 32.5
            
            
            class _Float(
                schemas.Float32Schema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'float'
                    inclusive_maximum = 987.6
                    inclusive_minimum = 54.3
            Float32: typing_extensions.TypeAlias = schemas.Float32Schema[U]
            
            
            class Double(
                schemas.Float64Schema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'double'
                    inclusive_maximum = 123.4
                    inclusive_minimum = 67.8
            Float64: typing_extensions.TypeAlias = schemas.Float64Schema[U]
            
            
            class ArrayWithUniqueItems(
                schemas.ListSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {tuple}
                    unique_items = True
                    Items: typing_extensions.TypeAlias = schemas.NumberSchema[U]
            
                def __new__(
                    cls,
                    arg_: typing.Union[
                        typing.Tuple[
                            typing.Union[Schema_.Items, decimal.Decimal, int, float], ...
                        ],
                        typing.List[
                            typing.Union[Schema_.Items, decimal.Decimal, int, float]
                        ],
                    ],
                    configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
                ) -> FormatTest.Schema_.Properties.ArrayWithUniqueItems[tuple]:
                    inst = super().__new__(
                        cls,
                        arg_,
                        configuration_=configuration_,
                    )
                    inst = typing.cast(
                        FormatTest.Schema_.Properties.ArrayWithUniqueItems[tuple],
                        inst
                    )
                    return inst
            
                def __getitem__(self, name: int) -> Schema_.Items[decimal.Decimal]:
                    return super().__getitem__(name)
            
            
            class String(
                schemas.StrSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    regex={
                        'pattern': r'[a-z]',  # noqa: E501
                        'flags': re.I,
                    }
            Byte: typing_extensions.TypeAlias = schemas.StrSchema[U]
            Binary: typing_extensions.TypeAlias = schemas.BinarySchema[U]
            Date: typing_extensions.TypeAlias = schemas.DateSchema[U]
            DateTime: typing_extensions.TypeAlias = schemas.DateTimeSchema[U]
            Uuid: typing_extensions.TypeAlias = schemas.UUIDSchema[U]
            UuidNoExample: typing_extensions.TypeAlias = schemas.UUIDSchema[U]
            
            
            class Password(
                schemas.StrSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    format = 'password'
                    max_length = 64
                    min_length = 10
            
            
            class PatternWithDigits(
                schemas.StrSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    regex={
                        'pattern': r'^\d{10}$',  # noqa: E501
                    }
            
            
            class PatternWithDigitsAndDelimiter(
                schemas.StrSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    regex={
                        'pattern': r'^image_\d{1,3}$',  # noqa: E501
                        'flags': re.I,
                    }
            NoneProp: typing_extensions.TypeAlias = schemas.NoneSchema[U]
            __annotations__ = {
                "integer": Integer,
                "int32": Int32,
                "int32withValidations": Int32withValidations,
                "int64": Int64,
                "number": Number,
                "float": _Float,
                "float32": Float32,
                "double": Double,
                "float64": Float64,
                "arrayWithUniqueItems": ArrayWithUniqueItems,
                "string": String,
                "byte": Byte,
                "binary": Binary,
                "date": Date,
                "dateTime": DateTime,
                "uuid": Uuid,
                "uuidNoExample": UuidNoExample,
                "password": Password,
                "pattern_with_digits": PatternWithDigits,
                "pattern_with_digits_and_delimiter": PatternWithDigitsAndDelimiter,
                "noneProp": NoneProp,
            }
    
    @property
    def byte(self) -> Schema_.Properties.Byte[str]:
        return self.__getitem__("byte")
    
    @property
    def date(self) -> Schema_.Properties.Date[str]:
        return self.__getitem__("date")
    
    @property
    def number(self) -> Schema_.Properties.Number[decimal.Decimal]:
        return self.__getitem__("number")
    
    @property
    def password(self) -> Schema_.Properties.Password[str]:
        return self.__getitem__("password")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["byte"]) -> Schema_.Properties.Byte[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> Schema_.Properties.Date[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> Schema_.Properties.Number[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> Schema_.Properties.Password[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["integer"]) -> Schema_.Properties.Integer[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32"]) -> Schema_.Properties.Int32[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32withValidations"]) -> Schema_.Properties.Int32withValidations[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int64"]) -> Schema_.Properties.Int64[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float"]) -> Schema_.Properties._Float[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float32"]) -> Schema_.Properties.Float32[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["double"]) -> Schema_.Properties.Double[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float64"]) -> Schema_.Properties.Float64[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["arrayWithUniqueItems"]) -> Schema_.Properties.ArrayWithUniqueItems[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string"]) -> Schema_.Properties.String[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["binary"]) -> Schema_.Properties.Binary[typing.Union[bytes, schemas.FileIO]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dateTime"]) -> Schema_.Properties.DateTime[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuid"]) -> Schema_.Properties.Uuid[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuidNoExample"]) -> Schema_.Properties.UuidNoExample[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pattern_with_digits"]) -> Schema_.Properties.PatternWithDigits[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pattern_with_digits_and_delimiter"]) -> Schema_.Properties.PatternWithDigitsAndDelimiter[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["noneProp"]) -> Schema_.Properties.NoneProp[schemas.NoneClass]: ...
    
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
            typing_extensions.Literal["byte"],
            typing_extensions.Literal["date"],
            typing_extensions.Literal["number"],
            typing_extensions.Literal["password"],
            typing_extensions.Literal["integer"],
            typing_extensions.Literal["int32"],
            typing_extensions.Literal["int32withValidations"],
            typing_extensions.Literal["int64"],
            typing_extensions.Literal["float"],
            typing_extensions.Literal["float32"],
            typing_extensions.Literal["double"],
            typing_extensions.Literal["float64"],
            typing_extensions.Literal["arrayWithUniqueItems"],
            typing_extensions.Literal["string"],
            typing_extensions.Literal["binary"],
            typing_extensions.Literal["dateTime"],
            typing_extensions.Literal["uuid"],
            typing_extensions.Literal["uuidNoExample"],
            typing_extensions.Literal["pattern_with_digits"],
            typing_extensions.Literal["pattern_with_digits_and_delimiter"],
            typing_extensions.Literal["noneProp"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        byte: typing.Union[Schema_.Properties.Byte, str],
        date: typing.Union[Schema_.Properties.Date, str, datetime.date],
        number: typing.Union[Schema_.Properties.Number, decimal.Decimal, int, float],
        password: typing.Union[Schema_.Properties.Password, str],
        integer: typing.Union[Schema_.Properties.Integer, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        int32: typing.Union[Schema_.Properties.Int32, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        int32withValidations: typing.Union[Schema_.Properties.Int32withValidations, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        int64: typing.Union[Schema_.Properties.Int64, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        float32: typing.Union[Schema_.Properties.Float32, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        double: typing.Union[Schema_.Properties.Double, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        float64: typing.Union[Schema_.Properties.Float64, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        arrayWithUniqueItems: typing.Union[Schema_.Properties.ArrayWithUniqueItems, list, tuple, schemas.Unset] = schemas.unset,
        string: typing.Union[Schema_.Properties.String, str, schemas.Unset] = schemas.unset,
        binary: typing.Union[Schema_.Properties.Binary, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        dateTime: typing.Union[Schema_.Properties.DateTime, str, datetime.datetime, schemas.Unset] = schemas.unset,
        uuid: typing.Union[Schema_.Properties.Uuid, str, uuid.UUID, schemas.Unset] = schemas.unset,
        uuidNoExample: typing.Union[Schema_.Properties.UuidNoExample, str, uuid.UUID, schemas.Unset] = schemas.unset,
        pattern_with_digits: typing.Union[Schema_.Properties.PatternWithDigits, str, schemas.Unset] = schemas.unset,
        pattern_with_digits_and_delimiter: typing.Union[Schema_.Properties.PatternWithDigitsAndDelimiter, str, schemas.Unset] = schemas.unset,
        noneProp: typing.Union[Schema_.Properties.NoneProp, None, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> FormatTest[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            byte=byte,
            date=date,
            number=number,
            password=password,
            integer=integer,
            int32=int32,
            int32withValidations=int32withValidations,
            int64=int64,
            float32=float32,
            double=double,
            float64=float64,
            arrayWithUniqueItems=arrayWithUniqueItems,
            string=string,
            binary=binary,
            dateTime=dateTime,
            uuid=uuid,
            uuidNoExample=uuidNoExample,
            pattern_with_digits=pattern_with_digits,
            pattern_with_digits_and_delimiter=pattern_with_digits_and_delimiter,
            noneProp=noneProp,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            FormatTest[frozendict.frozendict],
            inst
        )
        return inst
