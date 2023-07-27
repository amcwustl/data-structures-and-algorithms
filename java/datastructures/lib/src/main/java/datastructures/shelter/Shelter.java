package datastructures.shelter;

public class Shelter {
  //Commenting out so the rest of my programs will compile

//  Queue<Animal> queue1;
//  Queue<Animal> queue2;
//
//  public Shelter(Queue<Animal> queue1, Queue<Animal> queue2) {
//    this.queue1 = queue1;
//    this.queue2 = queue2;
//  }
//
//  public void enqueue(Animal animal){
//    if (!animal.species.equals("dog") && !animal.species.equals("cat")){
//      throw new IllegalArgumentException("Animal must be of species dog or cat");
//    }
//    queue1.enqueue(animal);
//  }
//
//  public Animal dequeue(String pref) {
//    if (queue1 == null){
//      throw new IllegalStateException("Shelter is empty, can't dequeue.");
//    } else if (queue1.peek() == null) {
//      throw new IllegalStateException("Shelter is empty, can't dequeue.");
//    }
//    if (queue1.peek().species.equals(pref)){
//      return queue1.dequeue();
//    } else {
//      while(!queue1.peek().species.equals(pref) && !queue1.isEmpty()){
//        queue2.enqueue(queue1.dequeue());
//      }
//      if (queue1.isEmpty()){
//        while(!queue2.isEmpty()){
//          queue1.enqueue(queue2.dequeue());
//        }
//        return null;
//      }
//      Animal returnAnimal = queue1.dequeue();
//      while (!queue1.isEmpty()){
//        queue2.enqueue(queue1.dequeue());
//      }
//      while (!queue2.isEmpty()){
//        queue1.enqueue(queue2.dequeue());
//      }
//      return returnAnimal;
//    }
//  }
}
