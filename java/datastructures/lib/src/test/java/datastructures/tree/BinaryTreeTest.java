package datastructures.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

  @Test
  void emptyTreeTest(){
    BinaryTree tree = new BinaryTree();
    Node expected = null;
    Node actual = tree.root;

    assertEquals(expected, actual);
  }

  @Test
  void singleNodeTreeTest(){
    BinaryTree tree = new BinaryTree();
    Node one = new Node(1);

    tree.root = one;

    Integer expected = 1;
    Integer actual = tree.root.value;

    assertEquals(expected, actual);
  }

  @Test
  void preOrderTest(){
    BinaryTree tree = new BinaryTree();
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);

    tree.root = one;
    one.left = two;
    one.right = three;

    Object[] expected = {1, 2, 3};
    Object[] actual = tree.preOrder().toArray();

    assertArrayEquals(expected, actual);
  }

  @Test
  void inOrderTest(){
    BinaryTree tree = new BinaryTree();
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);

    tree.root = one;
    one.left = two;
    one.right = three;

    Object[] expected = {2, 1, 3};
    Object[] actual = tree.inOrder().toArray();

    assertArrayEquals(expected, actual);
  }

  @Test
  void postOrderTest(){
    BinaryTree tree = new BinaryTree();
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);

    tree.root = one;
    one.left = two;
    one.right = three;

    Object[] expected = {2, 3, 1};
    Object[] actual = tree.postOrder().toArray();

    assertArrayEquals(expected, actual);
  }

  @Test
  void findMaxTest(){
    BinaryTree tree = new BinaryTree();
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);
    Node four = new Node(15);
    Node five = new Node(20);

    tree.root = one;
    one.left = two;
    one.right = three;
    three.left = four;
    three.right = five;

    int expected = 20;
    int actual = tree.findMax();

    assertEquals(expected, actual);
  }

  @Test
  void breadthFirstTest(){
    BinaryTree tree = new BinaryTree();
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);
    Node four = new Node(15);
    Node five = new Node(20);

    tree.root = one;
    one.left = two;
    one.right = three;
    three.left = four;
    three.right = five;

    Object[] expected = {1, 2, 3, 15, 20};
    Object[] actual = tree.preOrder().toArray();

    assertArrayEquals(expected, actual);

  }

  @Test
  void emptyBreadthFirstTest(){
    BinaryTree tree = new BinaryTree();
    assertThrows(IllegalArgumentException.class, () -> tree.breadthFirst());
  }
}
