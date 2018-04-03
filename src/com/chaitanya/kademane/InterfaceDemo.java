package com.chaitanya.kademane;

//A simple interface
interface in1
{
 // public, static and final
 final int a = 10;

 // public and abstract 
 void display();
}

public class InterfaceDemo implements in1{
	// Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Chaitanya");
    }
 
    // Driver Code
    public static void main (String[] args)
    {
    	InterfaceDemo t = new InterfaceDemo();
        t.display();
        System.out.println(a);
    }

}
