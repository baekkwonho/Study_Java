package coding_practice.practice;

/*
   Nesting
   
   
   A string S consisting of N characters is called properly nested if:

S is empty;
S has the form "(U)" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, string "(()(())())" is properly nested but string "())" isn't.


that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.


 */

public class practice28 {

  public static void main(String[] args) {
    
    System.out.println(nesting("(()(())())"));

  }

  public static int nesting(String S) {
    int count = 0;
    for (int i = 0; i < S.length(); i++) {
        char c = S.charAt(i);
        if ( c == '(') {
            count++;
        } else if ( c == ')' ) {
            count--;
            if (count < 0) {
                return 0;
            }
        }   
    }
    if (count == 0 ) {
        return 1;
    } else {
        return 0;
    }
    
  }
}

