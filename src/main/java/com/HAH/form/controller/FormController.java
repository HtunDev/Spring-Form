package com.HAH.form.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HAH.form.model.UserInput;
import com.HAH.form.model.UserInput.Gender;

@Controller
@RequestMapping("form")
public class FormController {

	@GetMapping
	void index() {

	}

	@ModelAttribute("userInput")
	public UserInput getUserInput() {
		return new UserInput();
	}
	
	@ModelAttribute("courses")
	public List<String> getCourses(){
		return List.of("Java Basic","Spring Framework","Angular","React","DevOps");
	}
	
	@ModelAttribute("genders")
	public Gender[] getGenders() {
		return Gender.values();
	}
	
	@ModelAttribute("knowledges")
	public List<String> getFoundation(){
		return List.of("Html","CSS","JavaScript","MySQL");
	}

}
