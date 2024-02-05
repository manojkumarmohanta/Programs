package com.example.SecondPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	static private ArrayList<Student> Students = new ArrayList<Student>();
	static {
		Students.add(new Student(56,"manoj kumar","jajpur",9937446451L));
		Students.add(new Student(56,"sunil kumar","bhubaneswar",9937446451L));
		Students.add(new Student(56,"anil kumar","cuttack",9937446451L));
		Students.add(new Student(56,"ranbir kumar","jajpur",9937766451L));
		Students.add(new Student(56,"dev kumar","khordha",9938446451L));
		Students.add(new Student(56,"raj kumar","mayurbhanj",9937446651L));
		Students.add(new Student(56,"pares kumar","paradip",9937448951L));
		Students.add(new Student(56,"nares kumar","bhubaneswar",9937226451L));
		
	}
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return Students;
	}
	public Student getById(int roll_number) {
		Predicate<? super Student> predicate = (Student) -> Student.getRoll_number()==roll_number;
		// TODO Auto-generated method stub
		return Students.stream().filter(predicate ).findFirst().get();
	}

}
