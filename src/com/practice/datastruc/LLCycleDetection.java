/*
 * Detect cycle in a linked list
 * head pointer may be null if list is empty
 * 
 * Node class is defined as 
 * 
 * class Node{
 * 
 * 	int data;
 * 	Node next;
 * 
 * 
 * 
 */

package com.practice.datastruc;

class Node{
	 
 	int data;
 	Node next;
}

public class LLCycleDetection {
	boolean llHasCycle(Node head) {
		
		if(head == null) {
			return false;
		}
		
		Node slow =head;
		Node fast = head;
		
		while(fast!=null && fast.next.next!=null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
			
			
		}
		
		return true;
		
		
	}
	
	
}
