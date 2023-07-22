package datastructures.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;

public class stackTest {

    private  Stack<Integer> stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack<>();
    }

    @Test
    public void testPush() {
        // Arrange
        int value = 10;

        // Act
        stack.push(value);

        // Assert
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPushMultipleValues() {
        // Arrange
        int value1 = 10;
        int value2 = 20;

        // Act
        stack.push(value1);
        stack.push(value2);

        // Assert
        assertFalse(stack.isEmpty());
        assertEquals(value2, stack.peek());
    }

    @Test
    public void testPop() {
        // Arrange
        int value = 10;
        stack.push(value);

        // Act
        int poppedValue = stack.pop();

        // Assert
        assertEquals(value, poppedValue);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testEmptyStackAfterMultiplePops() {
        // Arrange
        int value1 = 10;
        int value2 = 20;
        stack.push(value1);
        stack.push(value2);

        // Act
        stack.pop();
        stack.pop();

        // Assert
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        // Arrange
        int value = 10;
        stack.push(value);

        // Act
        int peekedValue = stack.peek();

        // Assert
        assertEquals(value, peekedValue);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testInstantiateEmptyStack() {
        // Assert
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopOnEmptyStack() {
        // Assert
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    public void testPeekOnEmptyStack() {
        // Assert
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }

}
