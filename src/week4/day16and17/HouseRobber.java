package week4.day16and17;

public class HouseRobber {
    public static void main(String[] args) {
//        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
//        System.out.println(rob(new int[]{}));
    }

    private static int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] results = new int[nums.length];
        results[0] = nums[0];
        results[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            results[i] = Math.max(results[i - 1], nums[i] + results[i - 2]);
        }
        return results[length - 1];
    }
}