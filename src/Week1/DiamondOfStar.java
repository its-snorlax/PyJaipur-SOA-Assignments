package Week1;

public class DiamondOfStar {
    public static void main(String[] args) {
        printDiamondOfStar(5);
        System.out.println("----------------------------------");
        printDiamondOfStar(7);
    }

    private static void printDiamondOfStar(int input) {
        for (int i = 1; i <= input; i = i + 2) {
            printPattern(input, i);
        }

        for (int i = input-2; i >= 1; i = i - 2) {
            printPattern(input, i);
        }
    }

    private static void printPattern(int input, int i) {
        int spaceLimit = (input - i) / 2;
        for (int j = 1; j <= spaceLimit; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
           System.out.print("*");
        }
        System.out.println();

    }
}
