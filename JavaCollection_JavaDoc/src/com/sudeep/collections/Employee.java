package com.sudeep.collections;

public class Employee {

	private int id;
	private String name;
	static {
		
		System.out.println("Static initialization block");
		callStaticMethod();
	}
	
	{
		
		System.out.println("Initialization block");
		callMethod();
	}
	public Employee() {
		
		
	}
	
private static void callStaticMethod() {
		// TODO Auto-generated method stub
		System.out.println("Calling static method");
	}

private void callMethod() {
		// TODO Auto-generated method stub
		System.out.println("Method called from initialzaion block");
	}

public Employee(String name) {
		
		System.out.println("name");
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
