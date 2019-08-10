package week4.day16and17;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        System.out.println(minFallingPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    private static int minFallingPathSum(int[][] A) {
        int noOfColums = A.length;
        int noOfRows = A[0].length;
        int[][] tempArray = new int[noOfColums][noOfRows];

        for (int i = 0; i < noOfRows; i++) {
            tempArray[0][i] = A[0][i];
        }

        for (int i = 1; i < noOfColums; i++) {
            for (int j = 0; j < noOfRows; j++) {
                if (j == 0) {
                    tempArray[i][j] = Math.min(tempArray[i - 1][j], tempArray[i - 1][j + 1]) + A[i][j];
                } else if (j == noOfRows - 1) {
                    tempArray[i][j] = Math.min(tempArray[i - 1][j], tempArray[i - 1][j - 1]) + A[i][j];
                } else {
                    tempArray[i][j] = Math.min(tempArray[i - 1][j], Math.min(tempArray[i - 1][j - 1], tempArray[i - 1][j + 1])) + A[i][j];
                }
            }
        }

        int output = tempArray[noOfColums-1][0];
        for (int i=1; i<noOfRows;i++){
            output = Math.min(output,tempArray[noOfColums-1][i]);
        }
        return output;
    }
}
