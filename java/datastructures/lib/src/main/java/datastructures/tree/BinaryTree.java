package datastructures.tree;

import datastructures.queue.Queue;

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

  public List<Integer> breadthFirst(){
    if (root == null){
      throw new IllegalArgumentException("the tree is empty");
    }
    List<Integer> values = new ArrayList<>();
    Queue<Node> queue = new Queue();
    queue.enqueue(root);

    while (!queue.isEmpty()){
      Node front = queue.dequeue();
      values.add(front.value);
      if (front.left != null){
        queue.enqueue(front.left);
      } else if (front.right != null){
        queue.enqueue(front.right);
      }
    }
    return values;
  }

  public int findMax(){
    if (root == null){
      throw new IllegalArgumentException("The tree is empty");
    }
    return findMaxHelper(root);
  }

  public Integer findMaxHelper(Node current){
    if (current == null) return Integer.MIN_VALUE;
    Integer leftMax = findMaxHelper(current.left);
    Integer rightMax = findMaxHelper(current.right);

    if(current.value >= leftMax && current.value >= rightMax){
      return current.value;
    } else if (leftMax >= current.value && leftMax >= rightMax){
      return leftMax;
    } else {
      return rightMax;
    }
  }
}
