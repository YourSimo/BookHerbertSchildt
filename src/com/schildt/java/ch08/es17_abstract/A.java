package com.schildt.java.ch08.es17_abstract;

//*listing 17
// A Simple demonstration of abstract.
abstract class A {
	abstract void callme();

	// concrete methods are still allowed in abstract classes
	void callmetoo() {
		System.out.println("This is a concrete method.");
	}
}

