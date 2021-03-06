package com.practice.algorithms;

public class QuickSort {
	
	int array[];
	int length;
	
	public void sort(int[] inputArr) {
		
		if(inputArr == null || inputArr.length == 0) {
			
			return;
		}
		
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length-1);
	}
	
	public void quickSort(int lowerIndex, int higherIndex) {
		
		int i = lowerIndex;
		int j = higherIndex;
		
		int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		
		while(i <= j) {
			
			while(array[i] < pivot) {
				
				i++;
				
			}
			
			while(array[j] > pivot) {
				
				j--;
			}
			
			if(i<=j) {
				
				swapNumbers(i,j);
				i++;
				j--;
				
			}
			
			
		}
		
		if(lowerIndex < j) {
			
			quickSort(lowerIndex,j);
			
		}
		
		if(i > higherIndex) {
			
			quickSort(i, higherIndex);
		}
		
	}
	
	public void swapNumbers(int i, int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	
	public static void main(String[] args) {
		
		QuickSort sorter = new QuickSort();
		
		int[] input = {24, 2, 45, 56, 75, 2, 56, 99, 53, 12};
		
		sorter.sort(input);
		for(int i=0; i<input.length-1; i++) {
			
			System.out.println(input[i]);
			System.out.println(" ");
			
		}
		
		
	}
}
