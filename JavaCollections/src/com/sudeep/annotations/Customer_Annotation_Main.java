package com.sudeep.annotations;

public class Customer_Annotation_Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class<?> c = Class.forName("com.sudeep.annotations.Employee");
		
		Employee emp = (Employee) c.newInstance();
		
		emp.setFname("Sudeep");
		emp.setLname("Patel");
		
		Customer_annotation em =  c.getAnnotation(Customer_annotation.class);
		
		if(em != null)
			System.out.println(em.anno());
	 
				
	}

}
