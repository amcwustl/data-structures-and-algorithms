package datastructures.tree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

  @Test
  void testAddSmaller(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(10);
    tree.add(5);

    assertEquals(10, tree.root.value);
    assertEquals(5, tree.root.left.value);

  }

  @Test
  void testAddLarger(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(10);
    tree.add(15);

    assertEquals(10, tree.root.value);
    assertEquals(15, tree.root.right.value);

  }

  @Test
  void testContains(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(10);
    tree.add(15);
    tree.add(5);

    assertTrue(tree.contains(15));
    assertFalse(tree.contains(999));
  }
}
