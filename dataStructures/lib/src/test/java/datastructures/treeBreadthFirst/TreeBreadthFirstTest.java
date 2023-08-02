package datastructures.treeBreadthFirst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TreeBreadthFirstTest {
    @Test
    void BreadthFirst_NullTree_test() {
        // Arrange
        TreeBreadthFirst treeBreadthFirst = new TreeBreadthFirst();
        TreeNode root = null;

        // Act
        List<Integer> result = treeBreadthFirst.breadthFirst(root);

        // Assert
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void BreadthFirst_SampleTree_test() {
        // Arrange
        TreeBreadthFirst treeBreadthFirst = new TreeBreadthFirst();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Act
        List<Integer> result = treeBreadthFirst.breadthFirst(root);

        // Assert
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void BreadthFirst_OneNode_test() {
        // Arrange
        TreeBreadthFirst treeBreadthFirst = new TreeBreadthFirst();
        TreeNode root = new TreeNode(1);

        // Act
        List<Integer> result = treeBreadthFirst.breadthFirst(root);

        // Assert
        List<Integer> expected = Collections.singletonList(1);
        Assertions.assertEquals(expected, result);
    }
}
