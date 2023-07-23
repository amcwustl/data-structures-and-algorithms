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
      return null;
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
    }

    return tempFront.value;
  }

  public T peek()
  {
    if (isEmpty()){
      return null;
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
}

