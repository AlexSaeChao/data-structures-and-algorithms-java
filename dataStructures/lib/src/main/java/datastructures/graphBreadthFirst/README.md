# Graph with Breadth-First Search

[//]: # (Used ChatGPT to generate this description and how to run the test.)

## Description

A graph is a data structure that consists of a finite set of vertices (or nodes) and a set of edges connecting these vertices. In a directed graph, edges have directions, meaning they go from one vertex to another, whereas in an undirected graph, edges have no direction.

This repository contains a Java implementation of a graph and a breadth-first search (BFS) algorithm. Breadth-First Search is one of the simplest algorithms for searching a graph and the archetype for many important graph algorithms. It uses a queue data structure to keep track of the nodes that it needs to explore. Starting from a particular node, it explores all of its neighbors at present depth before moving on to nodes at the next level of depth.

The `Graph` class offers a method named `breadthFirst` that performs the BFS algorithm, starting from a given node and returning a list of nodes in the order they were visited.

## Testing

The correctness of the `breadthFirst` method in the `Graph` class is validated through a series of unit tests, designed to cover a range of scenarios including:

1. A graph with multiple nodes and edges.
2. A graph with a single node.
3. A graph with disconnected components.
4. An empty graph.
5. A graph containing loops (edges from a node to itself).
6. A graph with multiple edges between the same pair of nodes.
7. Starting the BFS from a non-existent node in the graph.
8. Starting the BFS from a `null` node.

These tests follow the Arrange-Act-Assert (AAA) pattern, ensuring that each aspect of the `breadthFirst` method's behavior is accurately tested. For exception conditions, `assertThrows` is used to confirm that the method behaves as expected.

## How to Run the Test

To run the tests for the `Graph` and `breadthFirst` method, ensure you have JUnit set up in your Java project.

1. Clone or download this repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ, or Visual Studio Code).
3. Navigate to the `GraphBreadthFirstTest.java` file in the `src/test/datastructures/graphBreadthFirst` directory.
4. Right-click on the `GraphBreadthFirstTest.java` file and choose "Run As" or "Run Test" (depending on your IDE).

By running these tests, you can confirm the validity of the `breadthFirst` method, ensuring it meets all specified requirements and edge cases.
