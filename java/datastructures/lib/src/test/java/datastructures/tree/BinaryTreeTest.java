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
}
