package com.example.webApplicationStudentDemo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(101,"Rahul","rahul@gamil.com","9937505134","02-04-2001"));
		repository.save(new Student(102,"balaram","balaram@gamil.com","9937505134","02-04-2001"));
		repository.save(new Student(103,"jena","jena@gamil.com","9937505134","02-04-2001"));
		repository.save(new Student(104,"jena","jena@gamil.com","9937505134","02-04-2001"));
		repository.save(new Student(105,"jena","jena@gamil.com","9937505134","02-04-2001"));
		repository.save(new Student(106,"jena","jena@gamil.com","9937505134","02-04-2001"));
	}

	public List<Student>retriveAllStudent(){
		return repository.findAll();
	}
	public Student retreiveStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	public void storeStudent(Student student) {
		repository.save(student);
	}
	public void deleteStudentByid(int id) {
		repository.deleteById(id);
	}
}
