import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerTest {
    @Test
    public void shouldRecognizeProperPalindrome() {
        //given
        PalindromeChecker p = new PalindromeChecker(); //towrze instancje
        boolean expected = true;

        //when
        boolean wynik = p.isPalindrome("kajak");

        //then
        assertThat(wynik).isEqualTo(expected);
    }

    @Test
    public void shouldRecognizeNonPalindrome() {
        PalindromeChecker p = new PalindromeChecker();

        boolean wynik = p.isPalindrome("bieganie");

        assertThat(wynik).isFalse();
    }

    @Test
    public void shouldRecognizePalindromeBeingCaseInsensitive() {
        PalindromeChecker p = new PalindromeChecker();

        boolean wynik = p.isPalindrome("KAjak");

        assertThat(wynik).isTrue();
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        PalindromeChecker p = new PalindromeChecker();

        boolean wynik = p.isPalindrome(null);

        assertThat(wynik).isFalse();
    }

    @Test
    public void whiteCharactersAreNeverPalindrome() {
        PalindromeChecker p = new PalindromeChecker();

        boolean wynik = p.isPalindrome("     ");

        assertThat(wynik).isFalse();
    }
}
