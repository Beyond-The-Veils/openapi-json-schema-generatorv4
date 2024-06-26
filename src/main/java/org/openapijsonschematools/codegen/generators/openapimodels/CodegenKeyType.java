package org.openapijsonschematools.codegen.generators.openapimodels;

public enum CodegenKeyType {
    SCHEMA,
    PATH,
    MISC, // content-type, operation method
    CONTENT_TYPE,
    OPERATION,
    PARAMETER,
    REQUEST_BODY,
    HEADER,
    RESPONSE,
    SECURITY_SCHEME,
    SERVER,
    SECURITY
}
