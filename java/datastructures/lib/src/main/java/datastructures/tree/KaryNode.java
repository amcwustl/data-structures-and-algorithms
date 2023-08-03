package datastructures.tree;

import datastructures.pseudoqueue.Node;

import java.util.ArrayList;
import java.util.List;

public class KaryNode<T> {
  T value;
  List<KaryNode<T>> children;

  public KaryNode(T value) {
    this.value = value;
    this.children = new ArrayList<>();
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public List<KaryNode<T>> getChildren() {
    return children;
  }

  public void setChildren(List<KaryNode<T>> children) {
    this.children = children;
  }

  public void addChild(KaryNode<T> child) {
    children.add(child);
  }
}
