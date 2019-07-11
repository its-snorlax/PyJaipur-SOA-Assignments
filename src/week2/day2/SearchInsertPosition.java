package week2.day2;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] input1 = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(input1, 5));
        System.out.println("-------------------------");

        int[] input2 = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(input2, 2));
        System.out.println("-------------------------");

        int[] input3 = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(input3, 7));
        System.out.println("-------------------------");

        int[] input4 = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(input4, 0));
        System.out.println("-------------------------");


    }

    private static int searchInsert(int[] nums, int target) {
        int temp = 0;
        int length = nums.length-1;
        while (temp <= length){
            int mid = (length+temp)/2;

            if(target > nums[mid]){
                temp = mid + 1;
            }else if (target < nums[mid]){
                length = mid - 1;
            }else {
                return mid;
            }
        }
        return temp;
    }
}
