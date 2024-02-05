package com.example.FourthPackage;

public class Student {
	private int sl_no;
	private String name;
	private String email;
	public Student(int sl_no, String name, String email) {
		super();
		this.sl_no = sl_no;
		this.name = name;
		this.email = email;
	}
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
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
		return "Student [sl_no=" + sl_no + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
