package com.practice.datastruc;

public class BSTPostOrderTraversal {
	
	
	void postOrder(BSTNode root) {
		
		if(root!=null) {
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data + " ");
		}
		
		
	}

}
