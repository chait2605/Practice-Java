package com.chaitanya.kademane;

public class UseOverloadedConstructor {
	
	public static void main(String[] args) {
		
		//call const with one argument
		ConstructorOverloadingDemo callCOD = new ConstructorOverloadingDemo("Chaitanya");
		
		
		//call const with two arguments
		ConstructorOverloadingDemo callCOD2 = new ConstructorOverloadingDemo("Chaitanya", 27);
	
		
		//call const with different type argument
		ConstructorOverloadingDemo callCOD3 = new ConstructorOverloadingDemo(1025678);
		
		
	}

}
