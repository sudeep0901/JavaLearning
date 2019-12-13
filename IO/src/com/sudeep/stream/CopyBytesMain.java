package com.sudeep.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream in = null;
		FileOutputStream out = null;
		byte[] btarray = new byte[1000];

		int c;
		int i = 0;
		
		try {

			in = new FileInputStream("xanadu.txt");
			out = new FileOutputStream("outgain.txt");

			while ((c = in.read()) != -1) {
				System.out.println(c);
				btarray[i] = (byte) c;
				out.write(c);
				i++;
			}
			
			
			for(i=0;i<btarray.length;i++) {
				System.out.println(btarray[i] + (char)btarray[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (in != null) {
				in.close();
			}	
			if (out !=null) {
				out.close();
			}
		}
	}

}
