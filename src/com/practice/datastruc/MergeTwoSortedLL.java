/**
 * 
 * Merge two sorted linked lists
 * 
 * 
 */


package com.practice.datastruc;

public class MergeTwoSortedLL {
	
	class Node{
		
		int data;
		Node next;
		
	}
	
	Node mergeTwoLL(Node headA, Node headB) {
		
		//check if the heads are null
		if(headA == null) {
			
			return headB;
			
		}else if(headB == null){
			
			return headA;
		}
		
		
		//find new merged list's head pointer
		Node head = null;
		
		if(headA.data < headB.data) {
			
			head = headA;
			headA = headA.next;
			
		}else {
			
			
			head = headB;
			headB = headB.next;
		}
		
		
		//traverse thru the lists until null
		Node tmp = head;
		while(headA!=null && headB!=null) {
			
			if(headA.data < headB.data) {
				
				tmp.next = headA;
				headA = headA.next;
				
			}else {
				
				tmp.next = headB;
				headB = headB.next;
			}
			
			tmp = tmp.next;
		}
		
		//after headA and headB reach null attach them to each other
		if(headA == null) {
			
			tmp.next = headB;
			
		}else {
			
			
			tmp.next = headA;
		}
		
		return head;
	}
	

	
	
}
