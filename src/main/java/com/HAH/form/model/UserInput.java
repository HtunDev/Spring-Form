package com.HAH.form.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserInput {

	private int id;
	private String name;
	private String phone;
	private String email;
	private String password;
	private String course;
	private LocalDate registrationDate;
	private Gender gender;
	private String[] foundation;
	private boolean agree;
	private String remark;

	public enum Gender {
		Male, Female
	}
}
