package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test public void createEmptyLinkedList()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      Node expectedHead = null;
      Node actualHead = sut.head;
      assertEquals(expectedHead, actualHead);
    }

  @Test public void insertTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(10);
    int expectedHeadValue = 10;
    int actualHeadValue = sut.head.value;
    assertEquals(expectedHeadValue, actualHeadValue);
  }

  @Test public void headTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(10);
    int expectedHeadValue = 10;
    int actualHeadValue = sut.head.value;
    Node expectedHeadNext = null;
    Node actualHeadNext = sut.head.next;
    assertEquals(expectedHeadValue, actualHeadValue);
    assertEquals(expectedHeadNext, actualHeadNext);
  }

  @Test public void multipleNodeTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    int actualNodeSum = 0;
    Node currentNode = sut.head;
    while (currentNode != null){
      actualNodeSum += currentNode.value;
      currentNode = currentNode.next;
    }
    int expectedNodeSum = 6;
    System.out.println(actualNodeSum);
    assertEquals(expectedNodeSum, actualNodeSum);
  }

  @Test public void includesTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    Boolean actualIncludesValue = sut.includes(2);
    Boolean expectedIncludesValue = true;

    assertEquals(expectedIncludesValue,actualIncludesValue);
  }

  @Test public void includesTestTwo()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    Boolean actualIncludesValue = sut.includes(5);
    Boolean expectedIncludesValue = false;

    assertEquals(expectedIncludesValue,actualIncludesValue);
  }

  @Test public void toStringTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    String actualToStringValue = sut.toString();
    System.out.println(actualToStringValue);
    String expectedToStringValue = "{ 3 } -> { 2 } -> { 1 } -> NULL";

    assertEquals(expectedToStringValue, actualToStringValue);

  }

  @Test public void appendTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.append(10);
    int expectedLastValue = 10;
    int actualLastValue = sut.tail.value;
    assertEquals(expectedLastValue, actualLastValue);

  }

  @Test public void appendMultipleTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.append(25);
    sut.append(30);

    String actualToStringValue = sut.toString();
    System.out.println(actualToStringValue);
    String expectedToStringValue = "{ 3 } -> { 2 } -> { 1 } -> { 25 } -> { 30 } -> NULL";

    assertEquals(expectedToStringValue, actualToStringValue);

  }

  @Test public void insertBeforeMiddleTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insertBefore(1, 25);

    String actualToStringValue = sut.toString();
    System.out.println(actualToStringValue);
    String expectedToStringValue = "{ 3 } -> { 2 } -> { 25 } -> { 1 } -> NULL";

    assertEquals(expectedToStringValue, actualToStringValue);

  }

  @Test public void insertBeforeFirstTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insertBefore(3, 25);

    String actualToStringValue = sut.toString();
    System.out.println(actualToStringValue);
    String expectedToStringValue = "{ 25 } -> { 3 } -> { 2 } -> { 1 } -> NULL";

    assertEquals(expectedToStringValue, actualToStringValue);

  }

  @Test public void insertAfterMiddleTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insertAfter(2, 25);

    String actualToStringValue = sut.toString();
    System.out.println(actualToStringValue);
    String expectedToStringValue = "{ 3 } -> { 2 } -> { 25 } -> { 1 } -> NULL";

    assertEquals(expectedToStringValue, actualToStringValue);

  }

  @Test public void insertAfterLastTest()
  {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insertAfter(1, 25);

    String actualToStringValue = sut.toString();
    System.out.println(actualToStringValue);
    String expectedToStringValue = "{ 3 } -> { 2 } -> { 1 } -> { 25 } -> NULL";

    assertEquals(expectedToStringValue, actualToStringValue);

  }
}
