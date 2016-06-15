package com.schildt.java.ch08.es14_overloaded;


class Override {
	public static void main(String args[]) {
		B subOb = new B(1, 2, 3);

		subOb.show("This is k: "); // this calls show() in B
		subOb.show(); // this calls show() in A
	}
}

