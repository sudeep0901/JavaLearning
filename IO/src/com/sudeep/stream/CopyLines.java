package com.sudeep.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		
		String l;
		
		try {
			inputStream = new BufferedReader(new FileReader("xanadu.txt"));
			outputStream = new PrintWriter(new FileWriter("copylines.txt"));
			
			while((l = inputStream.readLine()) !=null) {
				System.out.println(l);
				outputStream.println(l);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
		
		
	}

}
