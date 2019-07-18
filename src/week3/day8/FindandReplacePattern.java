package week3.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindandReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        System.out.println(findAndReplacePattern(words, pattern));
    }

    private static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> outputs = new ArrayList<>();
        for (String word : words) {
            if (isMatch(word, pattern)) {
                outputs.add(word);
            }
        }
        return outputs;
    }

    private static boolean isMatch(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        HashMap<Character, Character> pattern0 = new HashMap<>();
        HashMap<Character, Character> pattern1 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!pattern0.containsKey(w)) {
                pattern0.put(w, p);
            }
            if (!pattern1.containsKey(p)) {
                pattern1.put(p, w);
            }
            if (pattern0.get(w) != p || pattern1.get(p) != w) {
                return false;
            }
        }
        return true;
    }
}
