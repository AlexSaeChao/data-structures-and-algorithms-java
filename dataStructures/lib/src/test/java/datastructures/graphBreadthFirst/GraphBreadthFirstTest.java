package datastructures.graphBreadthFirst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThrows;


public class GraphBreadthFirstTest {
  @Test
  void testBreadthFirstMultipleNodesAndEdges() {
    // Arrange
    Graph graph = new Graph();
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);

    graph.nodes = Arrays.asList(node1, node2, node3, node4, node5);

    graph.addEdge(node1, node2);
    graph.addEdge(node1, node4);
    graph.addEdge(node2, node3);
    graph.addEdge(node3, node4);
    graph.addEdge(node4, node5);

    // Act
    List<Node> visitedOrder = graph.breadthFirst(node1);

    // Assert
    List<Node> expectedOrder = Arrays.asList(node1, node2, node4, node3, node5);
    Assertions.assertEquals(expectedOrder, visitedOrder);
  }

  @Test
  void testBreadthFirstSingleNode() {
    // Arrange
    Graph graph = new Graph();
    Node node1 = new Node(1);

    graph.nodes = Collections.singletonList(node1);

    // Act
    List<Node> visitedOrder = graph.breadthFirst(node1);

    // Assert
    List<Node> expectedOrder = Collections.singletonList(node1);
    Assertions.assertEquals(expectedOrder, visitedOrder);
  }

  @Test
  void testBreadthFirstDisconnectedComponents() {
    // Arrange
    Graph graph = new Graph();
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    Node node7 = new Node(7);

    graph.nodes = Arrays.asList(node1, node2, node3, node4, node5, node6, node7);

    graph.addEdge(node1, node2);
    graph.addEdge(node1, node3);
    graph.addEdge(node4, node5);
    graph.addEdge(node6, node7);

    // Act
    List<Node> visitedOrder = graph.breadthFirst(node1);

    // Assert
    List<Node> expectedOrder = Arrays.asList(node1, node2, node3);
    Assertions.assertEquals(expectedOrder, visitedOrder);
  }

  @Test
  void testBreadthFirstEmptyGraph() {
    // Arrange
    Graph graph = new Graph();
    Node dummyNode = new Node(1); // A node that's not added to the graph

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> graph.breadthFirst(dummyNode));
  }

  @Test
  void testBreadthFirstLoopedEdges() {
    // Arrange
    Graph graph = new Graph();
    Node node1 = new Node(1);
    graph.nodes = Collections.singletonList(node1);
    graph.addEdge(node1, node1); // Loop

    // Act
    List<Node> visitedOrder = graph.breadthFirst(node1);

    // Assert
    List<Node> expectedOrder = Collections.singletonList(node1);
    Assertions.assertEquals(expectedOrder, visitedOrder);
  }

  @Test
  void testBreadthFirstMultipleEdges() {
    // Arrange
    Graph graph = new Graph();
    Node node1 = new Node(1);
    Node node2 = new Node(2);

    graph.nodes = Arrays.asList(node1, node2);
    graph.addEdge(node1, node2);
    graph.addEdge(node1, node2); // Duplicate edge

    // Act
    List<Node> visitedOrder = graph.breadthFirst(node1);

    // Assert
    List<Node> expectedOrder = Arrays.asList(node1, node2);
    Assertions.assertEquals(expectedOrder, visitedOrder);
  }

  @Test
  void testBreadthFirstNonExistentStartNode() {
    // Arrange
    Graph graph = new Graph();
    Node node1 = new Node(1);
    Node nonExistentNode = new Node(999);

    graph.nodes = Collections.singletonList(node1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> graph.breadthFirst(nonExistentNode));
  }

  @Test
  void testBreadthFirstNullStartNode() {
    // Arrange
    Graph graph = new Graph();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> graph.breadthFirst(null));
  }
}
