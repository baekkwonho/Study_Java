package coding_practice.practice;

/*
  규칙에 맞게 적용하여 문자 구하기.
  
  rules.
  1. AB -> AA
  2. BA -> AA
  3. CB -> CC
  4. BC -> CC
  5. AA -> A
  6. CC -> C
  
  S의 길이는 0 ~ 50,000
  S의 구성은 "A", "B" and/or "C"
  
  ex> ABABBCCA => ACA
  
 */

public class practice33 {

  public static void main(String[] args) {
    
    System.out.println(solution("ABABBCCA"));

  }

  public static String solution(String S) {
    
    if (S.length() <2 ) {
      return S;
    }
    
    String result = "";
    char temp = S.charAt(0);
    
    for (int i = 0; i < S.length(); i++) {
      if (temp == 'A' && S.charAt(i) != 'C') {
        temp ='A';
      } else if (temp == 'B' && S.charAt(i) != 'B') {
        if (S.charAt(i) == 'A') {
          temp = 'A';
        } else {
          temp = 'C';
        }
      } else if (temp =='C' && S.charAt(i) != 'A') {
        temp = 'C';
      } else {
        result += temp;
        temp = S.charAt(i);
      }
    }
    
    result += temp;
    return result;
    
  }
  
  
  
}
