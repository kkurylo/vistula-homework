import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerTest {
    @Test
    public void Palindrome() {
        //given
        PalindromeChecker p = new PalindromeChecker(); //towrze instancje
        boolean expected = true;

        //when
        boolean wynik = p.isPalindrome("kajak");

        //then
        assertThat(wynik).isEqualTo(expected);
    }

    @Test
    public void NonPalindrome() {
        PalindromeChecker p = new PalindromeChecker();
        boolean expected = false;

        boolean wynik = p.isPalindrome("bieganie");
        assertThat(wynik).isEqualTo(expected);

    }

    @Test
    public void CaseInsensitive() {
        PalindromeChecker p = new PalindromeChecker();
        boolean expected = true;

        boolean wynik = p.isPalindrome("KAjak");
        assertThat(wynik).isEqualTo(expected);
    }

    @Test
    public void emptyString() {
        PalindromeChecker p = new PalindromeChecker();
        boolean expected = false;

        boolean wynik = p.isPalindrome(null);
        assertThat(wynik).isEqualTo(expected);
    }

    @Test
    public void OnlyWhiteCharacters() {
        PalindromeChecker p = new PalindromeChecker();
        boolean expected = false;

        boolean wynik = p.isPalindrome("     ");
        assertThat(wynik).isEqualTo(expected);
    }
}
