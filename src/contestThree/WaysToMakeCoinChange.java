package contestThree;

public class WaysToMakeCoinChange {
    public static void main(String[] args) {
        System.out.println(countWaysToMakeChange(new int[]{1, 2, 3}, 4));
        System.out.println(countWaysToMakeChange(new int[]{1, 2, 3}, 5));
    }

    private static int countWaysToMakeChange(int[] denominations, int value) {
        int[][] output = new int[denominations.length + 1][value + 1];
        for (int i = 0; i < denominations.length; i++) {
            output[i][0] = 1;
        }
//        for (int j = 1; j < value; j++) {
//            output[0][j] = 1;
//        }

        for (int i = 1; i <= denominations.length; i++) {
            for (int j = 1; j <= value; j++) {
                if (denominations[i - 1] > j) {
                    output[i][j] = output[i - 1][j];
                } else {
                    output[i][j] = output[i][j - denominations[i - 1]] + output[i - 1][j];
                }
            }
        }

        return output[denominations.length][value];
    }
}
