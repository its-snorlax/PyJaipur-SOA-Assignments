package week2.day1;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(checkDuplicatie(nums));
    }

    private static boolean checkDuplicatie(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
