package week3.day7;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(firstUniqChar(str));
        System.out.println("-------------------");
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }

    private static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!hashMap.containsKey(current)) {
                hashMap.put(current, i);
            }else {
                hashMap.put(current,-1);
            }
        }

        int index = Integer.MAX_VALUE;

        for (char c :hashMap.keySet()) {
            if (hashMap.get(c)>-1 && hashMap.get(c) < index){
                index = hashMap.get(c);
            }
        }

        return index;
    }
}
