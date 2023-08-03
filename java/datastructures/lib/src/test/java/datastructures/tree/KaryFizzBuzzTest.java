package datastructures.tree;

import org.junit.jupiter.api.Test;

import static datastructures.tree.KaryTree.fizzBuzzTree;
import static datastructures.tree.KaryTree.printKaryTree;
import static org.junit.jupiter.api.Assertions.*;

public class KaryFizzBuzzTest {

  @Test
  void emptyTreeTest(){
    KaryTree<Integer> inputTree = new KaryTree<>();
    KaryNode<Integer> root = new KaryNode<>(15);
    KaryNode<Integer> node1 = new KaryNode<>(3);
    KaryNode<Integer> node2 = new KaryNode<>(5);
    KaryNode<Integer> node3 = new KaryNode<>(9);
    KaryNode<Integer> node4 = new KaryNode<>(10);
    KaryNode<Integer> node5 = new KaryNode<>(7);
    root.children.add(node1);
    root.children.add(node2);
    node1.children.add(node3);
    node1.children.add(node4);
    node2.children.add(node5);

    inputTree.root = root;
    printKaryTree(root);

    KaryTree<String> modifiedTree = new KaryTree<>();
    modifiedTree.root = fizzBuzzTree(root);

    printKaryTree(modifiedTree.root);
//    Expected Output
//    FizzBuzz [Fizz Buzz ]
//    Fizz [Fizz Buzz ]
//    Fizz []
//      Buzz []
//    Buzz [7 ]
//    7 []

  }

}
