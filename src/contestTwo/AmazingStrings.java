package contestTwo;

public class AmazingStrings {
    public static void main(String[] args) {
        isAmazingString("PAPAINOEL", "JOULUPUKKI", "JOULNAPAOILELUPUKKI");
    }

    private static void isAmazingString(String s1, String s2, String s3) {
        int[] S1 = new int[256];
        int[] S2 = new int[256];
        int[] S3 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            S1[c] = S1[c] + 1;
        }
        for (int i = 0; i < s2.length(); i++) {
            S2[s2.charAt(i)]++;
        }
        for (int i = 0; i < s3.length(); i++) {
            S3[s3.charAt(i)]++;
        }

        if(getResult(S1, S2, S3)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean getResult(int[] s1, int[] s2, int[] s3) {
        for (int i = 0; i < 256; i++){
            if (s3[i] != s1[i] +  s2[i]){
                return false;
            }
        }
        return true;
    }

}
