package week3.day11;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(findMinCostClimbingStairs(new int[]{10, 15, 20}));
    }

    private static int findMinCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] = cost[i] + Math.min(cost[i - 2], cost[i - 1]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
