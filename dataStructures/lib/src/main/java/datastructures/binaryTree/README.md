# Binary Search Tree

[//]: # (used ChatGPT to generate this description and how to run test.)

## Description

The Binary Search Tree is a data structure that allows efficient searching, insertion, and deletion operations. It is a binary tree, where each node has at most two children – a left child and a right child. The Binary Search Tree maintains a property that the value of a node's left child is less than the node's value, and the value of a node's right child is greater than the node's value. This property ensures that searching for an element can be done efficiently by comparing the target value with the current node's value and navigating left or right accordingly.

This repository contains a Java implementation of a Binary Search Tree, which includes the `BinarySearchTree` class. The `BinarySearchTree` class provides methods for adding elements to the tree following the binary search tree property and checking if a given value exists in the tree using the `contains` method.

## How to Run the Test

To run the tests for the `BinarySearchTree` class, ensure you have JUnit set up in your Java project.

1. Clone or download this repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ, or Visual Studio Code).
3. Navigate to the `BinarySearchTreeTest.java` file in the `src/test` directory.
4. Right-click on the `BinarySearchTreeTest.java` file and choose "Run As" or "Run Test" (depending on your IDE).

The test suite will be executed, and the results will be displayed in the test runner.

Make sure the test methods cover various scenarios, such as adding elements to the tree, checking if a value exists in the tree, handling duplicates, and validating the correctness of the tree's structure and traversals (in-order, pre-order, and post-order).

Following these steps will help you verify the functionality and accuracy of the `BinarySearchTree` class implementation.
