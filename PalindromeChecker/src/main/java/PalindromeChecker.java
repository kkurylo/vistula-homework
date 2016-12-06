public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        if (word == null || word.trim().length() == 0) { //word.trim().empty()
            return false;
        }
        String reversedWord = reverseWord(word);
        String ignoreCaseWord = word.toLowerCase();
        String ignoreCaseReversedWord = reversedWord.toLowerCase();
        return ignoreCaseWord.equals(ignoreCaseReversedWord);
    }

    private String reverseWord(String word) {
        StringBuilder stringBuilderWord = new StringBuilder(word);
        StringBuilder reversedSBword = stringBuilderWord.reverse();
        return reversedSBword.toString();
    }
}
