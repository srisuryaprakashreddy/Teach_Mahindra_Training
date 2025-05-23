package src;

public class palindrom {

    public static boolean isPalindrome(String word) {
        StringBuilder reversedWordBuilder = new StringBuilder(word);
        reversedWordBuilder.reverse();
        String reversedWord = reversedWordBuilder.toString();

        if (word.equals(reversedWord)) {
            System.out.println("It is a palindrome.");
            return true;
        } else {
            System.out.println("It is not a palindrome.");
            return false;
        }
    }

    public static void main(String[] args) {
        String word1 = "CAAC";
        isPalindrome(word1);

        String word2 = "hello";
        isPalindrome(word2);
    }
}