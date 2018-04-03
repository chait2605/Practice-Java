package com.practice.algorithms;

import java.util.Scanner;

public class SortStringsAlphabetically {
	
	public static void main(String[] args) {
		
		String temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of strings to be sorted");
		int n = scan.nextInt();
		scan.nextLine(); //ignore the next line character
		
		String names[] = new String[n];
		
		System.out.println("Enter the names:");
		for(int i=0;i<n;i++) {
			
			names[i] = scan.nextLine();	
		}
		
		
		
		//sort the strings
		for(int i=0; i<n; i++) {
			
			for(int j=1; j<n; j++) {
				
				if(names[j-1].compareTo(names[j])>0) {
					
					temp = names[j-1];
					names[j-1] = names[j];
					names[j] = temp;
					
				}
				
				
			}
			
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++) {			
			System.out.println(names[i]);
			
		}
	
	}

}
