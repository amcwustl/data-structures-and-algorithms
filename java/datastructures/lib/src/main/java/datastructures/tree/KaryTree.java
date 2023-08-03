package datastructures.tree;

import org.checkerframework.checker.units.qual.K;

public class KaryTree<T> {
  KaryNode<T> root;
  int k;
  public KaryTree(int k) {
    this.k = k;
  }

  public KaryTree() {
  }

  public KaryNode<T> getRoot() {
    return root;
  }

  public void setRoot(KaryNode<T> root) {
    this.root = root;
  }

  public int getK() {
    return k;
  }

  public void setK(int k) {
    this.k = k;
  }

  public static <T> void printKaryTree(KaryNode<T> root) {
    if (root == null) {
      return;
    }
    System.out.print(root.value + " [");
    for (KaryNode<T> child : root.children) {
      System.out.print(child.value + " ");
    }
    System.out.println("]");
    for (KaryNode<T> child : root.children) {
      printKaryTree(child);
    }
  }

  public static KaryNode<String> fizzBuzzTree(KaryNode<Integer> root){
    if (root == null) {return null;}
    KaryNode<String> newNode = new KaryNode<>(getFizzBuzzValue(root.getValue()));
    for (KaryNode<Integer> child : root.children) {
      newNode.children.add(fizzBuzzTree(child));
    }
    return newNode;
  }

  public static String getFizzBuzzValue(int value) {
    if (value % 3 == 0 && value % 5 == 0) {
      return "FizzBuzz";
    } else if (value % 3 == 0) {
      return "Fizz";
    } else if (value % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(value);
    }
  }
}
