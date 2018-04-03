package com.practice.multithreadexample;

public class MultiThreadUsingRunnable implements Runnable{

	
	public void run() {
		
		try {
			
			//display the thread that is running
			System.out.println("Thread" +Thread.currentThread().getId()+ "is running");
		}catch(Exception e) {
			
			System.out.println("Exception is caught:" +e);
			
		}
		
		
	}
	
	
}
