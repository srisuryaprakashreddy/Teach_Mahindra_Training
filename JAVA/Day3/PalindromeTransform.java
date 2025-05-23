package Day3;

public class PalindromeTransform {

    public static String canBePalindrome(String s, int k) {
        int n = s.length();
        int lps = longestPalindromicSubseq(s);
        int deletionsNeeded = n - lps;
        return deletionsNeeded <= k ? String.valueOf(deletionsNeeded) : "Not Possible";
    }

    private static int longestPalindromicSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Base case: single character is a palindrome
        for (int i = 0; i < n; i++) dp[i][i] = 1;

        // Build the table
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(canBePalindrome("abcda", 1)); // Not Possible
        System.out.println(canBePalindrome("abcba", 0)); // 0
    }
}
