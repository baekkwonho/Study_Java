package coding_practice.practice;

import java.util.Scanner;

/*
 밑변의 길이를 숫자를 입력 받아 직각 삼각형과 직각역삼각형을 출력하라.
 *
 **
 ***
 ****
 *****
 ======
 *****
 ****
 ***
 **
 *
 */

public class practice06 {
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.print("밑변의 길이를 입력 하세요. ");
    int length = Integer.parseInt(keyScanner.nextLine());
    
    for (int i = 0; i < length; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    System.out.println("=============");
    
    for (int i = 0; i < length; i++) {
      for (int j = length; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    keyScanner.close();
  }
}
