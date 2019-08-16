package contestThree;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println(findEditDistance("abcdef", "azced"));
        System.out.println(findEditDistance("abc", "dc"));
    }

        private static int findEditDistance(String s1, String s2) {

            if (s1.length() == 0) {
                return s2.length();
            }
            if (s2.length() == 0) {
                return s1.length();
            }

            int m = s1.length();
            int n = s2.length();
            int[][] output = new int[m + 1][n + 1];

            for (int i = 0; i < m; i++) {
                output[0][i] = i;
            }
            for (int i = 0; i < n; i++) {
                output[i][0] = i;
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (s1.charAt(m - i) == s2.charAt(n - j)) {
                        output[i][j] = output[i - 1][j - 1];
                    } else {
                        output[i][j] = 1 + Math.min(output[i - 1][j - 1], Math.min(output[i - 1][j], output[i][j - 1]));
                    }
                }
            }

            return output[m][n];
        }
}
