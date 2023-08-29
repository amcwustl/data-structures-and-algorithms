package datastructures.graph;

public class BusinessTrip {

  public static Integer businessTrip(Graph<String> graph, Vertex<String>[] cities) {
    if (cities == null || cities.length < 2) {
      return null;
    }

    int totalCost = 0;
    for (int i = 0; i < cities.length - 1; i++) {
      Vertex<String> sourceVertex = cities[i];
      Vertex<String> destinationVertex = cities[i + 1];

      boolean found = false;
      for (Edge<String> edge : graph.getNeighbors(sourceVertex)) {
        if (edge.getDestination().equals(destinationVertex)) {
          totalCost += edge.getWeight();
          found = true;
          break;
        }
      }

      if (!found) {
        return null;
      }
    }

    return totalCost;
  }
}
