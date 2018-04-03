package com.practice.algorithms;

public class BinarySearch {
	
	public int binarySearch(int[] arr, int left, int right, int item) {
		
		
		if(left <= right) {
			
			int mid = left+(right-left)/2;
			
			if(arr[mid] == item) {
				
				return mid;
			}
			
			if(arr[mid] > item) {
				
				return binarySearch(arr, left, mid-1, item);
			}
			
			if(arr[mid] < item) {
				
				return binarySearch(arr, mid+1, right, item);
			}
			
		}
				
		return -1;
	
	}
	
	 public static void main(String[] args) {
		 
		 BinarySearch bs = new BinarySearch();
		 
		 int arr[] = {4, 6, 9, 12, 18, 34, 52, 76, 99};
		 
		 int length = arr.length;
		 
		 int item = 56;
		 
		 int result = bs.binarySearch(arr, 0, length-1, item);
		 
		 if(result == -1) {
			 
			 System.out.println("The element is not present in this array");
		 }else {
			 
			 System.out.println("The searched element is at indes:" +result);
		 }
		 
		 
	 }
	

}
