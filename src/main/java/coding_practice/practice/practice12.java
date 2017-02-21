package coding_practice.practice;

import java.util.Scanner;

/*
  주어진 문자열의 알파벳의 개수를 센다.
  입력 : kwonho
  출력 : H : 1
         K : 1
         N : 1
         O : 2
         W : 1
  
 */

public class practice12 {
  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.println("문자를 입력 하세요.");
    char[] chars = keyScanner.nextLine().toUpperCase().toCharArray(); // 입력받는 값 대문자로 변환 후 문자 하나씩 배열에 담기
    int[] counts = new int[26]; // 알파벳은 26개 이므로 크기가 26인 배열 생성
    
    for (int i = 0; i < counts.length; i++) { //배열을 0으로 초기화
      counts[i] = 0;
    }
    for (int i = 0; i < chars.length; i++) { // chars배열에 있는 문자를 'A'로 빼면 알파벳 순서의 인덱스 값이 나온다.
      counts[chars[i] - 'A']++;
    }
    
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] <= 0) {
        continue;
      }
      System.out.printf("%c: %d\n", (char)(i + 'A'), counts[i]); // 알파벳 갯수가 0이 아닌 값만 출력
    }
    
    keyScanner.close();
    
  }
}
