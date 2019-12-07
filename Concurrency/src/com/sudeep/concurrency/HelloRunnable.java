package com.sudeep.concurrency;

 public class HelloRunnable implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.err.println("Running a new thread");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("Thread interruptted");
			}
		}
		
	}
 