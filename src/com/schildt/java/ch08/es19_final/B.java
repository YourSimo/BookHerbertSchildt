package com.schildt.java.ch08.es19_final;

class B extends A {
	void meth() { // ERROR! Can't override.
		System.out.println("Illegal!");
	}
}

