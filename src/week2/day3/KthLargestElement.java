package week2.day3;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] input1 = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargestElement(input1,2));
        System.out.println("--------------");
        int[] input2 = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargestElement(input2,4));
        System.out.println("--------------");
    }

    private static int findKthLargestElement(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
