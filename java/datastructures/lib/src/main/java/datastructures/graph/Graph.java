package datastructures.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import datastructures.graph.Edge;
import datastructures.graph.Vertex;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph(int maxNumberOfVertices)
  {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public Vertex<T> addVertex(T value)  // addNode()
  {
    if (value == null) {
      throw new IllegalArgumentException("Vertex value cannot be null.");
    }
    Vertex<T> vertexToAdd = new Vertex<>(value);
    LinkedList<Edge<T>> newAdjacencyList = new LinkedList<>();
    adjacencyLists.put(vertexToAdd, newAdjacencyList);
    numberOfVertices++;
    return vertexToAdd;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    // TODO: implement me
  }

  public LinkedList<Vertex<T>> getVertices()  // getNodes()
  {
    // TODO: implement me
    return null;
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)
  {
    // TODO: implement me
    return null;
  }

  public int size()
  {
    return numberOfVertices;  // TODO: make sure this gets updated at the right times
  }

  @Override
  public int compareTo(Graph<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();

    for (Map.Entry<Vertex<T>, LinkedList<Edge<T>>> entry : adjacencyLists.entrySet()) {
      Vertex<T> vertex = entry.getKey();
      LinkedList<Edge<T>> adjacencyList = entry.getValue();

      result.append(vertex.getValue()).append(" -> ");

      for (Edge<T> edge : adjacencyList) {
        result.append(edge.getDestination().getValue()).append(", ");
      }

      result.delete(result.length() - 2, result.length()); // Remove trailing ", "
      result.append("\n");
    }

    return result.toString();
  }
}
