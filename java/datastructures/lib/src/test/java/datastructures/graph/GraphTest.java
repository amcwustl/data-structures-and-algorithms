package datastructures.graph;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

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
    Vertex<Integer> vertex3 = graph.addVertex(3);

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


}
