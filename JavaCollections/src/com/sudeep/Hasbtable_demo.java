package com.sudeep;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Hasbtable_demo {
	public static void main(String[] args) {

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

		h1.put(3, "Hello");
		h1.put(1, "Sudeep");
		h1.put(2, "Patel");
		h1.put(2, "Patel1");
//		h1.put(null, "Patel12");
		h1.put(4, "Hello");
		h1.put(5, "Hello");

		

		System.out.println(h1.get(1));
		for (Integer key : h1.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(h1.toString());
		
		h1.computeIfAbsent(100, k -> "Hello, i am new elelment");
		System.out.println(h1.toString());
		
		System.out.println(h1.contains("Sudeep1"));
		
		Enumeration e = h1.elements();
		while(e.hasMoreElements()){
			System.out.println("Has more element:" + e.nextElement());
		}
		
		Set s = h1.entrySet();
		System.out.println(s.toString());
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();

		h2.put(3, "Hello");
		h2.put(1, "Sudeep");
		h2.put(2, "Patel");
		h2.put(2, "Patel1");
//		h2.put(null, "Patel12");
		h2.put(4, "Hello");
		h2.put(5, "Hello");
		Hashtable<Integer, String> h3 = new Hashtable<Integer, String>();

		h3.put(3, "Hello");
		h3.put(1, "Sudeep");
		h3.put(2, "Patel");
		h3.put(2, "Patel1");
//		h3.put(null, "Patel12");
		h3.put(4, "Hello");
		h3.put(5, "Hello");
		
		
		
		if(h2.equals(h3)){
			System.out.println("both are equal");
		}
		
		h3.put(6, "Hello");
		if(h2.equals(h3)){
			System.out.println("both are equal");
		}
		else{
			System.out.println("both are not equal");
		}
		
		System.out.println(h1.hashCode() + " " +  h2.hashCode() + " " + h3.hashCode());
		
		
		Queue<String> q1 = new LinkedList<String>();
		
		q1.add("10");
		q1.add("20");
		q1.add("30");

		q1.add("40");

		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());

		System.out.println(q1.element());
		
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		
		System.out.println(q1.peek());

		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(9);
		pq.add(150);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());


		
		 Object[] ar = pq.toArray();
// 		 System.out.println(ar[0]);
 		 
 		 for(Object v: ar){
 			 System.out.println(v);
 		 }
		 

//		System.out.println(pq.toArray());
	}
}
