package leetcode;

import java.util.ArrayDeque;

public class Stack {

  public boolean isValid(String s) {
    ArrayDeque<Character> stack = new ArrayDeque<>();

    for (Character c : s.toCharArray()){
      if(c == '(' || c == '{' || c == '['){
        stack.push(c);
      } else if (c == ')') {
        if(stack.isEmpty() || stack.pop() != '('){
          return false;
      }
    } else if (c == '}'){
      if (stack.isEmpty() || stack.pop() != '{'){
        return false;
      }
      } else if (c == ']'){
        if(stack.isEmpty() || stack.pop() != '['){
          return false;
        }
      }
    }
    if (!stack.isEmpty()){return false;}
    return true;

  }


}
