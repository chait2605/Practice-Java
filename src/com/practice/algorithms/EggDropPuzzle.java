package com.practice.algorithms;

public class EggDropPuzzle {
	
	public static int eggDrop(int k, int n) {
		
		if(k==1 || k==0) {
			return k;
		}
		
		if(n==1) {
			
			return k;
		}
		
		int min = Integer.MAX_VALUE;
		int x, res;
		
		for(x=1; x<=k;x++) {
			
			res = Math.max(eggDrop(x-1,n-1), eggDrop(k-x,n));
			if(res < min) {
				
				min = res;
			}
		}
		
		
		
		
		
		
		return min + 1;
	}
	
	public static void main(String[] args) {
		
		int n=4;
		int k =30;
		
		System.out.println("Minimun number of trials in worst case with " +n+ "eggs and " +k+ "floors is: " +eggDrop(k, n));
		
	}

}
