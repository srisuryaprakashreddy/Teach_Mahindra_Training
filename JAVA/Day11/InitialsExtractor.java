package Day11;

public class InitialsExtractor {
    public static String getInitials(String fullName) {
        String[] words = fullName.trim().split(" ");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return initials.toString();
    }

    public static void main(String[] args) {
        System.out.println(getInitials("V Sri Surya Prakash Reddy")); 
        System.out.println(getInitials("Akshay Ram"));              
    }
}
