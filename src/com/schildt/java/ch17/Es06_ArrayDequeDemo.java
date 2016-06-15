package com.schildt.java.ch17;

//listing 6
// Demonstrate ArrayDeque.
import java.util.*; 
 
class Es06_ArrayDequeDemo { 
	public static void main(String args[]) { 
		// Create a tree set. 
		ArrayDeque<String> adq = new ArrayDeque<String>(); 
     
		// Use an ArrayDeque like a stack.
		adq.push("A"); 
		adq.push("B");  
		adq.push("D"); 
		adq.push("E"); 
		adq.push("F"); 
    
		System.out.print("Popping the stack: ");

		while(adq.peek() != null) 
			System.out.print(adq.pop() + " ");

		System.out.println();
	} 
}

