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

    @Test public void testKthFromEnd() {
        // Arrange
        list.insert(2);
        list.insert(8);
        list.insert(3);
        list.insert(1);

        int k = 3;
        int expectedValue = 1;
        // Act
        int actualValue = list.kthFromEnd(k);
        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test public void testKthGreaterThanLength() {
        // Arrange
        // Arrange
        list.insert(2);
        list.insert(8);
        list.insert(3);
        list.insert(1);

        int k = 5; // k is greater than the length of the linked list
        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> list.kthFromEnd(k));
    }

    @Test public void testKthSameAsLength() {
        // Arrange
        list.insert(2);
        list.insert(8);
        list.insert(3);
        list.insert(1);

        int k = 4; // k is the same than the length of the linked list

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> list.kthFromEnd(k));
    }

    @Test public void testKthIsNegativeInt() {
        // Arrange
        list.insert(2);
        list.insert(8);
        list.insert(3);
        list.insert(1);

        int k = -3; // k is a negative number
        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> list.kthFromEnd(k));
    }

    @Test public void testLinkedListSizeOfOne() {
        // Arrange
        list.insert(2);

        int k = 0; // k is a negative number
        int expectedValue = 2;
        // Act and Assert
        int actualValue = list.kthFromEnd(k);
        // Assert

        assertEquals(expectedValue, actualValue);
    }

    @ Test public void testKthFromTheMiddle() {
        // Arrange
        list.insert(2);
        list.insert(8);
        list.insert(3);
        list.insert(1);

        int k = 2;
        int expectedValue = 3;
        // Act
        int actualValue = list.kthFromEnd(k);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testZipLists() {
        // Arrange
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(2);

        LinkedList list2 = new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);

        LinkedList mergedList = new LinkedList();

        // Act
        LinkedList.Node mergedHead = mergedList.zipLists(list1, list2);

        // Assert
        assertNotNull(mergedHead);

        int[] expectedValues = {1, 5, 3, 9, 2, 4};
        LinkedList.Node current = mergedHead;
        for (int expectedValue : expectedValues) {
            assertEquals(expectedValue, current.value);
            current = current.next;
        }

        assertNull(current); // Make sure all nodes have been traversed
    }

    @Test
    public void testZipListsWithDifferentLength() {
        // Arrange
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);

        LinkedList list2 = new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);

        LinkedList mergedList = new LinkedList();

        // Act
        LinkedList.Node mergedHead = mergedList.zipLists(list1, list2);

        // Assert
        assertNotNull(mergedHead);

        int[] expectedValues = {1, 5, 3, 9, 4};
        LinkedList.Node current = mergedHead;
        for (int expectedValue : expectedValues) {
            assertEquals(expectedValue, current.value);
            current = current.next;
        }

        assertNull(current); // Make sure all nodes have been traversed
    }
}
