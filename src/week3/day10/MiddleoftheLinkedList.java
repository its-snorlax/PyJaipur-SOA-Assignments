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


        deleteNode(node3);
        printList(node1);
        System.out.println();

        printList(swapPairs(node1));
    }

    private static Node swapPairs(Node head) {
        Node result = head.next;

        while (head != null && head.next != null) {
            Node first = head;
            Node second = head.next;
            Node third = second.next;
            Node fourth = third == null ? null : third.next;

            first.next = fourth != null ? fourth : third;
            Node temp = second.next;
            second.next = first;

            head = temp;
        }
        return result;
    }

    private static void printList(Node node1) {
        Node head = node1;
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    private static void deleteNode(Node node3) {
        node3.value = node3.next.value;
        node3.next = node3.next.next;
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
