package Week1;

public class InterestingAlphabets {
    static char[] alphabets = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void main(String[] args) {
        printPattern(8);
        System.out.println("-------------------------------");
        printPattern(5);
    }

    private static void printPattern(int upperLimit) {
        for(int lowerLimit = upperLimit-1; lowerLimit>=0;lowerLimit--){
            for (int i = lowerLimit; i<=upperLimit-1; i++){
                System.out.print(alphabets[i]);
            }
            System.out.println();
        }
    }
}
