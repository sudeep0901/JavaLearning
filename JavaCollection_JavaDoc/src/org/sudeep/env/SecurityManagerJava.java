package org.sudeep.env;

public class SecurityManagerJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecurityManager sm = System.getSecurityManager();
// 		System.exit(1);
		System.out.println("I am not reachable");
		
		System.out.println(System.currentTimeMillis());;
 	}

}
