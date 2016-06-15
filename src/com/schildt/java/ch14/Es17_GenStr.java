package com.schildt.java.ch14;

// listing 17
 
// Here, T is bound by String. 
class Es17_GenStr<T extends String> { 
	T str; // here, T will be replaced by String 
 
	Es17_GenStr(T o) {  
		str = o;  
	}  
 
	T getstr() { return str; } 
}
