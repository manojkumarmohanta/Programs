package com.example.MyFirstProject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
static int sid=100;
static private ArrayList<Student> students = new ArrayList<Student>();
static {
	students.add(new Student(++sid,"Rahul","rahul@gmail.com"));
	students.add(new Student(++sid,"Balram","balram@gmail.com"));
	students.add(new Student(++sid,"Shivraj","shivraj@gmail.com"));
	students.add(new Student(++sid,"Satruit","satru@gmail.com"));
}
public List<Student> getAll() {
	
	return students;
}
public Student getById(int id) {
	Predicate<? super Student> predicate = 
			(student) -> student.getId()==id;
	// TODO Auto-generated method stub
	return students.stream().filter(predicate).findFirst().get();
}
public void store(Student s) {
	s.setId(++sid);
	students.add(s);
}
public boolean deleteById(int id) {

	Predicate<? super Student> predicate = (student)-> student.getId()==id;
	return students.removeIf(predicate );

}
public List<Student> retrieveAllStudent() {
	// TODO Auto-generated method stub
	return null;
}
public Student retrieveById(int id) {
	// TODO Auto-generated method stub
	return null;
}
public void insertStudent(Student student) {
	// TODO Auto-generated method stub
	
}
public Student removeById(int id) {
	// TODO Auto-generated method stub
	return null;
}

}
