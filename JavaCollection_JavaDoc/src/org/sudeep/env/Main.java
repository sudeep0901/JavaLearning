package org.sudeep.env;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
 		Map<String, String> env = System.getenv();
		
		for(String envName: env.keySet()) {
			System.out.println(envName+ ":" +env.get(envName));
		}
		
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("user.name") + System.getProperty("user.dir"));
		System.getProperties().list(System.err);
		
		FileInputStream propfile 
		= new FileInputStream("myproperties.properties");
		
		
		 
	}

}
