package com.chaitanya.kademane;

public class ConstructorOverloadingDemo {
	
	//cons with one argument
	ConstructorOverloadingDemo(String name){
		
		System.out.println("Const with one argument: " +name);
	}
	
	//Constructor with two arguments
	ConstructorOverloadingDemo(String name, int age){
		
		System.out.println("Const with two arguments. Name: " +name+ "Age :" +age);
	}

	ConstructorOverloadingDemo(long id){
		
		System.out.println("Const with different type argument. Long :" +id);
	}
}
