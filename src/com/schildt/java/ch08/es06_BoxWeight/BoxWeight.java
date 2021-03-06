package com.schildt.java.ch08.es06_BoxWeight;

import com.schildt.java.ch08.es03_Box.Box;

//*listing 6
//BoxWeight now uses super to initialize its Box attributes.
class BoxWeight extends Box {
	double weight; // weight of box

	// initialize width, height, and depth using super()
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor
		weight = m;
	}    
}
