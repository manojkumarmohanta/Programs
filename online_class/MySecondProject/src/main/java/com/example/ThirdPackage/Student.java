package com.example.ThirdPackage;

public class Student {
	private String name;
	private String course;
	private int addmission;
	public Student(String name, String course, int addmission) {
		super();
		this.name = name;
		this.course = course;
		this.addmission = addmission;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAddmission() {
		return addmission;
	}
	public void setAddmission(int addmission) {
		this.addmission = addmission;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", addmission=" + addmission + "]";
	}
	
	
}
