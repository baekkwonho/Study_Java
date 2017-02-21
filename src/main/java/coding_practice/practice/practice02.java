package coding_practice.practice;

import java.util.Scanner;

/*문제
숫자를 입력받아서 홀수 개수와 짝수 개수를 센다.

출력 예:
짝수: 4
홀수: 3
*/

public class practice02 {
  
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    int oddCount = 0, evenCount = 0;
    
    System.out.print("숫자를 입력하세요 ");
    int num = Integer.parseInt(keyScanner.nextLine());
    
    while (num > 0) {
      if (num % 2 == 0) {
        evenCount++;
      }else {
        oddCount++;
      }
      num /= 10;
    }
    
    System.out.println("짝수: "+ evenCount);
    System.out.println("홀수: "+ oddCount);
    
    keyScanner.close();
    
  }
}
