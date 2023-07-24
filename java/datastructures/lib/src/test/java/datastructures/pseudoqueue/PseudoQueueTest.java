package datastructures.pseudoqueue;
import datastructures.stack.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PseudoQueueTest {
  @Test public void enqueueTest()
  {
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueue(1);
    sut.enqueue(2);
    sut.enqueue(3);
    String expected = "PseudoQueue: Back -> {3} -> {2} -> {1} -> Front";
    String actual = sut.toString();
    assertEquals(expected, actual);
  }

  @Test public void createEmptyTest()
  {
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    String expected = "Empty PseudoQueue";
    String actual = sut.toString();

    assertEquals(expected, actual);
  }

  @Test public void dequeueTest()
  {
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueue(1);
    sut.enqueue(2);
    sut.enqueue(3);
    Integer expected = 1;
    Integer actual = sut.dequeue();

    assertEquals(expected, actual);
  }


}
