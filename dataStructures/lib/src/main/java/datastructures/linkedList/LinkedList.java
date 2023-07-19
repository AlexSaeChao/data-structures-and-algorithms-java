package datastructures.linkedList;


public class LinkedList {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;  // not strictly required

    public Node zipLists(LinkedList list1, LinkedList list2) {
        Node head1 = list1.head;
        Node head2 = list2.head;
        Node mergedHead = new Node(0);
        Node current = mergedHead;

        while (head1 != null && head2 != null) {
            current.next = head1;
            head1 = head1.next;
            current = current.next;

            current.next = head2;
            head2 = head2.next;
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        }

        if (head2 != null) {
            current.next = head2;
        }

        return mergedHead.next;
    }


    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        this.head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head != null && head.value == value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        if (head == null) {
            newNode.next = null;
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.value == value) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head != null && head.value == value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        if (head == null) {
            newNode.next = null;
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.value == value) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public int kthFromEnd(int k) {
        if (head == null || k < 0) {
            throw new IllegalArgumentException("Invalid value of k or empty list");
        }

        Node placeHolderNode = head;
        Node targetNode = head;

        // Move the placeHolderNode pointer k places ahead first
        for (int i = 0; i < k; i++) {
            placeHolderNode = placeHolderNode.next;
            if (placeHolderNode == null) {
                throw new IllegalArgumentException("k exceeds the list length!");
            }
        }

        // Move both pointers until the placeHolderNode pointer reaches the end
        while (placeHolderNode.next != null) {
            placeHolderNode = placeHolderNode.next;
            targetNode = targetNode.next;
        }

        return targetNode.value;
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringB = new StringBuilder();
        Node current = head;
        while (current != null) {
            stringB.append(current.value).append(" -> ");
            current = current.next;
        }
        stringB.append("null");
        return stringB.toString();
    }
}