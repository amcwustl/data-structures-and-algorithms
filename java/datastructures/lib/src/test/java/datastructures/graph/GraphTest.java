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
}
