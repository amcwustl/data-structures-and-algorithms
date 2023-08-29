package datastructures.graph;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static datastructures.graph.BusinessTrip.businessTrip;
import static org.junit.jupiter.api.Assertions.*;

public class BusinessTripTest {

  @Test
  public void testValidTrip() {
    Graph<String> graph = new Graph<>(10);

    Vertex<String> cityA = graph.addVertex("City A");
    Vertex<String> cityB = graph.addVertex("City B");
    Vertex<String> cityC = graph.addVertex("City C");

    graph.addEdge(cityA, cityB, 100);
    graph.addEdge(cityB, cityC, 150);

    Vertex<String>[] cities = new Vertex[] { cityA, cityB, cityC };
    Integer cost = businessTrip(graph, cities);

    assertEquals(250, cost);
  }

  @Test
  public void testInvalidTrip() {
    Graph<String> graph = new Graph<>(10);

    Vertex<String> cityA = graph.addVertex("City A");
    Vertex<String> cityB = graph.addVertex("City B");
    Vertex<String> cityC = graph.addVertex("City C");

    graph.addEdge(cityA, cityB, 100);

    Vertex<String>[] cities = new Vertex[] { cityA, cityC, cityB };
    Integer cost = businessTrip(graph, cities);

    assertNull(cost);
  }
}
