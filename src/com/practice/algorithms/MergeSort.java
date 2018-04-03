package com.practice.algorithms;

import java.util.*;

public class MergeSort {
	
	
	
	
	public static void merge(int[] arr, int left, int mid, int right) {
		
		int len1 = mid - left+1;
		int len2 = right - mid;
		
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		
		for(int i=0; i<len1; i++) {
			
			arr1[i] = arr[left+i];
		}
		
		for(int i=0; i<len2; i++) {
			
			arr2[i] = arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k = left;
		
		
		while(i<len1 && j<len2) {
			
			if(arr1[i] < arr2[j]) {
				
				arr[k] = arr1[i];
				i++;
						
			}else {
				
				arr[k] = arr2[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i<len1) {
			
			arr[k++] = arr1[i++];
		}
		
		while(j<len2) {
			
			
			arr[k++] = arr2[j++];
		}
	}
	
	
	
	
	
	
	
	public static void sort(int[] arr, int left, int right) {
		
		if(left < right) {
			
			int mid = left+(right - left)/2;
			
			sort(arr,left, mid);
			sort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
			
			
		}
		
		
		
	}
	
	
	static void printArray(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0; i<=n-1; i++) {
			
			System.out.println(arr[i] + ",");
			
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		scan.close();
		
		sort(arr, 0 , arr.length-1);
		printArray(arr);
		
	}
	
	
	
	
	
	
	

}
