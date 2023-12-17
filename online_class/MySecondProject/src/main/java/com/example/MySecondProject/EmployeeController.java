package com.example.MySecondProject;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return service.getAll();
	}
	@GetMapping("/employee/{eid}")
	public Employee getEmployee(@PathVariable int eid) {
		return service.getById(eid);
	}
	
}
