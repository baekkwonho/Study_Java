package coding_practice.practice;

import java.util.Scanner;

/* 
  
  문제>
  문장을 입력받아 단어의 갯수를 세어라.
  
  입력>
  Hello World
  
  출력>
  단어 개수: 2
  
  이유>
  공백을 기준으로 단어를 나누어 단어의 개수를 세어 리턴한다.
  

*/
public class practice41 {
  
  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.println("문장을 입력하세요>");
    String str = keyScanner.nextLine();
    
    int count = 0; // 개수 저장할 변수
    boolean flag = false; // 공백이고 이전에 단어로 끝났다면 true를 저장하는 변수
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') { // 공백을 만나면 개수 증가
        if (flag) { // 이전에 문자여다면 true일 것이다.
          count++;
          flag = false;
        }
        continue; // 이전이 공백이라면 조건으로 다시 간다.
      }
      flag = true;
    }
    
    if (flag) { // 마지막에 공백으로 끝나지 않았을 경우에
      count++;
    }
    
    System.out.printf("단어 개수: %d", count);
    
    keyScanner.close();
  }
  
}
