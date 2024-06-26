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

public class UriFormatTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testAllStringFormatsIgnoreIntegersPasses() throws ValidationException {
        // all string formats ignore integers
        final var schema = UriFormat.UriFormat1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreNullsPasses() throws ValidationException {
        // all string formats ignore nulls
        final var schema = UriFormat.UriFormat1.getInstance();
        schema.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreObjectsPasses() throws ValidationException {
        // all string formats ignore objects
        final var schema = UriFormat.UriFormat1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreFloatsPasses() throws ValidationException {
        // all string formats ignore floats
        final var schema = UriFormat.UriFormat1.getInstance();
        schema.validate(
            13.7d,
            configuration
        );
    }

    @Test
    public void testInvalidUriStringIsOnlyAnAnnotationByDefaultPasses() throws ValidationException {
        // invalid uri string is only an annotation by default
        final var schema = UriFormat.UriFormat1.getInstance();
        schema.validate(
            "//foo.bar/?baz=qux#quux",
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreArraysPasses() throws ValidationException {
        // all string formats ignore arrays
        final var schema = UriFormat.UriFormat1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreBooleansPasses() throws ValidationException {
        // all string formats ignore booleans
        final var schema = UriFormat.UriFormat1.getInstance();
        schema.validate(
            false,
            configuration
        );
    }
}
