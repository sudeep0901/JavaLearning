package com.sudeep.annotations;

@Customer_annotation(anno = "Sudeep Annotation")
public class Employee {
	
	private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + "]";
	}
	private String lname;
	
}
