package com.practice.datastruc;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
	
	public static void eleFreq(int arr[]) {
		
		//create an empty hashmap
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		//Traverse through the given array
		for(int i=0; i<arr.length;i++) {
			
			Integer num = hmap.get(arr[i]);
			System.out.println(num);
			System.out.println(" " +arr[i]);
			
			//if this is the first occurence of element
			if(hmap.get(arr[i])==null) {
				
				hmap.put(arr[i], 1);
				
			}else {
				
				hmap.put(arr[i], ++num);
				
			}
			
			
			
		}
			
		//print result
		for(Map.Entry m:hmap.entrySet()) {
			
			System.out.println("Frequency of:" +m.getKey() + "is " +m.getValue());
		}
		
			
		}
		
	
	public static void main(String[] args) {
		
		
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
		eleFreq(arr);
		
		
		
	}
	
	

}
