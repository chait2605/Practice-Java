package com.practice.datastruc;

public class SplitAString {
	
	public static void main(String[] args) {
		
		String str = "jan-feb-march";
		String[] temp;
		String delimiter = "-";
		temp = str.split(delimiter);
		
		for(int i=0; i<temp.length; i++) {
			
			System.out.println(temp[i]);
			System.out.println(" ");
			str = "jan.feb.march";
			delimiter = "\\.";
			temp = str.split(delimiter);
			
		}
		
		for(int i=0; i<temp.length; i++) {
			
			System.out.println(temp[i]);
			System.out.println(" ");
			temp = str.split(delimiter,2);
			
			for(int j=0; j<temp.length; j++) {
				
				System.out.println(temp[j]);
			}
			
			
		}
	}

}
