package com.HAH.form.root.dto;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UserInput {

	private int id;
	@NotBlank(message = "Please Enter Name")
	private String name;
	@Pattern(regexp = "09(-\\d{4}){2}", message = "Invalid Phone Number")
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
