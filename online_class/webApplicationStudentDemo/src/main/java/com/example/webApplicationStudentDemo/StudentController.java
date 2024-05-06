package com.example.webApplicationStudentDemo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/student")
	public String getStudent(@RequestParam int id, Model model) {
		Student student = service.retreiveStudentById(id);
		model.addAttribute("Studentdetail", student);
		return "sample";
	}

	@GetMapping("/addStudent")
	public String addPage(Model model) {
		model.addAttribute("student", new Student());
		return "update";
	}

	@GetMapping("/students")
	public String getAllStudent(Model model) {
		List<Student> student = service.retriveAllStudent();
		model.addAttribute("students", student);
		return "/index";
	}

	@GetMapping("/showFormUpdate/{id}")
	public String showUpdateForm(@PathVariable int id, Model model) {
		Student student = service.retreiveStudentById(id);
		model.addAttribute("student", student);
		return "update";
	}

	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("student") Student student) {
		System.out.println(student);
		service.storeStudent(student);
		return "redirect:/";
	}

	@GetMapping("/deleteStudent/{id}")
	public String saveStudent(@PathVariable int id) {
		service.deleteStudentByid(id);
		return "redirect:/";
	}

	@GetMapping("/welcome")
	public String welcomePage() {

		return "welcome";
	}
	@GetMapping("/")
	public String StudentDashboard() {

		return "/test/Dashboard";
	}
	@GetMapping("/reports")
	public String StudentRreports() {

		return "/test/Reports";
	}
	@GetMapping("/settings")
	public String StudentSettings() {

		return "/test/Settings";
	}
}
