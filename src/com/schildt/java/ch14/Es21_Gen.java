package com.schildt.java.ch14;

// listing 21
// Can't create an instance of T. 
class Gen21<T> {  
	T ob;  
	Gen21() {  
		ob = new T(); // Illegal!!! 
	}  
} 
