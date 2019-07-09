package Week1;

public class AlphaPattern {

    static char[] alphabets = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void main(String[] args) {
        printAlphaPattern(5);
        System.out.println("-------------------------------");
        printAlphaPattern(8);
    }

    private static void printAlphaPattern(int input) {
        for (int i=0; i<input;i++){
            for (int j=0;j<=i;j++){
                System.out.print(alphabets[i]);
            }
            System.out.println();
        }
    }
}
