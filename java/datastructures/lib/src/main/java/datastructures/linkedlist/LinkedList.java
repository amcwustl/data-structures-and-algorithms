package datastructures.linkedlist;

import datastructures.linkedlist.Node;

public class LinkedList
{
  Node head = null;
  Node tail = null;  // not strictly required

  public void insert(int value)
  {
    Node newNode = new Node(value);
    if (this.tail == null){
      this.tail = newNode;
    }
    newNode.next = head;
    this.head = newNode;
  }

  public void append(int value){
    if (this.head == null){
      this.insert(value);
    } else {
      Node newNode = new Node(value);
      this.tail.next = newNode;
      this.tail = newNode;
    }
  }

  public void insertBefore(int value, int newValue) {
    if (!this.includes(value)) {
      System.out.println("Error: Specified Value does not Exist in Linked List");
    } else if (this.head.value == value) {
      this.insert(newValue);
    } else {
      Node currentNode = this.head.next;
      Node prevNode = this.head;
      while (currentNode.value != value){
        currentNode = currentNode.next;
        prevNode = prevNode.next;
      }
      Node newNode = new Node(newValue);
      newNode.next=currentNode;
      prevNode.next = newNode;
    }
  }

  public void insertAfter(int value, int newValue) {
    if (!this.includes(value)) {
      System.out.println("Error: Specified Value does not Exist in Linked List");
    } else if (this.tail.value == value) {
      this.append(newValue);
    } else {
      Node currentNode = this.head;
      while (currentNode.value != value){
        currentNode = currentNode.next;
      }
      Node newNode = new Node(newValue);
      newNode.next = currentNode.next;
      currentNode.next = newNode;
    }
  }
  public boolean includes(int value)
  {
    Node currentNode = this.head;
    while (currentNode != null){
      if (currentNode.value == value){
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
  }

  @Override
  public String toString()
  {
    StringBuilder returnString = new StringBuilder("");
    Node currentNode = this.head;
    while (currentNode != null){
      returnString.append("{ ");
      returnString.append(currentNode.value);
      returnString.append(" } -> ");
      currentNode = currentNode.next;
    }
    returnString.append("NULL");

    return returnString.toString();
  }
}
