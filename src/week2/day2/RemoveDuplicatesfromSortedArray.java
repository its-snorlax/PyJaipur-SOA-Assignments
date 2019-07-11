package week2.day2;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums));
        System.out.println("--------------------------");
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int tempIndex = 0;
        if (nums.length == 0) {
            return tempIndex;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[tempIndex] = nums[i];
                tempIndex++;
            }
        }
        nums[tempIndex++] = nums[nums.length - 1];
        return tempIndex;
    }
}
