package leetcode;

import java.util.ArrayDeque;
import java.util.List;

public class Stack {

  ArrayDeque<String> parenStack = new ArrayDeque<>();

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

  public int evalRPN(String[] tokens) {

    ArrayDeque<Integer> stack = new ArrayDeque<>();

    for (String val : tokens){
      if(val.equals("+")){
        Integer x = stack.pop();
        Integer y = stack.pop();
        stack.push(x + y);
      } else if (val.equals("-")) {
        Integer x = stack.pop();
        Integer y = stack.pop();
        stack.push(y-x);
      } else if (val.equals("*")) {
        Integer x = stack.pop();
        Integer y = stack.pop();
        stack.push(x*y);
      } else if (val.equals("/")) {
        Integer x = stack.pop();
        Integer y = stack.pop();
        stack.push(y/x);
      } else {
        stack.push(Integer.parseInt(val));
      }
    }

    return stack.pop();


  }

  }

public List<String> generateParenthesis(int n) {



}


}
