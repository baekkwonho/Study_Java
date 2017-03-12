package coding_practice.practice;

/* 
  
  문제>
  0과 1로 구성된 문자열을 받는다.
  0 다음엔 1 이 무조건 와야 한다.
  
  입력>
  010101
  11111
  001101
  10101
  11110
  1
  
  출력>
  true
  true
  false
  true
  false
  true
  
  이유>
  true  -> 010101 로 이루어져 있다.
  true  -> 1로만 이루어져 있다.
  false -> 처음 0 다음에 1이 없다.
  true  -> 1 + 0101 잘 이루어져 있다.
  false -> 마지막 0 다음에 1이 없다.
  true
  

*/
public class practice43 {
  
  public static void main(String[] args) {
    
    System.out.println(zeroOne("010101"));
    System.out.println(zeroOne("11111"));
    System.out.println(zeroOne("001101"));
    System.out.println(zeroOne("10101"));
    System.out.println(zeroOne("11110"));
    System.out.println(zeroOne("1"));
    
  }
  
  public static boolean zeroOne(String s) {
    if (s.length() == 1 && s.startsWith("1")) { //길이가 하나이고 1이라면 무조건 true
      return true;
    }
    if (s.endsWith("0")) { // 마지막문자가 0 이라면 무조건 false
      return false;
    }
    
    char[] chars = s.toCharArray(); // 받은 문자열을 char 배열에 담는다.
    
    for (int i = 0; i < chars.length - 1; i++) { 
      if (chars[i] == '0' && chars[i + 1] != '1') { // 0 다음에 1이 아니라면 false
        return false;
      }
    }
    
    return true; // 그 외는 true
  }
  
}
