package com.sudeep;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EmployeeReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setFname("Sudeep");
		emp.setLname("Patel");
		Class<?> cls = emp.getClass();
		
		System.out.println(cls.getSimpleName());
		
		Field[] flds =  cls.getDeclaredFields();
		
		for (Field field : flds){
			System.out.println(field.getName());
		}
		
		
		 Method[]  methods  = cls.getDeclaredMethods();
		 
		 for (Method method: methods){
			 System.out.println(method.getName());
		 }
		 
		 Constructor<?>[] constructures= cls.getConstructors();
		 for (Constructor<?> constructor: constructures){
			 System.out.println(constructor.getName());
			 
			 try {
				Object newemp = constructor.newInstance();
				System.out.println(newemp.toString());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 Method m = cls.getMethod("getFname");
		 try {
			 Object result = m.invoke(emp);
			 System.out.println(result);
			System.out.println(m.invoke(emp));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 m = cls.getMethod("setFname",String.class);
		 

		 try {
			m.invoke(emp,"Manasvi");
			System.out.println(emp.getFname());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 

				
	}	

}
