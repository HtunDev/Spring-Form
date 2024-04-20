package com.HAH.form.mvc.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = PhoneConstraint.class)
public @interface Phone {

	String message() default "Invalid Phone Number";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
