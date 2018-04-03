package com.practice.multithreadexample;

public class MultiThreadCallRunnable {

	public static void main(String[] args) {
		
		int n = 10;
		for(int i=0; i < n; i++) {
			
			Thread th = new Thread(new MultiThreadUsingRunnable());
			th.start();
			
		}
		
		
	}
	
	
}
