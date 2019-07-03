package com.sudeep;

public class ArrayCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Products table = new Products("Table", "1", "Table woodden");

		Products window = new Products("Window", "1", "Windows woodden");

		Products[] products = { table, window };

		System.out.println(products.toString());

		System.out.println(products[0]);

	}

}
