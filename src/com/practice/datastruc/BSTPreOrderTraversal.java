package com.practice.datastruc;

public class BSTPreOrderTraversal {

	void preOrder(BSTNode root) {
		
		if(root!=null) {
			
			System.out.println(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
			
		}
		
	}
	
	
}
