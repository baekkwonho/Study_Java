package coding_practice.practice;

import java.util.Scanner;

/*
문제
 5개의 숫자를 입력 받아서 그 중 가장 큰 수와 가장 작은 수를 찾아라!
출력 예:
가장 큰 수: 1980
가장 작은 수: 6

*/

public class practice03 {
  
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    int[] numbers = new int[5];
    System.out.println("숫자를 5개 입력 하세요.");
    
    for (int i = 0; i < 5; i++) {
      System.out.printf("[%d]번째 숫자 ", i);
      numbers[i] = Integer.parseInt(keyScanner.nextLine());
    }
    
    int max = numbers[0];
    int min = numbers[0];
    
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      } else if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    
    System.out.println("가장 큰 수 :"+ max);
    System.out.println("가장 작은 수 : "+ min);
    
    keyScanner.close();
  }
  
}
