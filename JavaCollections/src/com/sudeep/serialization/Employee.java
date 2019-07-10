package com.sudeep.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

 public class Employee implements Serializable {
	
//	@Override
//	public String toString() {
//		return "Employee [fname=" + fname + ", lname=" + lname + "]";
//	}
	 
	 
//	maintaining compatibility using  serialVersionUID  to handle any changs in class
	private static final long serialVersionUID = -7803557752185109775L;
	private transient String city;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String fname;
	@Override
	public String toString() {
		return "Employee [city=" + city + ", fname=" + fname + ", lname="
				+ lname + "]";
	}
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
	private String lname;
	void readObject(ObjectInputStream oi) throws ClassNotFoundException{
		Employee em = null;
		try {
			
			ObjectInputStream.GetField fields =  oi.readFields();
			String fname  = (String) fields.get("fname",null);
			String lname  = (String) fields.get("lname",null);
			System.out.println(fname + " " + lname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 	}
}
