package com.example.MySecondProject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	static int eid = 200;
	static private ArrayList<Employee> Employees = new ArrayList<Employee>();
	
	static {
		Employees.add(new Employee(++eid,"rahul","rahul@gmial.com"));
		Employees.add(new Employee(++eid,"manoj","manoj@gmial.com"));
		Employees.add(new Employee(++eid,"soraj","soraj@gmial.com"));
		Employees.add(new Employee(++eid,"devi","devi@gmial.com"));
		Employees.add(new Employee(++eid,"rohan","rohan@gmial.com"));
		Employees.add(new Employee(++eid,"kiran","kiran@gmial.com"));
		Employees.add(new Employee(++eid,"ranjan","ranjan@gmial.com"));
		Employees.add(new Employee(++eid,"sandy","sandy@gmial.com"));
		Employees.add(new Employee(++eid,"mahan","mahan@gmial.com"));
		Employees.add(new Employee(++eid,"mistri","mistri@gmial.com"));
	}
	
	
	public List<Employee> getAll(){
		return Employees;
	}
	public Employee getById(int eid) {
		Predicate<? super Employee> predicate =(Employee) -> Employee.getEid()==eid;
		return Employees.stream().filter(predicate).findFirst().get();
	}
	
}
