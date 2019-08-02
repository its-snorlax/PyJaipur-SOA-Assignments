package contestTwo;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabccba"));
    }

    private static String removeConsecutiveDuplicates(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() != s.charAt(i)) {
                    stack.push(s.charAt(i));
                }
            }
        }

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.reverse().toString();
    }
}
