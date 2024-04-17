package com.HAH.form.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.HAH.form.model.UserInput;

@Service
@ApplicationScope
public class DataHolder {

	private List<UserInput> repo;
	
	public DataHolder() {
		repo = new ArrayList<>();
	}
	
	public void add(UserInput userInput) {
		repo.add(userInput);
	}
	
	public List<UserInput> getAllData() {
		return new ArrayList<>(repo);
	}
}
