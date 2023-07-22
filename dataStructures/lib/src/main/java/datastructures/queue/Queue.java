package datastructures.queue;

import datastructures.queue.Node;

public class Queue<T> {
    Node<T> front;
    Node<T> back;

    void enqueue(T valueToEnqueue) {
        Node<T> newNode = new Node<>(valueToEnqueue);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }

        T dqValue = front.value;
        front = front.next;

        if (front == null) {
            // If the queue becomes empty after dqing, update 'back' to null as well
            back = null;
        }

        return dqValue;
    }

    T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        }

        return front.value;
    }

    boolean isEmpty() {
        return front == null;
    }
}
