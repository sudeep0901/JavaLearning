package com.sudeep.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
 

public class Employee_Serialization_Main {
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		Employee emp = new Employee();
		
		
		emp.setFname("sudeep");
		emp.setLname("patel");
		
		
		
		saveEmployee(emp,"Employee.dat");
		System.out.println(emp.getFname());
		
		Employee em = deserializeEmployee("Employee.dat");
		System.out.println(em.toString());
		
//		ObjectInputStream oi;
//		try {
//			oi = new ObjectInputStream(Files.newInputStream(Paths.get("Employee.dat")));
//			emp.readObject(oi);
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	static void saveEmployee(Employee emp, String filename){
		emp.setFname("Manasvi");
		ObjectOutputStream objectSteam;
		try {
			objectSteam = new ObjectOutputStream(Files.newOutputStream(Paths.get(filename)));
			objectSteam.writeObject(emp);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	static Employee deserializeEmployee(String filename) throws ClassNotFoundException{
		Employee em = null;
		try {
			ObjectInputStream oi = 
			new ObjectInputStream(Files.newInputStream(Paths.get(filename)));
			em = (Employee) oi.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return em;
	}
	
	
}

