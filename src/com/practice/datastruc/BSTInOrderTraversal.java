package com.practice.datastruc;

public class BSTInOrderTraversal {
	
	
	void inOrder(BSTNode root) {
		
		if(root!=null) {
			
			inOrder(root.left);
			System.out.println(root.data + " ");
			inOrder(root.right);
			
		}
		
	}
	

}
