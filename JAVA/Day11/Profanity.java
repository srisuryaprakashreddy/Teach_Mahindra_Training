package Day11;

public class Profanity {

    public static boolean containsProfanity(String comment, String[] badWords) {
        String lowerComment = comment.toLowerCase();

        for (String word : badWords) {
            if (lowerComment.contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] badWords = { "bad", "ugly", "stupid" };

        String[] comments = {
            "You are so stupid!",
            "Nice work!",
            "What an ugly design.",
            "I had a bad experience.",
            "Everything is awesome!"
        };

        for (String comment : comments) {
            System.out.println("\"" + comment + "\" -> " + containsProfanity(comment, badWords));
        }
    }
}
