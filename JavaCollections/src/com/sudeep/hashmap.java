package com.sudeep;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// No exception raised in case of duplicate values is inserted, latest will be updated
		HashMap<Integer, String> hmap = new HashMap<Integer,String>();
		
		hmap.put(12, "B");
		hmap.put(12, "C");

		hmap.put(11, "A");
		hmap.put(13, "C");
		hmap.put(15, "12");
		hmap.put(null, null);

		hmap.put(1, null);

		System.out.println(hmap.get(12));
		System.out.println(hmap);
		
		for(Integer key : hmap.keySet())
		{
			System.out.println(key);
		}
		
	      /* Display content using Iterator*/
		Set set = hmap.entrySet();
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
			System.out.println(iter.next().getClass().getName());
			System.out.println(iter.next().getClass().getSimpleName() );

		}
		
		Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      
	      while(iterator2.hasNext())
	      {
	    	  Map.Entry mentry = (Map.Entry)iterator2.next();
	    	  
	    	  System.out.println(mentry.getKey());
	    	  System.out.println(mentry.getValue());

	    			  
	      }
	      
 	}

}
