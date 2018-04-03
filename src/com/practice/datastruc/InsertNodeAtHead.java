/**
 * 
 * insert node at the head of a linked list
 * 
 * 
 * 
 */


package com.practice.datastruc;

public class InsertNodeAtHead {
	
	
	class Node{
		
		int data;
		Node next;
	}
	
	Node inertAtHead(Node head, int n) {
		
		Node tmp = new Node();
		
		tmp.data = n;
		
		if(head == null) {
			
			return tmp;
			
		}else {
			
			tmp.next = head;
		}
		
		
		return tmp;
		
	}
	

}
