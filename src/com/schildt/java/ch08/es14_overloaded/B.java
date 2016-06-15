package com.schildt.java.ch08.es14_overloaded;

// Create a subclass by extending class A.
class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// overload show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}
  
