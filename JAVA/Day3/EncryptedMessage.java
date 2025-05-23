package Day3;

public class EncryptedMessage {

    public static String decode(String encrypted) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < encrypted.length()) {
            char ch = encrypted.charAt(i++);
            int count = 0;

            while (i < encrypted.length() && Character.isDigit(encrypted.charAt(i))) {
                count = count * 10 + (encrypted.charAt(i++) - '0');
            }

            if (count == 0) count = 1;
            for (int j = 0; j < count; j++) result.append(ch);
        }

        return result.toString();
    }

    public static String encode(String plain) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < plain.length()) {
            char ch = plain.charAt(i);
            int count = 1;
            i++;

            while (i < plain.length() && plain.charAt(i) == ch) {
                count++;
                i++;
            }

            result.append(ch);
            if (count > 1) result.append(count); // Skip 1 if asked
            else result.append("1");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode("a3b1c2d"));   // Output: aaabccd
        System.out.println(encode("aaabccd"));   // Output: a3b1c2d
    }
}
