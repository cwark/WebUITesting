<<<<<<< HEAD
package areaCalc;
=======
package ru.rahmetoff;
>>>>>>> main

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

<<<<<<< HEAD
    public double triangleArea(){
        double p = (double)(this.sideA + this.sideB + this.sideC)/2;
        double c = p*(p - this.sideA)*(p - this.sideB)*(p - this.sideC);
        return Math.sqrt(c);
    }
}


=======
    public double TriangleArea(ru.rahmetoff.Triangle t){
        int p = (t.sideA + t.sideB + t.sideC)/2;
        return Math.sqrt(p*(p - t.sideA)*(p - t.sideB)*(p - t.sideC));
    }
}
>>>>>>> main
