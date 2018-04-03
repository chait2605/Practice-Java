package com.practice.datastruc;

import java.util.Arrays;
import java.util.Collections;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ArrayMinMaxUsingCollec {

	public static void main(String args[]) {
		
		//Initialize the array
		Integer[] num = {102, 400, 705, 501, 999};
		
		//use Collection.min() to find minimum element
		int min = Collections.min(Arrays.asList(num));
		
		//use Collection.max() to find the max element
		int max = Collections.max(Arrays.asList(num));
		
		//print min and max numbers
		System.out.println("Using Collections:");
		System.out.println("Minimum is: " +min);
		System.out.println("Maximum is: " +max);
		
		
		int mini, maxi;
		
		//if array has only one element
		if(num.length==1) {
			
			maxi = num[0];
			mini = num[0];
			
			System.out.println("Array length is 1:");
			System.out.println("Min:" +mini);
			System.out.println("Max:" +maxi);
			
		}
		
		if(num[0] > num[1]) {
			
			maxi = num[0];
			mini = num[1];
			
		}else {
			
			maxi = num[1];
			mini = num[0];
		}
		
		for(int i=2; i<=num.length-1;i++) {
			
			if(maxi < num[i]) {
				
				maxi = num[i];
				
			}else if(mini > num[i]) {
				
				mini = num[i];
			}
			
		}
		System.out.println("Using Compairson:");
		System.out.println("Max:" +maxi);
		System.out.println("Min:" +mini);
		
		Arrays.sort(num);
		
		System.out.println("Using arrays sort");
		System.out.println("Min is:" +num[0]);
		System.out.println("Max is:" +num[num.length-1]);
		
		
	}
	
}
