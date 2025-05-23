package Day3;
import java.util.*;

public class SmartSearchSuggestion {

    public static List<String> getTopSuggestions(List<String> history, String prefix, int topN) {
        Map<String, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequencies
        for (String word : history) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Filter words that match the prefix
        List<String> filtered = new ArrayList<>();
        for (String word : freqMap.keySet()) {
            if (word.startsWith(prefix)) {
                filtered.add(word);
            }
        }

        // Step 3: Sort by frequency desc, then lexicographically
        filtered.sort((a, b) -> {
            int freqCompare = freqMap.get(b) - freqMap.get(a); // Descending freq
            return freqCompare != 0 ? freqCompare : a.compareTo(b); // Lexicographical if same freq
        });

        // Step 4: Return top N suggestions
        return filtered.subList(0, Math.min(topN, filtered.size()));
    }

    public static void main(String[] args) {
        List<String> history = Arrays.asList("apple", "app", "application", "app", "apple", "apex", "apply");
        String prefix = "app";
        int topN = 3;
        System.out.println(getTopSuggestions(history, prefix, topN)); // Output: [app, apple, application]
    }
}

