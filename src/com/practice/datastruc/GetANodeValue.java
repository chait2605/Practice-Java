/**
 * 
 * Get Nth element from tail of the linked list
 * no. od elements in list > N
 * 
 * 
 * 
 */



package com.practice.datastruc;

public class GetANodeValue {
	
	
	class Node{
		
		int data;
		Node next;
	}

	
	int GetNode(Node head, int k) {
		
		Node slow = head;
		Node fast = head;
		
		for(int i=0; i<k; i++) {
			
			fast = fast.next;
			
			
		}
		
		
		while(fast.next!=null) {
			
			
			slow = slow.next;
			fast = fast.next;
		}
		
		
		
		return slow.data;
		
		
		
	}
}
