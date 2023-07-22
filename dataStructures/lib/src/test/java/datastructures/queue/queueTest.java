package datastructures.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class queueTest {

    private Queue<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue<>();
    }

    @Test
    public void testEnqueue() {
        // Arrange
        int value = 42;

        // Act
        queue.enqueue(value);

        // Assert
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testEnqueueMultipleValues() {
        // Arrange
        int value1 = 10;
        int value2 = 20;

        // Act
        queue.enqueue(value1);
        queue.enqueue(value2);

        // Assert
        assertFalse(queue.isEmpty());
        assertEquals(value1, queue.peek());
    }

    @Test
    public void testDequeue() {
        // Arrange
        int value = 10;
        queue.enqueue(value);

        // Act
        int dequeuedValue = queue.dequeue();

        // Assert
        assertEquals(value, dequeuedValue);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        // Arrange
        int value = 10;
        queue.enqueue(value);

        // Act
        int peekedValue = queue.peek();

        // Assert
        assertEquals(value, peekedValue);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testEmptyQueueAfterMultipleDequeues() {
        // Arrange
        int value1 = 10;
        int value2 = 20;
        queue.enqueue(value1);
        queue.enqueue(value2);

        // Act
        queue.dequeue();
        queue.dequeue();

        // Assert
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testInstantiateEmptyQueue() {
        // Assert
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueOnEmptyQueue() {
        // Assert
        assertThrows(RuntimeException.class, () -> queue.dequeue());
    }

    @Test
    public void testPeekOnEmptyQueue() {
        // Assert
        assertThrows(RuntimeException.class, () -> queue.peek());
    }
}
