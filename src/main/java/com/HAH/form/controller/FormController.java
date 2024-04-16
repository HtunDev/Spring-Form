package com.HAH.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HAH.form.model.UserInput;

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

}
