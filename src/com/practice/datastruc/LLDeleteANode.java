/*
 * Delete node a kth postition in
 * linked list
 * and return the head
 * 
 * 
 */


package com.practice.datastruc;

public class LLDeleteANode {
	
	class Node{
		
		int data;
		Node next;
	}

	Node DeleteNodeKth(Node head, int k) {
		
		if(head == null) {
			
			return null;
		}else if(k == 0) {
			
			return head.next;
		}else {
			
			Node tmp = head;
			for(int i=0; i<k-1; i++) {
				
				tmp = tmp.next;
				
				
			}
			
			tmp.next = tmp.next.next;
			
			return head;
			
		}
		
		
		
		
		
	}
	
	
}
