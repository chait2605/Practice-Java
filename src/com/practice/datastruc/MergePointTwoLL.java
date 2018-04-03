/**
 * 
 * find the merge point of two lists
 * 
 * 
 */


package com.practice.datastruc;

public class MergePointTwoLL {
	
	
	class Node{
		
		int data;
		Node next;
	}

	
	int findNodeAtMerge(Node headA, Node headB) {
		
		Node currA = headA;
		Node currB = headB;
		
		while(currA!=currB) {
			
			if(currA == null) {
				
				currA = headB;
			}else {
				
				currA = currA.next;
			}
			
			
			if(currB == null) {
				
				
				currB = headA;
				
			}else {
				
				currB = currB.next;
				
			}
		}
		
		
		return currA.data;
		
		
	}
}
