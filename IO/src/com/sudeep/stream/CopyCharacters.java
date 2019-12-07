package com.sudeep.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader inputStream = null;
		FileWriter outputStream = null;

	
		
		int c;
		
		try {
			inputStream = new FileReader("xanadu.txt");
			outputStream = new FileWriter("characateroutput.txt");
			while((c = inputStream.read()) != -1) {
				System.out.println(c);
				outputStream.write(c);
				System.out.println(Integer.toBinaryString(c));
				System.out.println(Integer.SIZE);
bin(c); 			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (inputStream != null)
				inputStream.close();
			
			if(outputStream != null)
				outputStream.close();
		}
		
	}
	static void bin(int n) 
	{ 
	    /* step 1 */
	    if (n > 1) 
	        bin(n/2); 
	  
	    /* step 2 */
	    System.out.print(n % 2); 
	} 

}
