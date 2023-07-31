package datastructures.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    BinaryTreeNode root;

    public List<Integer> preOrderTraversal() {
        List<Integer> outputValues = new ArrayList<>();
        preOrder(root, outputValues);
        return outputValues;
    }

    void preOrder(BinaryTreeNode current, List outputValues) {
        if (current != null) {
            outputValues.add(current.value);
            preOrder(current.left, outputValues);
            preOrder(current.right, outputValues);
        }
    }


    public List<Integer> inOrderTraversal() {
        List<Integer> outputValues = new ArrayList<>();
        inOrder(root, outputValues);
        return outputValues;
    }

    private void inOrder(BinaryTreeNode current, List outputValues) {
        if (current != null) {
            inOrder(current.left, outputValues);
            outputValues.add(current.value);
            inOrder(current.right, outputValues);
        }
    }

    public List<Integer> postOrderTraversal() {
        List<Integer> outputValues = new ArrayList<>();
        postOrder(root, outputValues);
        return outputValues;
    }


    private void postOrder(BinaryTreeNode current, List outputValues) {
        if (current != null) {
            postOrder(current.left, outputValues);
            postOrder(current.right, outputValues);
            outputValues.add(current.value);
        }
    }

    public int findMaximumValue() {
        if (root == null) {
            throw new IllegalArgumentException("The tree is empty.");
        }

        return findMaximumValue(root);
    }

    private int findMaximumValue(BinaryTreeNode current) {
        int currentValue = (Integer) current.value;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        if (current.left != null) {
            leftMax = findMaximumValue(current.left);
        }

        if (current.right != null) {
            rightMax = findMaximumValue(current.right);
        }

        return Math.max(currentValue, Math.max(leftMax, rightMax));
    }
}


