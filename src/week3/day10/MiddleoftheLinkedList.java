package week3.day10;


import other.Node;

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.value = 1;

        Node node2 = new Node();
        node2.value = 2;
        node1.next = node2;

        Node node3 = new Node();
        node3.value = 3;
        node2.next = node3;

        Node node4 = new Node();
        node4.value = 4;
        node3.next = node4;

        Node node5 = new Node();
        node5.value = 5;
        node4.next = node5;

        System.out.println(middleNode(node1).value);
    }

    private static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
