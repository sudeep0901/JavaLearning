package org.sudeep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

 
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Sudeep Patel";
		
		char[] input1 = input.toCharArray();
		
		List<Character> trial1 = new ArrayList<>();
		
		for (char c: input1)
			trial1.add(c);
		Collections.reverse(trial1);
		@SuppressWarnings("rawtypes")
		ListIterator li = (ListIterator) trial1.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		
		String str="";
		
		for (int i = 0; i < input.length(); i++){
			
			char c = input.charAt(i);
//			System.out.println(c);
			str = input.charAt(i) + str;
		}
		System.out.println(str);
	}
}
