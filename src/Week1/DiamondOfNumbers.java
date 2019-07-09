package Week1;

public class DiamondOfNumbers {
    public static void main(String[] args) {
        printDiamondOfNumbers(5);
        System.out.println("-------------------------");
        printDiamondOfNumbers(7);
        System.out.println("-------------------------");
        printDiamondOfNumbers(8);
    }

    private static void printDiamondOfNumbers(int input) {

        if(input%2 == 0){
            input++;
        }

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
            System.out.print(j);
        }
        System.out.println();
    }
}