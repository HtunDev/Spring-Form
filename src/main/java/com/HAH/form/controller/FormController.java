package com.HAH.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HAH.form.converter.CourseSelectConverter;
import com.HAH.form.model.dto.Course;
import com.HAH.form.model.dto.UserInput;
import com.HAH.form.model.dto.UserInput.Gender;
import com.HAH.form.model.service.CourseRepo;
import com.HAH.form.model.service.DataHolder;

@Controller
@RequestMapping("form")
public class FormController {
	
	@Autowired
	private DataHolder dataHolder;
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Autowired
	private CourseSelectConverter converter;

	@GetMapping
	void index() {
		
	}
	
	@InitBinder
	void initWebBinder(WebDataBinder binder) {
		
		if(binder.getConversionService() instanceof ConfigurableConversionService registry) {
			registry.addConverter(converter);
			System.out.println("Converter Registration");
		}
		
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
	
	@ModelAttribute("courses")
	List<Course> getCourses(){
		return courseRepo.getCourses();
	}

	@ModelAttribute("userInput")
	public UserInput getUserInput() {
		return new UserInput();
	}

//	@ModelAttribute("courses")
//	public List<String> getCourses() {
//		return List.of("Java Basic", "Spring Framework", "Angular", "React", "DevOps");
//	}

	@ModelAttribute("genders")
	public Gender[] getGenders() {
		return Gender.values();
	}

	@ModelAttribute("knowledges")
	public List<String> getFoundation() {
		return List.of("Html", "CSS", "JavaScript", "MySQL");
	}

}
