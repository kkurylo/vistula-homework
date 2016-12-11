package pl.kdkurylo;

import static java.lang.Math.sqrt;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double field() {
        double p = 0.5 * (a + b + c);
        double result = sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
