package coding_practice.practice;

/* 
  
  문제>
  문자열 2개를 조합하여 결과값을 만들어라.
  
  입력>
  String str1 = "ab";
  String str2 ="cdz";
  
  출력>
  result = "acbdz";
  
  이유>
  1. 각 문자열을 char배열로 바꿔준다.
  2. 더 큰 크기의 값 만큼 반복하기 위하여 더 큰 값의 길이를 구해준다.
  3. 반복문을 돌리며 하나씩 차례대로 결과값에 더해준다.
  

*/
public class practice40 {
  
  public static void main(String[] args) {
    
    String str1 = "ab";
    String str2 = "cdz";
    String result = "";
    
    int len = 0;
    char[] chars1 = str1.toCharArray();
    char[] chars2 = str2.toCharArray();
    
    
    // 더 길이가 큰 값으로 반복문 돌리기 위해 비교를 한다.
    if ( (chars1.length - chars2.length) > (chars2.length - chars1.length)) {
      len = chars1.length;
    } else {
      len = chars2.length;
    }
    
    for (int i = 0; i < len; i++) {
      if ( i < chars1.length) { // i의 값이 해당 배열의 길이보다 크면 null이기 떄문에 넘어가야한다.
        result += chars1[i];
      }
      if ( i < chars2.length) { // i의 값이 해당 배열의 길이보다 크면 null이기 떄문에 넘어가야한다.
        result += chars2[i];
      }
    }
    
    System.out.println(result);
    
  }
  
  
  
  
}
