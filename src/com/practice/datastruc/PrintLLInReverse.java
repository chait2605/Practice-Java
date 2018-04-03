/**
 * Print the linked list elements in reverse
 * 
 * 
 * 
 */


package com.practice.datastruc;

public class PrintLLInReverse {
	
	class Node{
		
		
		int data;
		Node next;
		
	}
	
	void printReverse(Node head) {
		
		if(head!=null) {
			
			printReverse(head.next);
			System.out.println(head.data);
			
		}
		
		
		
	}

}
