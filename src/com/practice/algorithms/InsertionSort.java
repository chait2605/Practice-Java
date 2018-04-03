package com.practice.algorithms;

public class InsertionSort {
	
	
	public static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			
			int key = arr[i];
			int j = i;
			
			while(j > 0 && arr[j-1] > key) {
				
				arr[j] = arr[j-1];
				j--;
				
			}
			
			arr[j] = key;
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5, 2, 6, 8, 3, 12, 1, 9};
		
		insertionSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		
	}
	

}
