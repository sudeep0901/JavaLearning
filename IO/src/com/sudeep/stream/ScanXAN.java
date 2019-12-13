package com.sudeep.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScanXAN {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner scan = null;
//		scan.useDelimiter(",\\s*");

		scan = new Scanner(new FileReader("xanadu.txt"));

		while ((scan.hasNext())) {
			System.out.println(scan.next());
		}

		if (scan != null)
			scan.close();

	}

}
