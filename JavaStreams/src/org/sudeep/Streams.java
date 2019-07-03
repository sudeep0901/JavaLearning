package org.sudeep;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Streams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// withoutResources();
		bySudwithResources();
		doCloseThing();
	}

	public static void withoutResources() {

		char[] buff = new char[1];
		int length;

		Reader reader = null;

		try {
			reader = Helper.openReader("file1.txt");

			while ((length = reader.read(buff)) >= 0) {
				System.out.println("\nlength: " + length);
				for (int i = 0; i < length; i++) {
					System.out.println(buff[i]);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getClass().getSimpleName() + " - "
					+ e.getMessage());
		} finally {

			try {
				if (reader != null) {
					reader.close();
				}

			} catch (IOException e2) {
				System.out.println(e2.getClass().getSimpleName() + " - "
						+ e2.getMessage());
			}
		}

	}

	public static void witResources() {
		char[] buff = new char[8];
		int length;

		// Reader reader = null;

		try (Reader reader = Helper.openReader("file1.txt")) {
			while ((length = reader.read(buff)) >= 0) {
				System.out.println("\nlength: " + length);
				for (int i = 0; i < length; i++) {
					System.out.println(buff[i]);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getClass().getSimpleName() + " - "
					+ e.getMessage());
		}

	}

	public static void bySudwithResources() throws IOException {
		char[] buffer = new char[8];
		int numofCharRead;

		Reader reader = Files.newBufferedReader(Paths.get("file1.txt"));
		Writer writer = Files.newBufferedWriter(Paths.get("file2.txt"));

		try {

			while ((numofCharRead = reader.read(buffer)) >= 0) {
				System.out.println(numofCharRead);
				writer.write(buffer, 0, numofCharRead);
				for (int i = 0; i < numofCharRead; i++) {
					System.out.println(buffer[i]);
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			reader.close();
			writer.close();
		}
	}
	
	private static void doCloseThing() {
	try (MyAutoClosable ac = new MyAutoClosable()){
		
		ac.saySomething();
		
	} catch (IOException e){
		System.out.println(e.getClass().getSimpleName() +  " = " + e.getMessage());
		for(Throwable t:e.getSuppressed())
			System.out.println("Suppressed: " + t.getMessage());
	}
	}
}
