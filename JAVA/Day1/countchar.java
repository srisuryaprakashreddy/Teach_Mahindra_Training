package src;
import java.util.Scanner;

public class countchar {
    public static int countChar(String word, char target) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String word = "engineering";
        char target = 'e';
        int occurrences = countChar(word, target);
        System.out.println("The character '" + target + "' appears " + occurrences + " times in the word \"" + word + "\"");
    }
}