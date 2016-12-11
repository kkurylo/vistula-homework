package pl.kdkurylo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleValidatorTest {

    @Test
    public void shouldCreateTriangleIfAllInequalitiesAreMet() {
        TriangleValidator t = new TriangleValidator();
        boolean result = t.validate(10, 13, 5);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldntCreateTriangleIfAtLeastOneInequalityIsNotMet() {
        TriangleValidator t = new TriangleValidator();
        boolean result = t.validate(5, 2, 2);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldntCreateTriangleIfAtLeastOneInequalityIsEqualNegativeNumber() {
        TriangleValidator t = new TriangleValidator();
        boolean result = t.validate(-2, 4, 5);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldntCreateTriangleIfAtLeastOneInequalityIsEqualZero() {
        TriangleValidator t = new TriangleValidator();
        boolean result = t.validate(0, 3, 8);

        assertThat(result).isFalse();
    }
}
