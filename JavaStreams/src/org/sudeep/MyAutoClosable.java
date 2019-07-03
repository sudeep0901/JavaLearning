package org.sudeep;

import java.io.IOException;

public class MyAutoClosable implements AutoCloseable {

	public void saySomething() throws IOException {
		System.out.println("something");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("close");
		throw  new IOException("exception from close");
		
	}
}
