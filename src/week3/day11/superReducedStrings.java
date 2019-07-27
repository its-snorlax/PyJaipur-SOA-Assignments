package week3.day11;

import java.util.Stack;

public class superReducedStrings {
    public static void main(String[] args) {
        System.out.println(findReducedString("abba"));
        System.out.println(findReducedString("aaabccddd"));
    }

    private static String findReducedString(String input) {


        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(input.charAt(i));
            } else {
                if (stack.peek() == input.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(input.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.length() == 0 ? "Empty String" : output.reverse().toString();
    }
}
