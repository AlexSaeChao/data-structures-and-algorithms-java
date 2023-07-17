package datastructures.linkedList;

public class LinkedList
{
    Node head = null;
    Node tail = null;  // not strictly required

    public void insert(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        this.head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    public void append(int value)
    {
        Node newNode = new Node(value);
        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertBefore(int value, int newValue)
    {
        Node newNode = new Node(newValue);
        if (head != null && head.value == value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        if(head == null) {
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

    public void insertAfter(int value, int newValue)
    {
        Node newNode = new Node(newValue);
        if (head != null && head.value == value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        if(head == null) {
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


    public boolean includes(int value)
    {
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
    public String toString()
    {
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