package pl.kdkurylo;

public class PercentGrader {

    public int calculate(float p) {
        if (p < 0 || p > 100) {
            throw new IllegalArgumentException("Niepoprawna wartość: " + p);
        }
        if (p >= 95) {
            return 6;
        } else if (p >= 85) {
            return 5;
        } else if (p >= 75) {
            return 4;
        } else if (p >= 65) {
            return 3;
        } else if (p >= 55) {
            return 2;
        } else {
            return 1;
        }
    }


}
