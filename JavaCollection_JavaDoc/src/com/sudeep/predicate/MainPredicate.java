package com.sudeep.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> predicateString = s -> {
			return s.equals("Hello");
		};
		
		System.out.println(predicateString.test("Hello"));
		
		System.out.println(testing(predicateString, "Hello"));
		
		Predicate<String>predicateNegate =  predicateString.negate();
		System.out.println("Negat method: " + predicateNegate.test("Hello"));
		
		
		
		List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
		
		Predicate<String> startsWithA = str -> str.startsWith("A");
		
		List<String> listA = names.stream()
				.filter(startsWithA)
				.collect(Collectors.toList());
		System.out.println(listA);
	
		Predicate<String> len5 = str -> str.length() > 5;
		List<String> list5 = names.stream()
				.filter(len5.and(startsWithA))
				.collect(Collectors.toList());
		System.out.println(list5);
		
		List<Predicate<String>> allPredicates = new ArrayList<Predicate<String>>();
	    allPredicates.add(str -> str.startsWith("A"));
	    allPredicates.add(str -> str.contains("d"));        
	    allPredicates.add(str -> str.length() > 4);
	    
	    List<String> result = names.stream()
	    		.filter(allPredicates.stream().reduce(x->true, Predicate::or))
	    		.collect(Collectors.toList());
	    
	    System.out.println(result);
	} 
	
	 static  boolean testing(Predicate<String> pstr, String str) {
		
		return pstr.test(str);
 		
		
	}
}

