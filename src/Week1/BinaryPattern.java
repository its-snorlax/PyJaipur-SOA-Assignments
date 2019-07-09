package Week1;

public class BinaryPattern {

    public static void main(String[] args) {
        print(3);
        System.out.println("-------------------------");
        print(6);
        System.out.println("-------------------------");
        print(8);
        System.out.println("-------------------------");
        print(10);
        System.out.println("-------------------------");
        print(15);
    }

    private static void print(int number) {
        int temp = number;

        for (int rowCount = 1; rowCount <= number; rowCount++) {
            if (rowCount % 2 == 0) {
                printZero(temp);
            } else {
                printOne(temp);
            }
            temp--;
        }
    }

    private static void printZero(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(0);
        }
        System.out.println();
    }

    private static void printOne(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(1);
        }
        System.out.println();
    }
}