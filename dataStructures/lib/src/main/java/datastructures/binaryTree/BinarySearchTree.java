package datastructures.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree extends BinaryTree {

    public void add(Integer value) {
        root = insert(root, value);
    }

    private BinaryTreeNode insert(BinaryTreeNode current, Integer value) {
        if (current == null) {
            return new BinaryTreeNode(value);
        }

        if (value < (Integer) current.value) {
            current.left = insert(current.left, value);
        } else if (value > (Integer) current.value) {
            current.right = insert(current.right, value);
        }

        return current;
    }

    public boolean contains(Integer value) {
        return search(root, value);
    }

    private boolean search(BinaryTreeNode current, Integer value) {
        if (current == null) {
            return false;
        }

        if (value.equals(current.value)) {
            return true;
        } else if (value < (Integer) current.value) {
            return search(current.left, value);
        } else {
            return search(current.right, value);
        }
    }
}
