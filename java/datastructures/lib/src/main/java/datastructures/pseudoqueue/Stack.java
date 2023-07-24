package datastructures.pseudoqueue;

import datastructures.pseudoqueue.Node;

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
      throw new IllegalStateException("Stack is empty, cannot pop");
    }
    Node<T> temp = top;
    top = top.next;
    temp.next = null;

    return temp.value;
  }

  public T peek()
  {
    if (isEmpty()){
      throw new IllegalStateException("Stack is empty, cannot peek");
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

  @Override
  public String toString() {
    if (isEmpty()){
      return "Empty Stack";
    }
    StringBuilder newString = new StringBuilder();
    newString.append("Stack: Top -> ");
    Node<T> temp = top;
    while (temp != null){
      newString.append("{" + temp.value + "} -> ");
      temp = temp.next;
    }
    newString.append("null");
    return newString.toString();
  }
}
