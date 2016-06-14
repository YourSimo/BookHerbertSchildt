package com.schildt.java.ch08.es04_Box;

import com.schildt.java.ch08.es03_Box.*;

//*listing 4
//Here, Box is extended to include color.
class ColorBox extends Box {
	int color; // color of box

	ColorBox(double w, double h, double d, int c) {
		width = w;
		height = h;
		depth = d;
		color = c;
	}    
}