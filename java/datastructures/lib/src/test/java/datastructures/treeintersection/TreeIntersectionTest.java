package datastructures.treeintersection;
import datastructures.tree.BinaryTree;
import datastructures.tree.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TreeIntersectionTest {

  @Test
  public void testTreeIntersectionWithIntersectingValues() {
    BinaryTree treeOne = new BinaryTree();
    treeOne.root = new Node(5);
    treeOne.root.left = new Node(3);
    treeOne.root.right = new Node(8);
    treeOne.root.left.left = new Node(2);

    BinaryTree treeTwo = new BinaryTree();
    treeTwo.root = new Node(8);
    treeTwo.root.left = new Node(5);
    treeTwo.root.right = new Node(10);
    treeTwo.root.left.left = new Node(3);

    List<Integer> result = TreeIntersection.treeIntersection(treeOne, treeTwo);
    assertTrue(result.contains(5));
    assertTrue(result.contains(8));
    assertTrue(result.contains(3));
    assertEquals(3, result.size());
  }

  @Test
  public void testTreeIntersectionWithNoIntersection() {
    // Create two binary trees with no intersecting values
    BinaryTree treeOne = new BinaryTree();
    treeOne.root = new Node(5);
    treeOne.root.left = new Node(3);
    treeOne.root.right = new Node(8);

    BinaryTree treeTwo = new BinaryTree();
    treeTwo.root = new Node(10);
    treeTwo.root.left = new Node(7);
    treeTwo.root.right = new Node(12);

    List<Integer> result = TreeIntersection.treeIntersection(treeOne, treeTwo);
    assertTrue(result.isEmpty());
  }

  @Test
  public void testTreeIntersectionWithOneEmptyTree() {
    // Create a binary tree and an empty tree
    BinaryTree treeOne = new BinaryTree();
    treeOne.root = new Node(5);
    treeOne.root.left = new Node(3);
    treeOne.root.right = new Node(8);

    BinaryTree treeTwo = new BinaryTree();

    List<Integer> result = TreeIntersection.treeIntersection(treeOne, treeTwo);
    assertTrue(result.isEmpty());
  }
}
