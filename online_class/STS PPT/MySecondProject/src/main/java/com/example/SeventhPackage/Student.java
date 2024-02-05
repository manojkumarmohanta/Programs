package com.example.SeventhPackage;

public class Student {
	private int slno;
	private String name;
	private String email;
	public Student(int slno, String name, String email) {
		super();
		this.slno = slno;
		this.name = name;
		this.email = email;
	}
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
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
	@Override
	public String toString() {
		return "Student [slno=" + slno + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
