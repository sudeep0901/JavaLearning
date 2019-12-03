package com.sudeep.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionInterface {

//	static void filter(Collection<?> c) {
//		for(Iterator<?> it = c.iterator();it.hasNext();)
//			if (!cond(it.next()))
//				it.remove();
//	}
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Staring Collections Learning....");

		List<Employee> list = new ArrayList<>();
		Employee e3 = new Employee("Ratlam");
		
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("Sudeep");
		list.add(e);

		Employee e2 = new Employee();

		e2.setId(2);
		e2.setName("Sudeep");
		list.add(e2);

		Date date = new Date();
		long startTime = date.getTime();
		System.out.println(startTime);

//		for(int i=0;i<1000000;i++) {
//			list.stream()
//			.forEach(e1 -> System.out.println(e1.getName()));
//			String joined = list.stream()
//					.map(Object::toString)
//					.collect(Collectors.joining(", "));
//			System.out.println(joined);
//
//		}
//		System.out.println(date.getDate());
//		Thread.sleep(10000);
//		for(int i=0;i<1000000;i++) {
//			list.parallelStream()
//			.forEach(e1 -> System.out.println(e1.getName()));
//			String joined = list.stream()
//					.map(Object::toString)
//					.collect(Collectors.joining(", "));
//			System.out.println(joined);
//
//		}

		for (Object o : list)
			System.out.println(o);

		System.out.println(list.contains(e));

		list.remove((Collections.singleton(null)));

		Object[] obj = list.toArray();
		for (Object o : obj)
			System.out.println(o);

		Collection<Employee> nodups = new HashSet<Employee>(list);

		for (Employee o : nodups) {
			System.out.println(o.getName());
			System.out.println(o.getName().trim());
			System.out.println(o.getName().toUpperCase());
			System.out.println(o.getName().indexOf("eep"));
			System.out.println(o.getName().lastIndexOf('e'));
			System.out.println(o.getName().equals("Sudeep"));
		}

		// Stringbuilder Class

		StringBuilder stb = new StringBuilder("Sudeep");
		System.out.println(stb.length());
		System.out.println(stb);
		stb.append("Patel");
		System.out.println(stb);
		stb.append("Patel");
		stb.append("Patel");

		stb.append("Patel");

		System.out.println(stb.capacity());

		stb.setLength(100);
		stb.append(true);
		System.out.println(stb.capacity());
		System.out.println(stb);
		stb.delete(2, 5);
		System.out.println(stb);
		System.out.println(stb.capacity());
		System.out.println(stb.reverse());
		System.out.println(stb.toString());
		System.out.println(stb);
		String str = new String(stb);
		System.out.println(str);
		str = "Changes done";
		System.out.println(str);
		System.out.println(stb);

		String s = str;
		System.out.println(str == s);
		s = "I am immutable";
		System.out.println(str);
		System.out.println(s);

		StringBuilder sb = new StringBuilder("Able was I ere I .");
		System.out.println(sb.capacity());
		System.out.println(sb.length());

		String Name = "Mr. Sudeep Patel";

		Name.indexOf('.');

		System.out.println(Name.substring(0, Name.indexOf('.') + 1));
		Name = "Mrs. Renu Patel";
		System.out.println(Name.substring(0, Name.indexOf('.') + 1));

		String hi = "Hi, ";
		String mom = "mom.";

//		hi = hi.concat(mom);
//		System.out.println(hi);
//		System.out.println(hi + mom);

		StringBuffer sbf = new StringBuffer(hi.length() + 1 + mom.length() + 1);
		System.out.println(sbf);
		System.out.println(sbf.capacity());

		sbf.insert(0, hi);
		System.out.println(sbf);
		System.out.println(sbf.length());
		sbf.insert(sbf.length(), mom);

		System.out.println(sbf);

		String a = "software";
		String b = "swear oft";

		int b_idx = b.indexOf(' ');
		String[] intrim = b.split(" ");

		System.out.println(intrim.toString());
		System.out.println(Arrays.toString(intrim));
		sbf.setLength(0);
		for (String s1 : intrim) {
			sbf.append(s1);
		}
		System.out.println(sbf);
		b = b.replaceAll("\\s", "");
		System.out.println(b);
		System.out.println(b.length());
		System.out.println(a.length());
		System.out.println(a);
		System.out.println(b);
		if (b.length() != a.length()) {
			System.out.println("Not Anagram");

		} else {
			char[] as1 = a.toLowerCase().toCharArray();
			char[] as2 = b.toLowerCase().toCharArray();

			Arrays.sort(as1);
			Arrays.sort(as2);

			boolean status = as1.equals(as2);
			status = Arrays.equals(as1, as2);
			System.out.println(status);
		}
		new Employee().setName("Sudeep");

	}

}
