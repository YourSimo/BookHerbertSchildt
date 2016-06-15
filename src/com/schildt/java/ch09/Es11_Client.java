package com.schildt.java.ch09;

//listing 11
class Es11_Client implements Es10_Callback {
	// Implement Callback's interface
	public void callback(int p) {
		System.out.println("callback called with " + p);
	}
}

