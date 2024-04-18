package com.HAH.form.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UserInput {

	private int id;
	private String name;
	private String phone;
	private String email;
	private String password;
	private Course course;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate registrationDate;
	private Gender gender;
	private String[] foundation;
	private boolean agree;
	private String remark;

	public enum Gender {
		Male, Female
	}
}
