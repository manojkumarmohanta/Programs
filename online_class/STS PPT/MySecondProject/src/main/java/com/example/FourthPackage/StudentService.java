package com.example.FourthPackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	static private ArrayList<Student> Students = new ArrayList<Student>();
	
	static {
		Students.add(new Student(101,"manoj","manoj@gmail.com"));
	}

	public List<Student> getALl() {
		// TODO Auto-generated method stub
		return Students;
	}

}
