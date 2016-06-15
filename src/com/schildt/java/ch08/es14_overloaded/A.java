package com.schildt.java.ch08.es14_overloaded;

//*listing 14
// Methods with differing type signatures are overloaded -- not overridden.
class A {
	int i, j;

	A(int a, int b) {
		i = a;
			j = b;
	  }

	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

