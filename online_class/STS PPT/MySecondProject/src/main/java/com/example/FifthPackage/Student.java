package com.example.FifthPackage;

public class Student {
	private int roll_number;
	private String name;
	private String email;
	private String course;
	private String dob;
	private long number;
	public Student(int roll_number, String name, String email, String course, String dob, long number) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		this.email = email;
		this.course = course;
		this.dob = dob;
		this.number = number;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", email=" + email + ", course=" + course
				+ ", dob=" + dob + ", number=" + number + "]";
	}

	
}
