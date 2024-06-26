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
	@NotBlank(message = "{empty.student.name}")
	private String name;
	@Phone(message = "Require Phone Number!")
	private String phone;
	@Email
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
