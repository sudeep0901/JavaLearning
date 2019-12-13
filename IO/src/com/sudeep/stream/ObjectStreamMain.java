package com.sudeep.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObjectStreamMain {

	public static void main(String... args) throws IOException, ClassNotFoundException {
		
		System.out.println("Pbject stream");
	     FileOutputStream fos = new FileOutputStream("t.tmp");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.write(12345);
		oos.writeObject(LocalDate.now());
		oos.writeBytes("Sudeep Patel");
		oos.writeBytes(" Sudeep Patel1");
		oos.writeObject(LocalDateTime.now());
		oos.writeObject(LocalDate.now());

		oos.close();
		
		FileInputStream fis = new FileInputStream("t.tmp");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println(ois.read());
		LocalDate obj = (LocalDate)ois.readObject();
		System.out.println(obj.getDayOfMonth());
		System.out.println(ois.readLine());
		LocalDateTime obj1 = (LocalDateTime)ois.readObject();
		System.out.println(obj1);
//		System.out.println(ois.readObject());
		fis.close();

		ois.close();
		
	}
}
