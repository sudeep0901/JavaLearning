package com.sudeep;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

 
public class Reflection_BankAccount_Run {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Reflection_BankAccount rba1 = new Reflection_BankAccount("1234");
		Reflection_BankAccount rba2 = new Reflection_BankAccount("1234", 500);
		
//		System.out.println(rba1.getClass().getSimpleName());
		
//		for (Field fields : object.getClass().getFields()){
//			System.out.println(fields.toString());
//		
//		}
//		Class<?> c =  rba1.getClass();
		
		doWork(rba1);
		
		Class<?>  c = Class.forName("com.sudeep.Reflection_BankAccount");
		showName(c);
		
		Class<?> c1 = Reflection_BankAccount.class;
		showName(c1);
		Class<Reflection_BankAccount> c2 = Reflection_BankAccount.class;
		showName(c2);
		
		doWork(rba1);
	}
	
	static void doWork(Object object){
		Class<?> c =  object.getClass();
		
		showName(c);

	}
	static void showName(Class<?> theClass){
		System.out.println(theClass.getSimpleName());
//		System.out.println(theClass.getClass().getSuperclass());
		
		Class<?>[]  interfaces = theClass.getInterfaces();
		for (Class<?> interfac:interfaces){
			System.out.println(interfac.getSimpleName());
		}
		
		
		Field[]  flds = theClass.getFields();
		System.out.println("Getting fields");
		for (Field fld:flds){
			System.out.println(fld.getName());
		}
		
		int modifiers = theClass.getModifiers();
		
//		if ((modifiers & Modifier.FINAL) > 0)
		if(Modifier.isFinal(modifiers))
			System.out.println("bitwise check : final modifier");
		
		
//		Method[] mth = theClass	.getMethods();
		
	}

}
