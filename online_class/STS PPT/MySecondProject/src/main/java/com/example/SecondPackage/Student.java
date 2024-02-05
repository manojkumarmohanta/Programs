package com.example.SecondPackage;

public class Student {
	private int roll_number;
	private String full_name;
	private String address;
	private long mobile_number;
	public Student(int roll_number, String full_name, String address, long mobile_number) {
		super();
		this.roll_number = roll_number;
		this.full_name = full_name;
		this.address = address;
		this.mobile_number = mobile_number;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", full_name=" + full_name + ", address=" + address
				+ ", mobile_number=" + mobile_number + "]";
	}

	
}
