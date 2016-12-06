import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void correctField() {
        Triangle t = new Triangle(10, 12, 5);
        double expectedField = 24.54;

        double rawResult = t.field();
        double multiplyRoundingResult = (Math.round(rawResult * 100));
        double finalResult = multiplyRoundingResult / 100;

        assertThat(finalResult).isEqualTo(expectedField);
    }
}
