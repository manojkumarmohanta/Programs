package com.example.FirsrPackage;

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


	@GetMapping("/allstudents")
	public List<Student> getAllStudent(){
		return service.getAll();
	}
	@GetMapping("/student/{sid}")
	public Student getStudent(@PathVariable int sid) {
		return service.getById(sid);
	}
	
}
