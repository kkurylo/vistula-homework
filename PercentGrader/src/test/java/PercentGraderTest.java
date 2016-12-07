import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PercentGraderTest {

    @Test
    public void shouldReturn6WhenInputIsGreaterThan95Percent() {
        PercentGrader p = new PercentGrader();
        int expected = 6;

        int result = p.calculate(100f);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturn6WhenInputIsEqual95Percent() {
        PercentGrader p = new PercentGrader();
        int expected = 6;

        int result = p.calculate(95f);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturn5WhenInputIsGreaterOrEqualThan85ButLessThan95Percent() {
        PercentGrader p = new PercentGrader();
        int expected = 5;

        int result = p.calculate(85f);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturn4WhenInputIsGreaterOrEqualThan75ButLessThan85Percent() {
        PercentGrader p = new PercentGrader();
        int expected = 4;

        int result = p.calculate(75f);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturn3WhenInputIsGreaterOrEqualThan65ButLessThan75Percent() {
        PercentGrader p = new PercentGrader();
        int expected = 3;

        int result = p.calculate(65f);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturn2WhenInputIsGreaterOrEqualThan55ButLessThan65Percent() {
        PercentGrader p = new PercentGrader();
        int expected = 2;

        int result = p.calculate(55f);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturn1WhenInputLessThan55Percent() {
        PercentGrader p = new PercentGrader();
        int expected = 1;

        int result = p.calculate(49.99f);

        assertThat(result).isEqualTo(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionIfInputIsLessThan0() {
        PercentGrader p = new PercentGrader();

        int result = p.calculate(-1f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionIfInputIsGreaterThan100() {
        PercentGrader p = new PercentGrader();

        int result = p.calculate(100.01f);
    }
}