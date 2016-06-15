package com.schildt.java.ch08.es16_runtimePolymorphism;

//*listing 16
// Using run-time polymorphism.
class Figure {
  double dim1;
  double dim2; 

  Figure(double a, double b) {
    dim1 = a;
    dim2 = b;
  }

  double area() {
    System.out.println("Area for Figure is undefined.");
    return 0;
  }
}

