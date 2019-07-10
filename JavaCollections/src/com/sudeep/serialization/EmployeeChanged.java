package com.sudeep.serialization;

import java.io.Serializable;

 
 public class EmployeeChanged implements Serializable {
	
//	@Override
//	public String toString() {
//		return "Employee [fname=" + fname + ", lname=" + lname + "]";
//	}
	 
 	
	private String fname;
	private String txType;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getTxType() {
		return txType;
	}
	public void setTxType(String txType) {
		this.txType = txType;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private String lname;
	
}
