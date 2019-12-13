package com.sudeep.collections;

public class OuterClass {

	private int id;
	private int x = 0;
	
	
	private String name;
	static {

		System.out.println("Static initialization block");
		callStaticMethod();
	}

	{

		System.out.println("Initialization block");
		callMethod();
	}

	public OuterClass() {

	}

	private static void callStaticMethod() {
		// TODO Auto-generated method stub
		System.out.println("Calling static method");
	}

	private void callMethod() {
		// TODO Auto-generated method stub
		System.out.println("Method called from initialzaion block");
	}

	public OuterClass(String name) {

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

	static class statiClass {
		statiClass() {
			System.out.println("Constructor calls.... static class");
		}
		private String staticString = "";

		public String getStaticString() {
			return staticString;
		}

		public void setStaticString(String staticString) {
			this.staticString = staticString;
		}

	}

	class InnerClasss {
		private int x = 1;
		
		void methodFirstLevel(int x) {
			System.out.println("Inner class:" + x);
			System.out.println("this.x:" + this.x);
			System.out.println(OuterClass.this.x);
		}
		private double salaryFather = 0.0;

		public double getSalaryFather() {
			return salaryFather;
		}

		public void setSalaryFather(double salaryFather) {
			this.salaryFather = salaryFather;
		}

		public InnerClasss() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner Class Object created");
			
		}

	}
}
