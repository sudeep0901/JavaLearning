
package com.sudeep.concurrency;

public class JavaConcurrecy1Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        (new Thread(new HelloRunnable())).start();
        
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };

        try {
			for(int i=0;i<importantInfo.length;i++) {
				System.err.println(importantInfo[i]);
				Thread.currentThread().sleep(1000);
 			}
//        	Thread.currentThread().join();
			System.out.println("Thread completed");
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Thread main interurppted");
		}
        
	}

}
