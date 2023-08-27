package datastructures.graph;

import org.junit.jupiter.api.Test;

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
}
