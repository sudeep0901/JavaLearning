package com.sudeep;

public class Protected_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected_Demo pd = new Protected_Demo();
		
		System.out.println(pd.var);
		
		Protected_Inherits pi = new Protected_Inherits();
		System.out.println(pi.var);
	}

}
