package datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

  Node root;

  public List<Integer> preOrder() {
    List<Integer> values = new ArrayList<>();
    preOrder(root, values);
    return values;
  }

  void preOrder(Node current, List values){
    if(current == null) {return;}
    values.add(current.value);
    preOrder(current.left, values);
    preOrder(current.right, values);

  }

  public List<Integer> inOrder() {
    List<Integer> values = new ArrayList<>();
    inOrder(root, values);
    return values;
  }

  void inOrder(Node current, List values){
    if (current == null){return;}
    inOrder(current.left, values);
    values.add(current.value);
    inOrder(current.right, values);

  }

  public List<Integer> postOrder() {
    List<Integer> values = new ArrayList<>();
    postOrder(root, values);
    return values;
  }

  void postOrder(Node current, List values){
    if (current == null){return;}
    postOrder(current.left, values);
    postOrder(current.right, values);
    values.add(current.value);
  }
}
