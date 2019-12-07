package com.sudeep.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fin = new FileInputStream("WordCount.txt");
		int c = 0;
		try {
			while ((c = fin.read()) != -1) {
				System.out.println(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (fin != null) {
				fin.close();
			}
		}

		String[] arrayString = new String[1000];

		Scanner s = null;

		s = new Scanner(new BufferedReader(new FileReader("WordCount.txt")));
		int counter = 0;
		Map<String, Integer> hmap = new HashMap<>();
		String keys = null;
		while (s.hasNext()) {
//			System.out.println(s.next());
			keys = s.next();
			arrayString[counter] = keys;
			counter++;
			System.out.println(keys);
			synchronized (hmap) {
				if (hmap.containsKey(keys)) {
					hmap.put(keys, hmap.get(keys) + 1);

				} else {
					hmap.putIfAbsent(keys, 1);
				}

			}

		}

		Set set = hmap.entrySet();
		Iterator iter = set.iterator();

		while (iter.hasNext()) {

			Map.Entry<String, Integer> mentry = (Map.Entry<String, Integer>) iter.next();

			System.err.println("word:=" + mentry.getKey() + " and  " + " value:= " + mentry.getValue());
		}
		int counter1 = 0;
		for (String key : arrayString) {

			if (counter < counter1)
				break;
			System.out.println(key);

			counter1++;

		}

		Arrays.sort(arrayString);
		counter1 = 0;
		for (String key : arrayString) {

			if (counter < counter1)
				break;
			System.out.println(key);

			counter1++;

		}
	}

}
