package com.practice.multithreadexample;

public class MultiThread {
	
	public static void main(String[] args) {
		
		
		int n = 10;
		for(int i=0; i<n; i++) {
			
			
			MultiThreadDemo th =new MultiThreadDemo();
			
			th.start();
			
			
		}
		
		
	}

}
