package com.HAH.form.root.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.HAH.form.root.dto.UserInput;

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
