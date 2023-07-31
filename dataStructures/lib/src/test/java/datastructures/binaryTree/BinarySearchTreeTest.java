package datastructures.binaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTest {

    private BinarySearchTree binarySearchTree;

    @BeforeEach
    public void setUp() {
        binarySearchTree = new BinarySearchTree();
    }

    @Test
    public void testAddAndContains() {
        // Arrange
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(5);

        // Act
        boolean result1 = binarySearchTree.contains(3);
        boolean result2 = binarySearchTree.contains(6);

        // Assert
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    public void testContainsWithEmptyTree() {
        // Act
        boolean result = binarySearchTree.contains(5);

        // Assert
        assertFalse(result);
    }


    @Test
    public void testInOrderTraversal() {
        // Arrange
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(5);

        // Act
        List<Integer> result = binarySearchTree.inOrderTraversal();

        // Assert - Used ChatGPT to figure out how to assert the tests for traversal
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testPreOrderTraversal() {
        // Arrange
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(5);

        // Act
        List<Integer> result = binarySearchTree.preOrderTraversal();

        // Assert
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testPostOrderTraversal() {
        // Arrange
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(5);

        // Act
        List<Integer> result = binarySearchTree.postOrderTraversal();

        //
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected, result);
    }
}
