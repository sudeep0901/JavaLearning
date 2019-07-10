package com.sudeep.annotations;

public class Employee_Default_Annotation_Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class<?> c = Class.forName("com.sudeep.annotations.EmployeeDefault");
		
		EmployeeDefault emp = (EmployeeDefault)c.newInstance();
		
		emp.setFname("Sudeep");
		emp.setLname("Patel");
		
		Customer_annotation em =  c.getAnnotation(Customer_annotation.class);
		
		if(em != null)
			System.out.println(em.anno());
	 
				
	}

}
