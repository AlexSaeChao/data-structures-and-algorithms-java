package datastructures.binaryTree;

public class BinaryTreeNode {
    public Object value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(Object value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}