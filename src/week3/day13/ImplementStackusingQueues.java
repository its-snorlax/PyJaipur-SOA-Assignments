package week3.day13;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());   // returns 2
        System.out.println(stack.empty()); // returns false
    }

    private static class MyStack {

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        void push(int i) {
            if(queue1.isEmpty()){
               queue1.add(i);
            }else {
                while (queue1.size() != 0){
                    queue2.add(queue1.remove());
                }
                queue1.add(i);
                while (queue2.size() != 0){
                    queue1.add(queue2.remove());
                }
            }
        }

        int top() {
            return queue1.peek();
        }

        int pop() {
            return queue1.remove();
        }

        boolean empty() {
            return queue1.isEmpty();
        }
    }
}
