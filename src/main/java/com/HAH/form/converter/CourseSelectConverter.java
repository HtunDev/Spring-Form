package com.HAH.form.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.HAH.form.model.dto.Course;
import com.HAH.form.model.service.CourseRepo;

@Component
public class CourseSelectConverter implements Converter<String, Course> {
	
	@Autowired
	CourseRepo courseRepo;

	@Override
	public Course convert(String value) {
		
		if(StringUtils.hasLength(value)) {
			var id = Integer.parseInt(value);
			return courseRepo.findById(id);
		}
		
		return null;
	}
	
	
}
