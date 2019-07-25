package week3.day12;

import java.util.Stack;

public class ImplementQueueusingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.peek();  // returns 1
        queue.pop();   // returns 1
        queue.empty(); // returns false
    }

    private static class MyQueue {

        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2= new Stack<>();

        public void push(int x) {
            if (stack1.isEmpty()){
                stack1.push(x);
            }else{
                while (stack1.size() != 0){
                    stack2.push(stack1.pop());
                }
                stack1.push(x);
                while (stack2.size() != 0){
                    stack1.push(stack2.pop());
                }
            }
        }

        public int pop() {
            return stack1.pop();
        }

        public int peek() {
           return stack1.peek();
        }

        public boolean empty() {
            return stack1.empty();
        }
    }
}
