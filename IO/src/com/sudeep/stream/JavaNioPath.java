package com.sudeep.stream;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNioPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getenv("file.separators"));
		
		Path p1 = Paths.get("C:/opensource");
		
		System.out.println(p1.toString());
		System.out.println(p1.getFileName());
		System.out.println(p1.getName(0));
		System.out.println(p1.getNameCount());
		System.out.println(p1.getRoot());
		System.out.println(p1.getParent());
	}

}
