package com.practice.multithreadexample;

public class MultiThreadDemo extends Thread{

	public void run() {
		
		try {
			
			
			//display the thread that is running
			System.out.println("Thread" +Thread.currentThread().getId()+ "is running");
			
		}catch(Exception e) {
			
			//throw an exception
			System.out.println("Exception is caught" +e);
			
		}
		
	}
	
}
