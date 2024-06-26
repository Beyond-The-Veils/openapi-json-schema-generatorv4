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

public class MinitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testExactLengthIsValidPasses() throws ValidationException {
        // exact length is valid
        final var schema = MinitemsValidation.MinitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresNonArraysPasses() throws ValidationException {
        // ignores non-arrays
        final var schema = MinitemsValidation.MinitemsValidation1.getInstance();
        schema.validate(
            "",
            configuration
        );
    }

    @Test
    public void testLongerIsValidPasses() throws ValidationException {
        // longer is valid
        final var schema = MinitemsValidation.MinitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void testTooShortIsInvalidFails() {
        // too short is invalid
        final var schema = MinitemsValidation.MinitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
