package contestThree;

public class Staircase {

    public static void main(String[] args) {
        System.out.println(staircase(4)); //7
        System.out.println(staircase(50));
    }

    private static int staircase(int n) {
        if (n < 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        if (n <= 3) {
            return 4;
        }
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }
}
