package com.sudeep;

public class Products {

	String name;
	
	String version;
	String Remarks;
	
	
	public Products(String name, String version, String remarks) {
		super();
		this.name = name;
		this.version = version;
		Remarks = remarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getRemarks() {
		return Remarks;
	}
	@Override
	public String toString() {
		return "Products [name=" + name + ", version=" + version + ", Remarks="
				+ Remarks + "]";
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
	
}
