package week3.day9;

public class LongestUncommonSubsequenceI {
    public static void main(String[] args) {
        System.out.println(findLUSlength("aba", "cdc"));
    }

    private static int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
