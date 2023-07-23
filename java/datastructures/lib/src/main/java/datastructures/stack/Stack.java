package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T>
{
  Node<T> top;

  public void push(T valueToPush)
  {
    Node<T> newNode = new Node<>(valueToPush);
    if (isEmpty()) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }

  }

  public T pop()
  {
    if(isEmpty()){
      return null;
    }
    Node<T> temp = top;
    top = top.next;
    temp.next = null;

    return temp.value;
  }

  public T peek()
  {
    if (isEmpty()){
      return null;
    }
    return top.value;
  }

  public boolean isEmpty()
  {
    if (top == null){
      return true;
    }
    return false;
  }
}
