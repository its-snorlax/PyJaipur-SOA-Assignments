package week3.day12;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
        System.out.println(validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
    }

    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int popedPosition = 0;
        for (int counter = 0; counter < pushed.length; counter++) {
            stack.push(pushed[counter]);
            while (!stack.isEmpty() && stack.peek() == popped[popedPosition]) {
                stack.pop();
                popedPosition++;
            }
        }
        return popedPosition == popped.length;
    }
}
