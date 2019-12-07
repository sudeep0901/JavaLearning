package com.sudeep.stream;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		
		double r = Math.sqrt(i);
		
		System.out.println(r);
		System.out.format("The root is of %d : %f.%n", i, r);
//        System.out.format("The square root of %d is %f.%n", i, r);
//		System.out.format("%x", i);
//		System.out.format("%tB", 2);
		
        System.out.format("%f, %1$+040.40f %n", Math.PI);
        System.out.format("%f, %<+010.40f %n", Math.PI);

        System.out.format("%f, %1$+020.10f %n", Math.PI);

	}

}
