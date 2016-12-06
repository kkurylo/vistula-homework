public class TriangleValidator {

    public boolean validate(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        } else {
            if (a + b > c && a + c > b && b + c > a) {
                return true;
            } else {
                return false;
            }
        }
    }
}
