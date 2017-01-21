package coding_practice.practice;

import java.util.Stack;

/*
   Brackets
   
   
Task description
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.



 */

public class practice29 {

  public static void main(String[] args) {
    
    System.out.println(brackets("{[(())]}"));

  }

  public static int brackets(String S) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < S.length(); i++) {
        char ch = S.charAt(i);
        if (ch == '(' || ch == '[' || ch == '{') {
            stack.push(ch);
        } else {
            if (stack.empty()) {
                return 1;
            }
            if (ch == ')') {
                if (stack.pop() != '(') {
                     return 0;
                 }
            } else if (ch == ']') {
                 if (stack.pop() != '[') {
                     return 0;
                 }
             } else if (ch == '}') {
                 if (stack.pop() != '{') {
                     return 0;
                 }
             }
        }
    }
    
    if (!stack.empty()) {
        return 0;
    }
    return 1;
    
  }
}

