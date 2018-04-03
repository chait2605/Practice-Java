/**
 * 
 * Print the elements of a linked list
 * 
 * 
 */


package com.practice.datastruc;

public class PrintElementsOfLL {
	
	
	class Node{
		
		int data;
		
		Node next;
	}
	
	
	void printLLElements(Node head) {
		
		Node tmp = head;
		
		while(tmp != null) {
			
			System.out.println(tmp.data);
			tmp = tmp.next;
			
			
		}
		
		
	}

}
