package Week1;

import java.util.ArrayList;
import java.util.Collections;

public class Alternatives {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -1, -2, -3};
        sortArray(arr);
        arr = new int[]{8405, -5231};
        sortArray(arr);
    }

    private static void sortArray(int[] arr) {
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeNumbers.add(arr[i]);
            } else {
                positiveNumbers.add(arr[i]);
            }
        }
        Collections.sort(negativeNumbers,Collections.reverseOrder());
        Collections.sort(positiveNumbers);

        int size = 0;
        for (int i=0; i<negativeNumbers.size();i++){
            arr[size] = positiveNumbers.get(i);
            arr[size+1] = negativeNumbers.get(i);
            size = size + 2;
        }

        for (int a: arr){
            System.out.print(a);
        }
    }
}
