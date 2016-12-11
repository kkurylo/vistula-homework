package pl.kdkurylo;

import java.util.ArrayList;
import java.util.List;

public class FibonacciFinder {

    List<Integer> fibonacci;

    public long getFibonacciNumber(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Niepoprawna wartość: " + n);
        }
        fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        for (int i = 1; i < n; i++) {
            fibonacci.add((fibonacci.get(i - 1)) + (fibonacci.get(i)));
        }
        return fibonacci.get(n - 1);
    }
}
