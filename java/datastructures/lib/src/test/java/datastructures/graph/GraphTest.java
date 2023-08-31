package datastructures.graph;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

  @Test
  public void testAddVertex() {
    Graph<Integer> sut = new Graph<>(10);

    Vertex<Integer> vertex = sut.addVertex(42);

    assertNotNull(vertex);
    assertEquals(42, vertex.getValue());

    String graphString = sut.toString();
    assertTrue(graphString.contains("42"));
  }

  @Test
  public void testAddEdge() {
    Graph<Integer> graph = new Graph<>(10);

    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);

    graph.addEdge(vertex1, vertex2, 5);

    LinkedList<Edge<Integer>> adjacencyList1 = graph.adjacencyLists.get(vertex1);
    assertEquals(1, adjacencyList1.size());

    Edge<Integer> edge = adjacencyList1.get(0);
    assertEquals(vertex2, edge.getDestination());
    assertEquals(5, edge.getWeight());
  }
  @Test
  public void testGetVertices() {
    Graph<Integer> graph = new Graph<>(10);
    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);
    Vertex<Integer> vertex3 = graph.addVertex(3);

    LinkedList<Vertex<Integer>> vertices = graph.getVertices();

    assertTrue(vertices.contains(vertex1));
    assertTrue(vertices.contains(vertex2));
    assertTrue(vertices.contains(vertex3));
  }

  @Test
  public void testGetNeighborsWithoutWeight() {
    Graph<Integer> graph = new Graph<>(10);

    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);

    graph.addEdge(vertex1, vertex2);
    LinkedList<Edge<Integer>> neighbors = graph.getNeighbors(vertex1);
    Edge<Integer> neighborEdge = neighbors.get(0);

    assertEquals(vertex2, neighborEdge.getDestination());
    assertEquals(0, neighborEdge.getWeight());
  }


  @Test
  public void testGetNeighborsWithWeight() {
    Graph<Integer> graph = new Graph<>(10);

    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);
    graph.addEdge(vertex1, vertex2, 10);
    LinkedList<Edge<Integer>> neighbors = graph.getNeighbors(vertex1);
    Edge<Integer> neighborEdge = neighbors.get(0);
    assertEquals(vertex2, neighborEdge.getDestination());
    assertEquals(10, neighborEdge.getWeight());
  }

  @Test
  public void testGetSize() {
    Graph<Integer> graph = new Graph<>(10);

    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);
    Vertex<Integer> vertex3 = graph.addVertex(3);

    int actual = graph.size();
    assertEquals(3, actual);
  }

  @Test
  public void testSingleVertexAndEdge() {
    Graph<Integer> graph = new Graph<>(10);

    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);

    graph.addEdge(vertex1, vertex2, 5);

    LinkedList<Edge<Integer>> neighbors = graph.getNeighbors(vertex1);

    assertEquals(1, neighbors.size());

    Edge<Integer> neighborEdge = neighbors.get(0);
    assertEquals(vertex2, neighborEdge.getDestination());
    assertEquals(5, neighborEdge.getWeight());
  }

  @Test
  void testBreadthFirstTraversal() {
    Graph<Integer> graph = new Graph<>(5);
    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);
    Vertex<Integer> vertex3 = graph.addVertex(3);
    Vertex<Integer> vertex4 = graph.addVertex(4);

    graph.addEdge(vertex1, vertex2);
    graph.addEdge(vertex1, vertex3);
    graph.addEdge(vertex2, vertex4);
    graph.addEdge(vertex3, vertex4);

    List<Vertex<Integer>> traversal = graph.breadthFirst(vertex1);

    assertEquals(4, traversal.size());
    assertTrue(traversal.contains(vertex1));
    assertTrue(traversal.contains(vertex2));
    assertTrue(traversal.contains(vertex3));
    assertTrue(traversal.contains(vertex4));
  }

  @Test
  void testBreadthFirstTraversalDisconnectedGraph() {
    Graph<String> graph = new Graph<>(5);
    Vertex<String> vertexA = graph.addVertex("A");
    Vertex<String> vertexB = graph.addVertex("B");
    Vertex<String> vertexC = graph.addVertex("C");

    graph.addEdge(vertexA, vertexB);

    List<Vertex<String>> traversal = graph.breadthFirst(vertexA);

    assertEquals(2, traversal.size());
    assertTrue(traversal.contains(vertexA));
    assertTrue(traversal.contains(vertexB));
    assertFalse(traversal.contains(vertexC));
  }

  @Test
  void testBreadthFirstTraversalSingleNodeGraph() {
    Graph<Double> graph = new Graph<>(1);
    Vertex<Double> vertex = graph.addVertex(3.14);

    List<Vertex<Double>> traversal = graph.breadthFirst(vertex);

    assertEquals(1, traversal.size());
    assertTrue(traversal.contains(vertex));
  }

  @Test
  void testDepthFirstWithValidVertex() {
    Graph<Integer> graph = new Graph<>(10);
    Vertex<Integer> vertex1 = graph.addVertex(1);
    Vertex<Integer> vertex2 = graph.addVertex(2);
    graph.addEdge(vertex1, vertex2);

    List<Vertex<Integer>> result = graph.depthFirst(vertex1);
    System.out.println(result.get(0).value);
    System.out.println(result.get(1).value);

    assertEquals(2, result.size());
    assertEquals(vertex2, result.get(0));
    assertEquals(vertex1, result.get(1));
  }

  @Test
  void testDepthFirstWithNullVertex() {
    Graph<Integer> graph = new Graph<>(10);

    assertThrows(IllegalArgumentException.class, () -> {
      graph.depthFirst(null);
    });
  }

  @Test
  void testDepthFirstWithSingleVertex() {
    Graph<Integer> graph = new Graph<>(10);

    Vertex<Integer> vertex = graph.addVertex(1);
    List<Vertex<Integer>> result = graph.depthFirst(vertex);

    assertEquals(1, result.size());
    assertEquals(vertex, result.get(0));
  }


}
