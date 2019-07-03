package com.sudeep;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer,String>();
		//Sorted Map by key
		tmap.put(2,"10");
		tmap.put(1, "100");
		tmap.put(-1, "1");
		
		System.out.println(tmap);
		
		
		Set set= tmap.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext())
		{
			 Map.Entry mentry = (Map.Entry)iter.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
		}
		
		Map sortedMap = sortByValues(tmap);
		
		System.out.println(sortedMap);
		
	}

	  //Method for sorting the TreeMap based on values
	  public static <K, V extends Comparable<V>> Map<K, V> 
	    sortByValues(final Map<K, V> map) {
	    Comparator<K> valueComparator = 
	             new Comparator<K>() {
	      public int compare(K k1, K k2) {
	        int compare = 
	              map.get(k1).compareTo(map.get(k2));
	        if (compare == 0) 
	          return 1;
	        else 
	          return compare;
	      }
	    };
	 
	    Map<K, V> sortedByValues = 
	      new TreeMap<K, V>(valueComparator);
	    sortedByValues.putAll(map);
	    return sortedByValues;
	  }
}
