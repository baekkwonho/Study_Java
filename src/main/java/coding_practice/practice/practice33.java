package coding_practice.practice;

/*
  
  문제>
  다음 규칙에 맞게 적용하여 문자 구하기.
  
  rules.
  1. AB -> AA
  2. BA -> AA
  3. CB -> CC
  4. BC -> CC
  5. AA -> A
  6. CC -> C
  
  S의 길이는 0 ~ 50,000
  S의 구성은 "A", "B" and/or "C"
  
  입력>
  S = "ABABBCCA"
  
  출력>
  ACA
  
  이유>
  1. ABABBCCA -> AA+ABBCCA -> A+ABBCCA -> AABBCCA
  2. AABBCCA -> A+BBCCA -> ABBCCA
  3. ABBCCA -> AA+BCCA -> A+BCCA -> ABCCA
  4. ABCCA -> AA+CCA -> A+CCA -> ACCA
  5. ACCA -> A+C+A -> ACA
  위 처럼 진행 되어 마지막으로 남는 문자는 "ACA"가 된다.
  
  
 */

public class practice33 {

  public static void main(String[] args) {
    
    System.out.println(solution("ABABBCCA"));

  }

  public static String solution(String S) {
    
    if (S.length() <2 ) { // 처음 입력받은 문자열의 길이가 하나일 경우에는 조건을 적용 할 수 없다.
      return S;
    }
    
    String result = "";
    char temp = S.charAt(0); // 첫 문자를 저장해 놓는다.
    
    for (int i = 1; i < S.length(); i++) {
      if (temp == 'A' && S.charAt(i) != 'C') { // temp의 저장한 문자와 다음 문자와 비교 A는 C를 제외한 나머지 문자와 만나면 최종으로 A로 바뀐다.
        temp ='A';
      } else if (temp == 'B' && S.charAt(i) != 'B') { // B는 B를 제외한 문자와 만날 경우
        if (S.charAt(i) == 'A') {
          temp = 'A';
        } else {
          temp = 'C';
        }
      } else if (temp =='C' && S.charAt(i) != 'A') { // C는 A를 제외한 문자와 만나면 최종으로 C로 바뀐다.
        temp = 'C';
      } else { // 바뀔 수 없다면 바로 결과값에 저장
        result += temp;
        temp = S.charAt(i);
      }
    }
    result += temp; // 마지막 값을 한번 더 더해주어야 한다.
    return result;
    
  }
  
  
  
}
