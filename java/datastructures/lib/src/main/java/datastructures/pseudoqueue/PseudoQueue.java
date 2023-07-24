package datastructures.pseudoqueue;

public class PseudoQueue<T> {
  Stack<T> stackOne;
  Stack<T> stackTwo;

  public void enqueue(T value) {
    if (stackOne == null){
      stackOne = new Stack<>();
    }
    stackOne.push(value);
  }

  public T dequeue() {
    if (stackOne.isEmpty() || stackOne == null) {
      throw new IllegalStateException("PseudoQueue is empty.  Can not dequeue.");
    }
    if (stackTwo == null){
      stackTwo = new Stack<>();
    }
    while (!stackOne.isEmpty()){
      stackTwo.push(stackOne.pop());
    }
    T dequeueVal = stackTwo.pop();
    while (!stackTwo.isEmpty()){
      stackOne.push(stackTwo.pop());
    }
    return dequeueVal;
  }

  @Override
  public String toString() {
    if (stackOne == null){
      return "Empty PseudoQueue";
    }
    if (stackOne.isEmpty()){
      return "Empty PseudoQueue";
    }
    StringBuilder newString = new StringBuilder();
    newString.append("PseudoQueue: Back -> ");
    Node<T> temp = stackOne.top;
    while (temp != null){
      newString.append("{" + temp.value + "} -> ");
      temp = temp.next;
    }
    newString.append("Front");
    return newString.toString();
  }
}

