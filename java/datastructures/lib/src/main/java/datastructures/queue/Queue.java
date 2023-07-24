package datastructures.queue;

import datastructures.queue.Node;

public class Queue<T>
{
  Node<T> front;
  Node<T> back;

  public void enqueue(T valueToEnqueue)
  {
    Node<T> newNode = new Node<>(valueToEnqueue);
    if (isEmpty()){
      front = newNode;
      back = newNode;
    } else {
      newNode.next = back;
      back = newNode;
    }
  }

  public T dequeue()
  {
    if (isEmpty()){
      throw new IllegalStateException("Queue is empty, cannot dequeue.");
    }
    Node<T> tempFront = front;
    if (front == back){
      front = null;
      back = null;
    } else {
      Node<T> tempNewFront = back;
      while (tempNewFront.next != front){
        tempNewFront = tempNewFront.next;
      }
      tempNewFront.next = null;
      front = tempNewFront;
    }

    return tempFront.value;
  }

  public T peek()
  {
    if (isEmpty()){
      throw new IllegalStateException("Queue is empty, cannot peek.");
    }
    return front.value;
  }

  public boolean isEmpty()
  {
    if (front == null){
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    if (isEmpty()){
      return "Empty Queue";
    }
    StringBuilder newString = new StringBuilder();
    newString.append("Queue: Back -> ");
    Node<T> temp = back;
    while (temp != null){
      newString.append("{" + temp.value + "} -> ");
      temp = temp.next;
    }
    newString.append("Front");
    return newString.toString();
  }
}

