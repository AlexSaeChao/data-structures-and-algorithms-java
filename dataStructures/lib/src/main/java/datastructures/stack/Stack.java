package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T> {
    Node<T> top;

    void push(T valueToPush) {
        Node<T> newNode = new Node<>(valueToPush);
        newNode.next = top;
        top = newNode;
    }

    T pop() {
        Node<T> curr = top;
        top = top.next;

        return curr.value;
    }

    T peek() {
        Node<T> curr = top;
        return curr.value;
    }

    boolean isEmpty() {
        Node<T> curr = top;
        if (curr == null){
            return true;
        } else {
            return false;
        }
    }
}

