package com.rajtech.studentweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rajtech.studentweb.bindings.Student;
import com.rajtech.studentweb.entities.StudentEntity;
import com.rajtech.studentweb.repositories.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository repo;
	
	@GetMapping("/") // http://localhost:8081
	public String loadStudentForm(Model model) {
		loadStudentFormData(model);
		return "addStudent";
	}
	
	private void loadStudentFormData(Model model) {
		List<String> coursesList = new ArrayList<>();
		coursesList.add("Java Full Stack");
		coursesList.add("Python Full Stack");
		coursesList.add("UI Full Stack");
		coursesList.add("Data Science");
		List<String> timingsList = new ArrayList<>();
		timingsList.add("9AM to 11AM");
		timingsList.add("11AM to 1PM");
		timingsList.add("2PM to 4PM");
		timingsList.add("4PM to 6PM");
		timingsList.add("6PM to 8PM");
		Student student = new Student();
		model.addAttribute("courses",coursesList);
		model.addAttribute("timings",timingsList);
		model.addAttribute("student",student);			
 
	}
	
	@PostMapping("/save")
	public String handleSubmit(Student stud, Model model) {
		StudentEntity studentEntity = new StudentEntity();
		BeanUtils.copyProperties(stud, studentEntity);
		studentEntity.setPreferredTimings(Arrays.toString(stud.getPreferredTimings()));
		repo.save(studentEntity);
		model.addAttribute("msg","Student Inserted");
		loadStudentFormData(model); 
		return "addStudent";
	}

}
