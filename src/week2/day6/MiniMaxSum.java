package week2.day6;

import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,3,4,5};
        miniMaxSum(input1);
    }

    private static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long max = 0;
        long min = 0;
        for (int i=0;i<arr.length-1;i++){
            min = min + arr[i];
        }
        for(int i=arr.length-1;i>0;i--){
            max = max + arr[i];
        }

        System.out.print(min+" ");
        System.out.print(max);
    }
}
