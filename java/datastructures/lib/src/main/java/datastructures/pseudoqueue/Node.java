package datastructures.pseudoqueue;

public class Node<T>
{
  T value;
  Node<T> next;

  Node(T value)
  {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      '}';
  }
}
