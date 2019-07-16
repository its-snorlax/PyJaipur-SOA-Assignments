package contestOne;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] input = new int[]{0,7,2,5,4,7,1,3,6};
        System.out.println(duplicate(input));
    }

    private static int duplicate(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum - (((arr.length-2)*(arr.length-1))/2);
    }
}
