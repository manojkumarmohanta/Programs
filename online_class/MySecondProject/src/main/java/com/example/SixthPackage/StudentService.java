package com.example.SixthPackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	static private ArrayList<Student> Students = new ArrayList<Student>();
	static {
		Students.add(new Student(1010,"manoj","manoj@gmail.com"));
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return Students;
	}

}
