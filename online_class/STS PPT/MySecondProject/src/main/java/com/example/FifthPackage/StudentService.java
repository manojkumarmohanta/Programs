package com.example.FifthPackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	static private ArrayList<Student> Students = new ArrayList<Student>();
	static {
		Students.add(new Student(10,"manoj","manoj@gmail.com","MCA","11-06-2001",9937446431L));
	}
	
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return Students;
	}

}
