package datastructures.brackets;

import java.util.Stack;

public class Brackets {

  public boolean validateBrackets(String string){
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < string.length(); i++){
      char currentChar = string.charAt(i);

      if (currentChar == '[' || currentChar == '{' || currentChar == '('){
        stack.push(currentChar);
      } else if (currentChar == ']' || currentChar == ')' || currentChar == '}') {
        if (stack.isEmpty()){
          return false;
        } else {
          char top = stack.pop();
          if ((currentChar == ']' && top != '[') || (currentChar ==')' && top != '(') || (currentChar == '}' && top != '{')){
            return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }
}
