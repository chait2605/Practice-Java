package com.practice.datastruc;

public class ReverseWordsInAString {
	
	public static void main(String[] args) {
		
		
		String str[] = "This is servicenow".split(" ");
		
		String finalStr = "";
		
		for(int i=str.length-1 ; i>=0 ; i--) {
			
			
			finalStr += str[i]+" ";
			
			
			
		}
		
		System.out.println("Reverse the words in string:"+finalStr);
		
		String word = "servicenow";
		
		String reverseword = "";
		
		for(int i=word.length()-1; i>=0; i-- ) {
			
			reverseword = reverseword+word.charAt(i);
			
		}
		
		System.out.println("Reversed word is:" +reverseword);
		
		
		String newline = "QE Engineer Servicenow";
		
		char[] newStr = newline.toCharArray();
		for(int i=newStr.length-1; i>=0; i--) {
			
			System.out.print(newStr[i]);
			
			
		}
		
	}

	
	
	
	
	
}
