package Day10;

import java.util.Arrays;
import java.util.List;

public class WordLengthPrinter {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        // Split the sentence into words
        List<String> words = Arrays.asList(sentence.split(" "));

        System.out.println("Sentence: " + sentence);
        System.out.println("\nWord lengths:");

        // Print length of each word
        for (String word : words) {
            System.out.println(word + " -> " + word.length());
        }
    }
}

