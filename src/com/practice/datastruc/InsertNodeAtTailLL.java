/**
 * 
 * 
 * Insert a node at the tail of a linked list
 * 
 */


package com.practice.datastruc;

public class InsertNodeAtTailLL {
	
	class Node{
		
		int data;
		Node next;
	}
	
	
	Node insertAtTail(Node head, int data) {
		
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.next = null;
		
		
		if(head == null) {
			
			return newNode;
		}else {
			Node tmp = head;
			
			while(tmp.next!=null) {
				
				tmp = tmp.next;
			
			}
			
			tmp.next = newNode;
			
			return head;
			
		
		}
		
	
	}

}
