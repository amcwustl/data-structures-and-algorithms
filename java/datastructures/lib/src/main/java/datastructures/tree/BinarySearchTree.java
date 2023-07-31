package datastructures.tree;

public class BinarySearchTree extends BinaryTree{

  public void add(Integer value){
    Node nodeToAdd = new Node(value);
    if(root == null){
      root = nodeToAdd;
    } else {
      add(root, nodeToAdd);
    }
  }

  void add(Node current, Node nodeToAdd){
    if(current == null) return;
    if (nodeToAdd.value < current.value){
      if(current.left == null){
        current.left = nodeToAdd;
      } else {
        add(current.left, nodeToAdd);
      }
    } else {
      if (current.right == null){
        current.right = nodeToAdd;
      } else {
        add(current.right, nodeToAdd);
      }
    }
  }

  public boolean contains(Integer value) {
    return contains(root, value);
  }

  boolean contains(Node current, Integer value){
    if(current == null) return false;
    if(current.value == value) return true;
    if (value < current.value){
      return contains(current.left, value);
    } else {
      return contains(current.right, value);
    }

  }
}
