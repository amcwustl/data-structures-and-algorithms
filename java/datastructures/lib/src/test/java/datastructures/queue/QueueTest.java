package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest
{
  @Test public void enqueueTest()
  {
    Queue<Integer> sut = new Queue<Integer>();
    sut.enqueue(2);

    Integer expected = 2;
    Integer actual = sut.back.value;

    assertEquals(expected, actual);
  }

  @Test public void enqueueMultipleTest()
  {
    Queue<Integer> sut = new Queue<Integer>();
    sut.enqueue(2);
    sut.enqueue(3);
    sut.enqueue(4);

    String expected = "Queue: Back -> {4} -> {3} -> {2} -> Front";
    String actual = sut.toString();

    assertEquals(expected, actual);
  }

  @Test public void dequeueTest()
  {
    Queue<Integer> sut = new Queue<Integer>();
    sut.enqueue(2);
    sut.enqueue(3);
    sut.enqueue(4);

    Integer expected = 2;
    Integer actual = sut.dequeue();

    assertEquals(expected, actual);
  }

  @Test public void peekTest()
  {
    Queue<Integer> sut = new Queue<Integer>();
    sut.enqueue(2);
    sut.enqueue(3);
    sut.enqueue(4);

    Integer expected = 2;
    Integer actual = sut.peek();

    assertEquals(expected, actual);
  }

  @Test public void emptyAfterDequeueTest()
  {
    Queue<Integer> sut = new Queue<Integer>();
    sut.enqueue(2);
    sut.enqueue(3);
    sut.dequeue();
    sut.dequeue();

    Boolean expected = true;
    Boolean actual = sut.isEmpty();

    assertEquals(expected, actual);
  }

  @Test public void instantiateEmptyTest()
  {
    Queue<Integer> sut = new Queue<Integer>();

    Boolean expected = true;
    Boolean actual = sut.isEmpty();

    assertEquals(expected, actual);
  }

  @Test public void emptyPeekTest()
  {
    Queue<Integer> sut = new Queue<Integer>();

    assertThrows(IllegalStateException.class, () -> {sut.peek();});
  }


}
