package week4.day18and19;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }

    private static int climbStairs(int n) {
        int[] series = new int[n + 1];
        series[0] = 1;
        series[1] = 1;
        for (int i = 2; i <= n; i++) {
            series[i] = series[i-2] + series [i-1];
        }

        return series[n];
    }
}
