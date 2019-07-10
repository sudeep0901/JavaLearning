package com.sudeep.serialization;

import java.util.*;

public class Sorted_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer,String > sortedMap = new TreeMap<>();
		
		sortedMap.put(1, "A");
		sortedMap.put(2, "b");
		sortedMap.put(4, "xA");
		sortedMap.put(3, "da");
		
		System.out.println(sortedMap.get(1));
		sortedMap.forEach((k,v) -> System.out.println(k +  " | " + v));  
		SortedMap<Integer,String> hmap = sortedMap.headMap(2);
		
		hmap.forEach((k,v) -> System.out.println(k + " ||" + v));
		SortedMap<Integer,String> tmap = sortedMap.tailMap(2);
		System.out.println("Tail map");
		tmap.forEach((k,v) -> System.out.println(k + " ||" + v));

		System.out.println(sortedMap.firstKey());
		System.out.println(sortedMap.lastKey());
	}

}
