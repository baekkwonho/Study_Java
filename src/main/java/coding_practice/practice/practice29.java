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
  
  For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", 
  the function should return 0, as explained above.

  문제>
  다음 괄호들이 알맞게 이루어져 있는지 확인하여라.
  맞게 이루어져 있다면 1, 아니면 0을 리턴하여라.
  
  입력>
  "{[()()]}"
  "([)()]"
  
  출력>
  1
  0
  
  이유>
  첫번째 문자열은 괄호 안에 괄호들이 잘 맞게 이루어져 있으므로 1
  두번째 문자열은 괄호 안에 괄호들이 맞게 이루어지지 않았으므로 0
  
  스택을 만들어서 문자열의 하나씩 스택에 넣어 스택에 있는 값과 다음 올 값의 괄호가 이루어진다면 뺴면서 체크
  
  

 */

public class practice29 {

  public static void main(String[] args) {
    
    System.out.println(brackets("{[(())]}"));

  }

  public static int brackets(String S) {
    Stack<Character> stack = new Stack<>(); // 스택 생성
    
    for (int i = 0; i < S.length(); i++) {
        char ch = S.charAt(i);
        if (ch == '(' || ch == '[' || ch == '{') { // 여는 괄호가 나온다면 스택에 추가한다.
            stack.push(ch);
        } else {
            if (stack.empty()) {
                return 1;
            }
            if (ch == ')') { // 닫는 괄호가 나오고 스택의 탑에 있는값과 괄호가 어울리는 것을 찾아야 한다.
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

