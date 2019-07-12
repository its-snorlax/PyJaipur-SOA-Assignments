package week2.day3;

public class CountNumberswithUniqueDigits {
    public static void main(String[] args) {
        System.out.println(countNumbers(2));
        System.out.println("-------------------------");
        System.out.println(countNumbers(9));

    }

    private static int countNumbers(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;

        for (int i = 1; i <= n; i++) {
            arr[i] = 9;
            for (int j = 9; j >= 9 - i + 2; j--) {
                arr[i] = arr[i] * j;
            }
        }

        int result = 0;
        for (int i : arr) {
            result = result + i;
        }

        return result;
    }
}
