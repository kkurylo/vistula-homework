package pl.kdkurylo;

public class FibonacciFinder {


    public long getFibonacciNumber(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Niepoprawna wartość: " + n);
        }
        int a = 1;
        int b = 1;
        for (int i = 2; i < n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
        }
    }