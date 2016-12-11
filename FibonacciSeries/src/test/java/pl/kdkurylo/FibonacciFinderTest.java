package pl.kdkurylo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciFinderTest {

    @Test
    public void shouldReturn1ForFirstFibonacciSequenceNumber() {
        FibonacciFinder ff = new FibonacciFinder();

        long result = ff.getFibonacciNumber(1);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturn1ForSecondFibonacciSequenceNumber() {
        FibonacciFinder ff = new FibonacciFinder();

        long result = ff.getFibonacciNumber(2);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturn2ForThirdFibonacciSequenceNumber() {
        FibonacciFinder ff = new FibonacciFinder();

        long result = ff.getFibonacciNumber(3);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturn55ForTenthFibonacciSeriesNumber() {
        FibonacciFinder ff = new FibonacciFinder();

        long result = ff.getFibonacciNumber(10);

        assertThat(result).isEqualTo(55);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExpectionIfInputIsNegativeNumber() {
        FibonacciFinder ff = new FibonacciFinder();

        long result = ff.getFibonacciNumber(-10);
    }

}