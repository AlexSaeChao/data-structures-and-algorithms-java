package datastructures.linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList list;

    @BeforeEach public void setUp() {
        list = new LinkedList();
    }

    @Test public void testEmptyLinkedList() {
        // Arrange

        // Act

        // Assert
        assertNull(list.head);
        assertNull(list.tail);
    }

    @Test public void testInsertIntoLinkedList() {
        // Arrange

        // Act
        list.insert(10);

        // Assert
        assertNotNull(list.head);
        assertEquals(10, list.head.value);
        assertNotNull(list.tail);
    }

    @Test public void testMultipleInsertions() {
        // Arrange

        // Act
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Assert
        assertNotNull(list.head);
        assertEquals(30, list.head.value);
        assertNotNull(list.tail);
        assertEquals(10, list.tail.value);
    }

    @Test public void testIncludes() {
        // Arrange
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Act

        // Assert
        assertTrue(list.includes(10));
        assertTrue(list.includes(20));
        assertTrue(list.includes(30));
        assertFalse(list.includes(40));
        assertFalse(list.includes(50));
    }

    @Test public void testToString() {
        // Arrange
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Act

        // Assert
        assertEquals("30 -> 20 -> 10 -> null", list.toString());
    }

    @Test public void testAppend() {
        // Arrange
        list.append(10);
        // Act

        // Assert
        assertEquals("10 -> null", list.toString());
    }

    @Test public void testInsertBefore() {
        // Arrange
        list.insert(20);
        list.insert(15);
        list.insert(5);
        list.insertBefore(15, 10);
        // Act

        // Assert
        assertEquals("5 -> 10 -> 15 -> 20 -> null", list.toString());
    }

    @Test public void testInsertBeforeEmptyList() {
        // Arrange
        list.insertBefore(15, 10);
        // Act

        // Assert
        assertEquals("10 -> null", list.toString());
    }

    @Test public void testInsertAfter() {
        // Arrange
        list.insert(20);
        list.insert(10);
        list.insert(5);
        list.insertAfter(10, 15);
        // Act

        // Assert
        assertEquals("5 -> 10 -> 15 -> 20 -> null", list.toString());
    }

    @Test public void testInsertAfterEmptyList() {
        // Arrange
        list.insertAfter(15, 10);
        // Act

        // Assert
        assertEquals("10 -> null", list.toString());
    }
}
