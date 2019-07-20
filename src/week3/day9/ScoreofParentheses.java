package week3.day9;

import java.util.Stack;

public class ScoreofParentheses {
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("(())"));
        System.out.println(scoreOfParentheses("()()"));
        String s1 = "(()(()))";
        System.out.println(scoreOfParentheses(s1));
    }

    private static int scoreOfParentheses(String string) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack.push(0);
            } else {
                int currentScore = stack.pop();
                int previousScore = stack.pop();

                stack.push(previousScore + Math.max(currentScore * 2, 1));
            }
        }

        return stack.pop();
    }
}