package datastructures.hashmap;

import java.util.HashSet;

public class RepeatedWord {

  public static String repeatedWord(String input){
    String[] words = input.split("\\s+");

    HashSet<String> alreadyUsed = new HashSet<>();

    for (int i = 0; i < words.length; i++){
      words[i] = words[i].replaceAll("[^a-zA-Z0-9]+$", "").toLowerCase();
      if (alreadyUsed.contains(words[i])){
        return words[i];
      } else {
        alreadyUsed.add(words[i]);
      }
    }

    return "No Words Were Repeated";

  }
}
