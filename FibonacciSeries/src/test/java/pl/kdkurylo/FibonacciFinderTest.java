package pl.kdkurylo;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FibonacciFinderTest {

    @Test
    @Parameters({
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "21, 10946"
    })
    public void shouldReturnFibonacciSeqElement(int element, long value) {
        FibonacciFinder ff = new FibonacciFinder();

        long result = ff.getFibonacciNumber(element);

        assertThat(result).isEqualTo(value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExpectionIfInputIsNegativeNumber() {
        FibonacciFinder ff = new FibonacciFinder();

        long result = ff.getFibonacciNumber(-10);
    }

}