package com.example.ThirdPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	static private ArrayList<Student> Students = new ArrayList<Student>();
	static {
		Students.add(new Student("manoj","MCA",2022));
		Students.add(new Student("raj","MCA",2022));
		Students.add(new Student("jyoti","MCA",2022));
		Students.add(new Student("ranjan","MCA",2022));
		Students.add(new Student("ashish","MCA",2022));
		Students.add(new Student("shiba","MCA",2022));
		Students.add(new Student("sandy","MCA",2022));
		Students.add(new Student("monalisha","MCA",2022));
		
	}
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return Students;
	}
	public Student getById(String name) {
		
		Predicate<? super Student> predicate = (Student) -> Student.getName() == name;
		// TODO Auto-generated method stub
		return Students.stream().filter(predicate ).findFirst().get();
	}

}