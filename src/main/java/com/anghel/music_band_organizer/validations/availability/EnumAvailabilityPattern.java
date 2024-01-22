package com.anghel.music_band_organizer.validations.availability;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EnumAvailabilityPatternValidator.class)
public @interface EnumAvailabilityPattern {

    String[] anyOf();

    String message() default "Must not be null and one of the following: PUBLIC, PRIVATE.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
