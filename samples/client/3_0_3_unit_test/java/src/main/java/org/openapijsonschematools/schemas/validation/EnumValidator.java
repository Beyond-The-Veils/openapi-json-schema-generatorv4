package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

import java.util.Set;

public class EnumValidator implements KeywordValidator {
    public final Set<Object> enumValues;

    public EnumValidator(Set<Object> enumValues) {
        this.enumValues = enumValues;
    }

    @Override
    public Object getConstraint() {
        return enumValues;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (enumValues.isEmpty()) {
            throw new ValidationException("No value can match enum because enum is empty");
        }
        if (!enumValues.contains(arg)) {
            throw new ValidationException("Invalid value "+arg+" was not one of the allowed enum "+enumValues);
        }
        return null;
    }
}
