package week4.day15;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementinSize2NArray {
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1, 2, 3, 3}));
        System.out.println(repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        System.out.println(repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }

    private static int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : A) {
            if (!hashMap.containsKey(a)) {
                hashMap.put(a, 1);
            } else {
                Integer value = hashMap.get(a);
                hashMap.put(a, value + 1);
            }
        }
        int maxValue = 0;
        int output = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            maxValue = Math.max(maxValue, entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (maxValue == entry.getValue()) {
                output = entry.getKey();
            }
        }
        return output;
    }
}
