package com.example.ThirdPackage;

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
	
	@GetMapping("/displayStudents")
	public List<Student> getAllStudent(){
		return service.getAll();
	}
	@GetMapping("/displayStudent/{name}")
	public Student getStudent(@PathVariable String name) {
		return service.getById(name);
	}
}
