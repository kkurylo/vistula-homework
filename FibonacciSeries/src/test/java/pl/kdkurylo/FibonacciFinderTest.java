package pl.kdkurylo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciFinderTest {
    private FibonacciFinder ff = new FibonacciFinder();

    @Test
    public void shouldReturn1ForFirstFibonacciSequenceNumber() {
        long result = ff.getFibonacciNumber(1);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturn1ForSecondFibonacciSequenceNumber() {
        long result = ff.getFibonacciNumber(2);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturn2ForThirdFibonacciSequenceNumber() {
        long result = ff.getFibonacciNumber(3);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturn55ForTenthFibonacciSeriesNumber() {
        long result = ff.getFibonacciNumber(10);

        assertThat(result).isEqualTo(55);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExpectionIfInputIsNegativeNumber() {
        long result = ff.getFibonacciNumber(-10);
    }
}