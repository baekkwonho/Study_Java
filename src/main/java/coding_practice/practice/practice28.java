package coding_practice.practice;

/*
  Nesting
   
  A string S consisting of N characters is called properly nested if:

  S is empty;
  S has the form "(U)" where U is a properly nested string;
  S has the form "VW" where V and W are properly nested strings.
  For example, string "(()(())())" is properly nested but string "())" isn't.
  
  that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.
  
  For example, given S = "(()(())())", the function should return 1 
  and given S = "())", the function should return 0, as explained above.
  
  문제>
  다음 문자열의 쌍이 맞다면 1, 아니면 0을 리턴하게 하여라.
  
  입력>
  "(()(())())"
  "())"
  
  출력>
  1
  0
  
  이유>
  "()"는 괄호를 알맞게 이룬다. 따라서 첫 문자열은 모든 괄호가 맞기 때문에 1
  두번째 문자열은 모든 괄호가 맞지 않으므로 0
  
  


 */

public class practice28 {

  public static void main(String[] args) {
    
    System.out.println(nesting("(()(())())"));

  }

  public static int nesting(String S) {
    int count = 0; // 쌍을 이루는지 체크 하기 위한 변수
    
    for (int i = 0; i < S.length(); i++) { // 문자열의 길이까지 반복
        char c = S.charAt(i); // 문자열의 문자를 빼온다.
        if ( c == '(') { // 여는 괄호가 나온다면 카운트 변수를 증가
            count++;
        } else if ( c == ')' ) { // 닫는 괄호가 나온다면 카운트 변수를 감소
            count--;
            if (count < 0) {
                return 0;
            }
        }   
    }
    if (count == 0 ) { // 카운트 변수가 0 이라면 모든 괄호는 맞아 떨어진다.
        return 1;
    } else {
        return 0;
    }
    
  }
}

