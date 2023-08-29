package datastructures.graph;

import java.util.*;

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
    if(!adjacencyLists.containsKey(start) || !adjacencyLists.containsKey(destination)){
      throw new IllegalArgumentException("Both vertices must exist in the graph");
    }

    Edge<T> edgeToAdd = new Edge<>(destination, weight);
    adjacencyLists.get(start).add(edgeToAdd);

  }

  public LinkedList<Vertex<T>> getVertices()
  {
      return new LinkedList<>(adjacencyLists.keySet());
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)
  {
    if (!adjacencyLists.containsKey(vertex)){
      throw new IllegalArgumentException("Vertex does not exist in the graph.");
    }
    return adjacencyLists.get(vertex);
  }

  public int size()
  {
    return numberOfVertices;
  }

  public List<Vertex<T>> breadthFirst(Vertex<T> vertex){
    List<Vertex<T>> output = new ArrayList<>();
    Queue<Vertex<T>> queue = new ArrayDeque<>();
    HashSet<Vertex<T>> visited = new HashSet<>();

    queue.add(vertex);

    while (!queue.isEmpty()){
      Vertex<T> curr = queue.poll();
      if(!visited.contains(curr)){
        visited.add(curr);
        output.add(curr);
        LinkedList<Edge<T>> edges = adjacencyLists.get(curr);
        for(Edge<T> edge : edges){
          if(!visited.contains(edge.destination)){
            queue.add(edge.destination);
          }
        }

      }
    }
    return output;
  }

  public HashMap<Vertex<T>, LinkedList<Edge<T>>> getAdjacencyLists() {
    return adjacencyLists;
  }

  public int getNumberOfVertices() {
    return numberOfVertices;
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
