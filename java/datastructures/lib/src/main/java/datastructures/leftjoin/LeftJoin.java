package datastructures.leftjoin;

import java.util.HashMap;

public class LeftJoin {

  public static String[][] leftJoin(HashMap<String, String> left, HashMap<String, String> right){
    if((left == null) || (right == null) || (left.isEmpty())){return null;}
    String[][] output = new String[left.size()][3];

    int i = 0;
    for (String key : left.keySet()){
      output[i][0] = key;
      output[i][1] = left.get(key);
      if (right.containsKey(key)){
        output[i][2] = right.get(key);
      } else {
        output[i][2] = "NULL";
      }
      i++;
    }
    return output;
  }
}
