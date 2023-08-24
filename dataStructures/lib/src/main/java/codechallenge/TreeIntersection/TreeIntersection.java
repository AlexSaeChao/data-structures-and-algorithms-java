package codechallenge.TreeIntersection;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {

  public static class Node {
    int value;
    public Node left;
    public Node right;

    public Node(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }

  public static class Tree<T> {
    public Node root;
  }

  public ArrayList<Integer> findCommonValues(Tree<Integer> tree1, Tree<Integer> tree2) {
    HashSet<Integer> firstTreeSet = preOrderTraversal(tree1.root, new HashSet<>());
    return findCommonValuesPreOrder(tree2.root, new ArrayList<>(), firstTreeSet);
  }

  public HashSet<Integer> preOrderTraversal(Node node, HashSet<Integer> values) {
    if (node == null) {
      return values;
    }
    values.add(node.value);
    preOrderTraversal(node.left, values);
    preOrderTraversal(node.right, values);
    return values;
  }

  public ArrayList<Integer> findCommonValuesPreOrder(Node node, ArrayList<Integer> commonValues, HashSet<Integer> firstTree) {
    if (node == null) {
      return commonValues;
    }

    if (firstTree.contains(node.value)) {
      commonValues.add(node.value);
    }

    findCommonValuesPreOrder(node.left, commonValues, firstTree);
    findCommonValuesPreOrder(node.right, commonValues, firstTree);

    return commonValues;
  }
}