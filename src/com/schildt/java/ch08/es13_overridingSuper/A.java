package com.schildt.java.ch08.es13_overridingSuper;

//*listing 12
// Method overriding.
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

