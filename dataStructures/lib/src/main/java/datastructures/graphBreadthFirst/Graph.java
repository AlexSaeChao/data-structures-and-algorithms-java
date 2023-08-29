package datastructures.graphBreadthFirst;

import java.util.*;

class Node {
  public int value;
  public List<Node> neighbors;

//Used to add edges
  public Node(int value) {
    this.value = value;
    this.neighbors = new ArrayList<>();
  }
}
public class Graph {
  public List<Node> nodes;

  public Graph() {
    nodes = new ArrayList<>();
  }

  // Adds a node to the graph
  public void addNode(int value) {
    nodes.add(new Node(value));
  }

  // Add an edge between nodes/vertices
  public void addEdge(Node a, Node b) {
    a.neighbors.add(b);
    b.neighbors.add(a);
  }

  public List<Node> breadthFirst(Node startNode) {
    if (startNode == null) {
      throw new IllegalArgumentException("Starting node cannot be null");
    }
    if (nodes.isEmpty()) {
      throw new IllegalArgumentException("Graph is empty");
    }
    if (!nodes.contains(startNode)) {
      throw new IllegalArgumentException("Starting node does not exist in graph");
    }
    List<Node> visitedOrder = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();

    // Using a Set to keep track of visited nodes
    Set<Node> visited = new HashSet<>();

    queue.add(startNode);
    visited.add(startNode);

    while (!queue.isEmpty()) {
      Node currentNode = queue.poll();
      visitedOrder.add(currentNode);

      for (Node neighbor : currentNode.neighbors) {
        if (!visited.contains(neighbor)) {
          queue.add(neighbor);
          visited.add(neighbor);
        }
      }
    }

    return visitedOrder;
  }
}

