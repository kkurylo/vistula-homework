package pl.kdkurylo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {

    @Test
    public void correctField() {
        Triangle t = new Triangle(10, 12, 5);
        double expected = 24.54;

        double result = t.field();

        assertThat(result).isCloseTo(expected, offset(0.01));
    }
}
