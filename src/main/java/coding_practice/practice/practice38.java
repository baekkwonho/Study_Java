package coding_practice.practice;

import java.util.Scanner;

/* 9와 0

    숫자 0과 9로만 이루어진 0 이상의 정수 X가 있다. (ex: 90, 9990, 9009009)
    0이상의 정수 N이 주어졌을 때 X중 N의 배수이면서 가장 작은 수를 구하는 프로그램을 작성하시요.
    
    입력
    첫줄에 테스트 케이스 T를 입력 받는다. 다음 줄 부터 T줄만큼 N을 입력받는다.
    
    출력
    각각의 테스트 케이스에 대해서 조건 만족하는 수 X를 한줄에 하나씩 출력한다. 단 숫자 앞에 0이 와서는 안된다.
    (ex: 00999 > 999로 출력할 것)
    
    제한
    1 <= T <= 104
    1 <= N <= 500
    
    입력 예제 #1
    3
    5
    7
    1
    
    출력 예제 #1
    90
    9009
    9
    
    예제 설명 #1
    첫번째 테스트 케이스 : 5의 배수이면서 9와 0으로만 이루어진 가장 작은 수는 90이다.

*/

public class practice38 {
  
  public static void main(String[] args) {
    
   Scanner keyScanner = new Scanner(System.in);
   
   //System.out.println("테스트 케이스 수를 입력 해 주세요.");
   int T = Integer.parseInt(keyScanner.nextLine());
   int[] arr = new int[T];
   
   for (int i = 0; i < arr.length; i++) {
     arr[i] = Integer.parseInt(keyScanner.nextLine());
   }
   
   for (int i = 0; i < arr.length; i++) {
     //메서드 실행
     //System.out.println(nineAndZero(arr[i]));
   }
   
   
   keyScanner.close();
   
  }
  
  public static int nineAndZero(int N) {
    int num = 9;
    boolean flag = true;
    
    while(true) {
      if (num % N == 0) {
        return num;
      }
      
      if (flag) {
        if (num > 10) {
          num -= 9;
        }
        num *= 10;
        flag = false;
      } else {
        num += 9;
        flag = true;
      }
    }
    
  }
  
  
}
