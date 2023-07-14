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
}
