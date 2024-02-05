package com.example.FirsrPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	//static int sid = 100;
	static private ArrayList<Student> Students = new ArrayList<Student>();
	static {
		Students.add(new Student(10,"manoj","male","MCA"));
		Students.add(new Student(11,"balaram","male","MCA"));
		Students.add(new Student(12,"archana","female","MCA"));
		Students.add(new Student(13,"snehansu","male","MCA"));
		Students.add(new Student(14,"prabin","male","MCA"));
	}
	
	public List<Student> getAll(){
		return Students;
	}

	public Student getById(int sid) {
		Predicate <? super Student> predicate = (Student) -> Student.getSid() == sid;
		// TODO Auto-generated method stub
		return Students.stream().filter(predicate).findFirst().get();
	}
}
