package pl.kdkurylo;

public class FibonacciFinder {
    private static final Integer FIRST_ELEMENT = 1;
    private static final Integer SECOND_ELEMENT = 1;

    public long getFibonacciNumber(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Niepoprawna wartość: " + n);
        } else if (n == 1) {
            return FIRST_ELEMENT;
        } else if (n == 2) {
            return SECOND_ELEMENT;
        }

        return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
    }
}
