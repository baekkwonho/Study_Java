package coding_practice.practice;

import java.util.Scanner;

/*
  밑변의 길이를 숫자로 입력 받아 트리를 출력하라.
  단. 밑변의 길이가 짝수라면 +1을 하여라.
 
 */

public class practice07 {
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("밑변의 길이를 입력 하세요. ");
    int length = Integer.parseInt(keyScanner.nextLine());
    
    if (length % 2 == 0) {
      length++;
    }
    int spaceCount = length / 2;
    
    for (int i = 0; i < length; i += 2) {
      for (int j = 0; j < spaceCount; j++) {
        System.out.print(" ");
      }
      spaceCount--;
      for (int k = 0; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
      
    }
    
    keyScanner.close();
  }
}
