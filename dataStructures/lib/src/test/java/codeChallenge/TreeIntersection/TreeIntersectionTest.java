package codeChallenge.TreeIntersection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import codechallenge.TreeIntersection.TreeIntersection;
import org.junit.jupiter.api.Test;

public class TreeIntersectionTest {

  @Test
  public void testFindCommonValues() {
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    tree1.root = new TreeIntersection.Node(5);
    tree1.root.left = new TreeIntersection.Node(3);
    tree1.root.right = new TreeIntersection.Node(8);
    tree1.root.left.left = new TreeIntersection.Node(2);
    tree1.root.left.right = new TreeIntersection.Node(4);

    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    tree2.root = new TreeIntersection.Node(5);
    tree2.root.left = new TreeIntersection.Node(1);
    tree2.root.right = new TreeIntersection.Node(8);
    tree2.root.left.left = new TreeIntersection.Node(7);
    tree2.root.left.right = new TreeIntersection.Node(3);

    ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5, 3, 8));

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValues(tree1, tree2);

    // Assert
    System.out.println("testFindCommonValues Expected: " + expectedOutput);
    System.out.println("testFindCommonValues Actual: " + result);
    assertEquals(expectedOutput, result);
  }

  @Test
  public void testBothTreesEmpty() {
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();
    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    ArrayList<Integer> expectedOutput = new ArrayList<>();

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValues(tree1, tree2);

    // Assert
    System.out.println("testBothTreesEmpty Expected: " + expectedOutput);
    System.out.println("testBothTreesEmpty Actual: " + result);
    assertEquals(expectedOutput, result);
  }

  @Test
  public void testOneTreeEmpty() {
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    tree1.root = new TreeIntersection.Node(5);

    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    ArrayList<Integer> expectedOutput = new ArrayList<>();

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValues(tree1, tree2);

    // Assert
    System.out.println("testOneTreeEmpty Expected: " + expectedOutput);
    System.out.println("testOneTreeEmpty Actual: " + result);
    assertEquals(expectedOutput, result);
  }

  @Test
  public void testNoCommonValues() {
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    tree1.root = new TreeIntersection.Node(1);
    tree1.root.left = new TreeIntersection.Node(2);
    tree1.root.right = new TreeIntersection.Node(3);

    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    tree2.root = new TreeIntersection.Node(4);
    tree2.root.left = new TreeIntersection.Node(5);
    tree2.root.right = new TreeIntersection.Node(6);
    ArrayList<Integer> expectedOutput = new ArrayList<>();

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValues(tree1, tree2);

    // Assert
    System.out.println("testNoCommonValues Expected: " + expectedOutput);
    System.out.println("testNoCommonValues Actual: " + result);
    assertEquals(expectedOutput, result);
  }

  @Test
  public void testAllValuesCommon() {
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    tree1.root = new TreeIntersection.Node(1);
    tree1.root.left = new TreeIntersection.Node(2);
    tree1.root.right = new TreeIntersection.Node(3);

    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    tree2.root = new TreeIntersection.Node(1);
    tree2.root.left = new TreeIntersection.Node(2);
    tree2.root.right = new TreeIntersection.Node(3);
    ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(1, 2, 3));

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValues(tree1, tree2);

    // Assert
    System.out.println("testAllValuesCommon Expected: " + expectedOutput);
    System.out.println("testAllValuesCommon Actual: " + result);
    assertEquals(expectedOutput, result);
  }

  @Test
  public void testComplexTreesMultipleOverlaps() {
    // (This test can be the one you provided initially)
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    tree1.root = new TreeIntersection.Node(5);
    tree1.root.left = new TreeIntersection.Node(3);
    tree1.root.right = new TreeIntersection.Node(8);
    tree1.root.left.left = new TreeIntersection.Node(2);
    tree1.root.left.right = new TreeIntersection.Node(4);

    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    tree2.root = new TreeIntersection.Node(5);
    tree2.root.left = new TreeIntersection.Node(1);
    tree2.root.right = new TreeIntersection.Node(8);
    tree2.root.left.left = new TreeIntersection.Node(7);
    tree2.root.left.right = new TreeIntersection.Node(3);

    ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5, 3, 8));

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValues(tree1, tree2);

    // Assert
    System.out.println("testComplexTreesMultipleOverlaps Expected: " + expectedOutput);
    System.out.println("testComplexTreesMultipleOverlaps Actual: " + result);

    assertEquals(expectedOutput, result);
  }

  @Test
  public void testExampleOverlap() {
    System.out.println("Running testExampleOverlap...");

    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    tree1.root = new TreeIntersection.Node(150);
    tree1.root.left = new TreeIntersection.Node(100);
    tree1.root.right = new TreeIntersection.Node(250);
    tree1.root.left.left = new TreeIntersection.Node(75);
    tree1.root.left.right = new TreeIntersection.Node(160);
    tree1.root.left.right.left = new TreeIntersection.Node(125);
    tree1.root.left.right.right = new TreeIntersection.Node(175);
    tree1.root.right.left = new TreeIntersection.Node(200);
    tree1.root.right.right = new TreeIntersection.Node(350);
    tree1.root.right.right.left = new TreeIntersection.Node(300);
    tree1.root.right.right.right = new TreeIntersection.Node(500);

    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    tree2.root = new TreeIntersection.Node(42);
    tree2.root.left = new TreeIntersection.Node(100);
    tree2.root.right = new TreeIntersection.Node(600);
    tree2.root.left.left = new TreeIntersection.Node(15);
    tree2.root.left.right = new TreeIntersection.Node(160);
    tree2.root.left.right.left = new TreeIntersection.Node(125);
    tree2.root.left.right.right = new TreeIntersection.Node(175);
    tree2.root.right.left = new TreeIntersection.Node(200);
    tree2.root.right.right = new TreeIntersection.Node(350);
    tree2.root.right.right.left = new TreeIntersection.Node(4);
    tree2.root.right.right.right = new TreeIntersection.Node(500);

    ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(100, 160, 125, 175, 200, 350, 500));

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValues(tree1, tree2);


    System.out.println("testExampleOverlap Expected: " + expectedOutput);
    System.out.println("testExampleOverlap Actual: " + result);

    // Assert
    assertEquals(expectedOutput, result);
  }


  @Test
  public void testPreOrderTraversal() {
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree = new TreeIntersection.Tree<>();
    tree.root = new TreeIntersection.Node(5);
    tree.root.left = new TreeIntersection.Node(3);
    tree.root.right = new TreeIntersection.Node(8);
    tree.root.left.left = new TreeIntersection.Node(2);
    tree.root.left.right = new TreeIntersection.Node(4);
    HashSet<Integer> expectedOutput = new HashSet<>(Arrays.asList(5, 3, 2, 4, 8));

    // Act
    HashSet<Integer> result = treeIntersection.preOrderTraversal(tree.root, new HashSet<>());

    // Assert
    System.out.println("testPreOrderTraversal Expected: " + expectedOutput);
    System.out.println("testPreOrderTraversal Actual: " + result);
    assertEquals(expectedOutput, result);
  }

  @Test
  public void testFindCommonValuesPreOrderBasicOverlap() {
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    tree1.root = new TreeIntersection.Node(5);
    tree1.root.left = new TreeIntersection.Node(3);
    tree1.root.right = new TreeIntersection.Node(8);
    HashSet<Integer> firstTreeSet = new HashSet<>(Arrays.asList(5, 3, 8));

    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    tree2.root = new TreeIntersection.Node(5);
    tree2.root.left = new TreeIntersection.Node(2);
    tree2.root.right = new TreeIntersection.Node(8);
    ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5, 8));

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValuesPreOrder(tree2.root, new ArrayList<>(), firstTreeSet);

    // Assert
    System.out.println("testFindCommonValuesPreOrderBasicOverlap Expected: " + expectedOutput);
    System.out.println("testFindCommonValuesPreOrderBasicOverlap Actual: " + result);
    assertEquals(expectedOutput, result);
  }

  @Test
  public void testFindCommonValuesPreOrderNoOverlap() {
    // Arrange
    TreeIntersection treeIntersection = new TreeIntersection();

    TreeIntersection.Tree<Integer> tree1 = new TreeIntersection.Tree<>();
    tree1.root = new TreeIntersection.Node(1);
    tree1.root.left = new TreeIntersection.Node(2);
    tree1.root.right = new TreeIntersection.Node(3);
    HashSet<Integer> firstTreeSet = new HashSet<>(Arrays.asList(1, 2, 3));

    TreeIntersection.Tree<Integer> tree2 = new TreeIntersection.Tree<>();
    tree2.root = new TreeIntersection.Node(4);
    tree2.root.left = new TreeIntersection.Node(5);
    tree2.root.right = new TreeIntersection.Node(6);
    ArrayList<Integer> expectedOutput = new ArrayList<>();

    // Act
    ArrayList<Integer> result = treeIntersection.findCommonValuesPreOrder(tree2.root, new ArrayList<>(), firstTreeSet);

    // Assert
    System.out.println("testFindCommonValuesPreOrderNoOverlap Expected: " + expectedOutput);
    System.out.println("testFindCommonValuesPreOrderNoOverlap Actual: " + result);
    assertEquals(expectedOutput, result);
  }
}