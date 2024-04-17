package com.HAH.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.HAH.form.model.UserInput;
import com.HAH.form.model.UserInput.Gender;

@Controller
@RequestMapping("form")
public class FormController {
	
	@Autowired
	private DataHolder dataHolder;

	@GetMapping
	void index() {

	}
	
	@PostMapping
	String create(@ModelAttribute("userInput") UserInput userInput) {
		dataHolder.add(userInput);
		return "redirect:/form";
	}
	
	@ModelAttribute("lists")
	List<UserInput> getAllUserInputs(){
		return dataHolder.getAllData();
	}

	@ModelAttribute("userInput")
	public UserInput getUserInput() {
		return new UserInput();
	}

	@ModelAttribute("courses")
	public List<String> getCourses() {
		return List.of("Java Basic", "Spring Framework", "Angular", "React", "DevOps");
	}

	@ModelAttribute("genders")
	public Gender[] getGenders() {
		return Gender.values();
	}

	@ModelAttribute("knowledges")
	public List<String> getFoundation() {
		return List.of("Html", "CSS", "JavaScript", "MySQL");
	}

}
