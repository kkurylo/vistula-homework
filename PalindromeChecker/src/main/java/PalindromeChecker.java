public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        if (word == null || word.trim().length() == 0) {
            return false;
        }
        StringBuilder SBword = new StringBuilder(word);
        StringBuilder reversedSBword = SBword.reverse();
        String odwroconyWord = reversedSBword.toString();
        // String odwroconyWord = new StringBuilder(word).reverse().toString();
//        System.out.println(odwroconyWord);
        return word.toLowerCase().equals(odwroconyWord.toLowerCase()); //to zwroci true jesli jest prawda
    }
}
