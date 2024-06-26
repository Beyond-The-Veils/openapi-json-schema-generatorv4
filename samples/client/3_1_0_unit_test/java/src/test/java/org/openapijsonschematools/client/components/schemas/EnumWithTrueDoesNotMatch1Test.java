package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class EnumWithTrueDoesNotMatch1Test {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testFloatOneIsInvalidFails() {
        // float one is invalid
        final var schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance();
        try {
            schema.validate(
                1.0d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIntegerOneIsInvalidFails() {
        // integer one is invalid
        final var schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance();
        try {
            schema.validate(
                1,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testTrueIsValidPasses() throws ValidationException {
        // true is valid
        final var schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance();
        schema.validate(
            true,
            configuration
        );
    }
}
