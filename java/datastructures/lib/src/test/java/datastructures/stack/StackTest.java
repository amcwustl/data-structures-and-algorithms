package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest
{
  @Test public void stackPushTest()
  {
    Stack<Integer> sut = new Stack<>();
    sut.push(2);
    Integer expected = 2;
    Integer actual = sut.top.value;

    assertEquals(expected, actual, "Top value of stack should be 2");
  }

  @Test public void stackPushMultipleTest()
  {
    Stack<Integer> sut = new Stack<>();
    sut.push(2);
    sut.push(3);
    sut.push(4);
    String expected = "Stack: Top -> {4} -> {3} -> {2} -> null";
    String actual = sut.toString();
    assertEquals(expected,actual);

  }
  @Test public void popTest()
  {
    Stack<Integer> sut = new Stack<>();
    sut.push(2);

    Integer expected = 2;
    Integer actual = sut.pop();

    assertEquals(expected,actual);
  }

  @Test public void emptyStackTest()
  {
    Stack<Integer> sut = new Stack<>();
    sut.push(2);
    sut.push(3);
    sut.push(4);

    Boolean expected = true;
    sut.pop();
    sut.pop();
    sut.pop();
    Boolean actual = sut.isEmpty();
    assertEquals(expected,actual);
  }
  @Test public void peekTest()
  {
    Stack<Integer> sut = new Stack<>();
    sut.push(2);

    Integer expected = 2;
    Integer actual = sut.peek();
    assertEquals(expected, actual);
  }

  @Test public void instantiateEmptyTest()
  {
    Stack<Integer> sut = new Stack<>();

    Boolean expected = true;
    Boolean actual = sut.isEmpty();
    assertEquals(expected, actual);
  }

  @Test public void throwsExceptionTest()
  {
    Stack<Integer> sut = new Stack<>();

    assertThrows(IllegalStateException.class, () -> {sut.peek();});
  }


}
