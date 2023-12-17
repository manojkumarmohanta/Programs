package com.example.SecondPackage;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	@GetMapping("/getstudents")
	public List<Student> getAllStudent(){
		return service.getAll();
	}
	@GetMapping("/getstudent/{roll_number}")
	public Student getStudent(@PathVariable int roll_number) {
		return service.getById(roll_number);
	}
	
}
