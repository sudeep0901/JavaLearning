package org.sudeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alist = new ArrayList<String>();

		alist.add("Sudeep");
		alist.add("Sudeep");
		alist.add("Sudeep");
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");

		System.out.println(alist);

		alist.remove("Sudeep");
		System.out.println(alist);
		alist.remove(2);
		System.out.println(alist);

		// iterating list
		for (String val : alist) {
			System.out.println(val);
		}
		
		System.out.println(alist.get(2));
		System.out.println(alist.indexOf("Sudeep"));
		System.out.println(alist.set(2,"Manasvi"));
		System.out.println(alist.size() );
		System.out.println(alist.contains("Tim"));
		
		
		// initialize array list
		ArrayList<String> alist1 = new ArrayList<String>(Arrays.asList("A", "B","C","D","E"));
		System.out.println(alist1);
		
//		Method 2: Anonymous inner class method to initialize ArrayList
		ArrayList<String> alist2 = new ArrayList<String>(){{
			
			add("F");
			add("G");
			
		}};

		System.out.println(alist2);
		
//		Method 4: Use Collections.ncopies
		ArrayList<Integer> alist3 = new ArrayList<Integer>(Collections.nCopies(10,500)); 
		System.out.println(alist3);
		 
	}

}
