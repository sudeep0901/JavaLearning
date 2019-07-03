package org.sudeep;

public class StringReverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Sudeep Patel";
		
		byte [] strAsByte = input.getBytes();
		byte [] result = new byte[strAsByte.length];
		
		for (int i = 0; i < strAsByte.length; i ++)
		{
			result[i] = strAsByte[strAsByte.length - i - 1];
			
		}
		System.out.println(new String(result));
		// other methond 
		StringBuilder input1 = new StringBuilder(input);
		System.out.println(input1.reverse());
	}

}
