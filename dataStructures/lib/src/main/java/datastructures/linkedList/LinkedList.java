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