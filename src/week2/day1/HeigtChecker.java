package week2.day1;

import java.util.Arrays;

public class HeigtChecker {
    public static void main(String[] args) {
        int[] input = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(input));
    }

    private static int heightChecker(int[] heights) {

        int count = 0;
        int[] sortedArray = new int[heights.length];
        for (int i=0 ; i<heights.length;i++) {
            sortedArray[i] = heights[i];
        }
        Arrays.sort(sortedArray);

        for (int i=0;i<sortedArray.length;i++){
            if(sortedArray[i] != heights[i]){
                count++;
            }
        }

        return count;
    }
}
