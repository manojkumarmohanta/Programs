package com.example.FirsrPackage;

public class Student {
	private int sid;
	private String sname;
	private String gender;
	private String course;
	
	public Student(int sid, String sname, String gender, String course) {
		super();
		// TODO Auto-generated constructor stub
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", course=" + course + "]";
	}
	
	
}
