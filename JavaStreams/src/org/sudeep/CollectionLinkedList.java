package org.sudeep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("A11");
		linkedList.add("A2");
		linkedList.add("A33");
		linkedList.add("A6");
		linkedList.add("A9");
		
		System.out.println(linkedList);
		
		linkedList.addFirst("Add First");
		linkedList.addLast("Last");
		
		System.out.println(linkedList);
		System.out.println(linkedList.get(0));

		linkedList.set(1,"Changed Value");
		System.out.println(linkedList);
		
		linkedList.remove();
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Add all 1");
		al.add("Add all 2");
		
		linkedList.addAll(al);
		
		System.out.println(linkedList);
		
		Object newll = linkedList.clone();
		System.out.println(newll);
		
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList);
//		15) Object poll(): It returns and removes the first item of the list.
		Object obj = linkedList.poll();
		System.out.println(linkedList);
		System.out.println(obj);
		
		Object lastElement = linkedList.pollLast();
		System.out.println(linkedList);
		System.out.println(lastElement);
		
		System.out.println(linkedList.size());
		List<String> converLltoArrayList = new ArrayList<String>(linkedList);
		System.out.println(converLltoArrayList);
		
		Iterator iter = linkedList.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
