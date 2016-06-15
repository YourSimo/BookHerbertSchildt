package com.schildt.java.ch17;

//listing 9
// A simple mailing list example.  
import java.util.*;  
  
class Address9 {  
	private String name;  
	private String street;  
	private String city;  
	private String state;  
	private String code;  
  
	Address9(String n, String s, String c, String st, String cd) {  
		name = n;  
		street = s;  
		city = c;  
		state = st;  
		code = cd;  
	}  
  
	public String toString() {  
		return name + "\n" + street + "\n" + city + " " + state + " " + code;  
	}  
}  
  
class MailList {  
	public static void main(String args[]) {  
		LinkedList<Address9> ml = new LinkedList<Address9>();  
      
		// Add elements to the linked list. 
		ml.add(new Address9("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));  
		ml.add(new Address9("Ralph Baker", "1142 Maple Lane", "Mahome", "IL", "61853"));  
		ml.add(new Address9("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));  
 
		// Display the mailing list. 
		for(Address9 element : ml) 
			System.out.println(element + "\n");  
 
		System.out.println();  
	}  
}
