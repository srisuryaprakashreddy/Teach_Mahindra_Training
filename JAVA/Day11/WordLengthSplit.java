

package Day11;

import java.util.Arrays; 
import java.util.List;

public class WordLengthSplit {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        List<String> words = Arrays.asList(sentence.split(" "));

        System.out.println("Sentence: " + sentence);
        System.out.println("\nWord lengths:");

        for (String word : words) {
            System.out.println(word + " -> " + word.length());
        }
    }
}

