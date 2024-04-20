package com.HAH.form.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class PhoneConstraint implements ConstraintValidator<Phone, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(StringUtils.hasLength(value)) {
			return value.matches("09(- \\d{3}){3}");
		}
		
		return false;
	}

}
