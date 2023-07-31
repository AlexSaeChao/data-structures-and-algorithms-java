package datastructures.binaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

        // Assert
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

        // Assert
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected, result);
    }

    @Test
    public void testInstantiateEmptyTree() {
        // Assert
        assertNull(binarySearchTree.root);
    }

    @Test
    public void testInstantiateTreeWithSingleRootNode() {
        // Arrange & Act
        binarySearchTree.add(5);

        // Assert
        assertNotNull(binarySearchTree.root);
        assertEquals(5, binarySearchTree.root.value);
        assertNull(binarySearchTree.root.left);
        assertNull(binarySearchTree.root.right);
    }

    @Test
    public void testAddLeftAndRightChildToNode() {
        // Arrange
        binarySearchTree.add(5);

        // Act
        binarySearchTree.add(3);
        binarySearchTree.add(7);

        // Assert
        assertNotNull(binarySearchTree.root.left);
        assertEquals(3, binarySearchTree.root.left.value);

        assertNotNull(binarySearchTree.root.right);
        assertEquals(7, binarySearchTree.root.right.value);
    }


    @Test
    public void testContainsExistingValue() {
        // Arrange
        binarySearchTree.add(5);
        binarySearchTree.add(3);
        binarySearchTree.add(7);
        binarySearchTree.add(2);
        binarySearchTree.add(4);

        // Act
        boolean result = binarySearchTree.contains(4);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testContainsNonExistingValue() {
        // Arrange
        binarySearchTree.add(5);
        binarySearchTree.add(3);
        binarySearchTree.add(7);
        binarySearchTree.add(2);
        binarySearchTree.add(4);

        // Act
        boolean result = binarySearchTree.contains(6);

        // Assert
        assertFalse(result);
    }
}
