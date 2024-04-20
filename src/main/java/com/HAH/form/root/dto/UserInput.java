package com.HAH.form.root.dto;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.HAH.form.mvc.validator.Phone;

import lombok.Data;

@Data
public class UserInput {

	private int id;
	@NotBlank
	private String name;
	@Phone
	private String phone;
	@Email(message = "Invalid Email Address")
	private String email;
	private String password;
	@NotNull(message = "Pls select course")
	private Course course;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate registrationDate;
	private Gender gender;
	private String[] foundation;
	@AssertTrue(message = "You have need to agree the rules.")
	private boolean agree;
	private String remark;

	public enum Gender {
		Male, Female
	}
}
