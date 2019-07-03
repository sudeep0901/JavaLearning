package com.sudeep;

import java.awt.List;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import com.sun.jmx.snmp.Enumerated;
import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vector implements List Interface. Like ArrayList it also maintains
		// insertion order but it is rarely used in non-thread environment as it
		// is synchronized and due to which it gives poor performance in
		// searching, adding, delete and update of its elements
		//
		// It creates an empty Vector with the default initial capacity of 10.
		// and doubles after resize

		Vector<String> vec = new Vector<String>(100);

		vec.add("Sudeep1");
		vec.add("Sudeep2");
		vec.add("Sudeep3");
		vec.add("Sudeep");
		vec.add("Sudeep");

		vec.add("Sudeep");
		vec.add("Sudeep");
		vec.add("Sudeep");
		vec.add("Sudeep");
		vec.add("Sudeep");
		vec.add("Sudeep");
		vec.add("Sudeep");

		System.out.println(vec);
		System.out.println(vec.size());
		int intitialcapactiyt = 10;
		int increment = 10;
		Vector<String> vec1 = new Vector<String>(intitialcapactiyt, increment);
		vec1.add("Sudeep1");
		System.out.println(vec1.size());
		System.out.println(vec1.capacity());

		Collections.sort(vec);
		System.out.println(vec);

		java.util.List<String> sublist = vec.subList(1, 3);
		System.out.println(sublist);

		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}

		System.out.println(vec.contains("sudeep"));
		System.out.println(vec.indexOf("Sudeep1"));

		Enumeration en = vec.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		java.util.ListIterator<String> litr = vec.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next().hashCode());
			System.out.println(litr.next());
		}
	}

}
