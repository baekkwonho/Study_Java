package coding_practice.practice;

import java.util.Scanner;

/* 9와 0

  문제>
  숫자 0과 9로만 이루어진 0 이상의 정수 X가 있다. (ex: 90, 9990, 9009009)
  0이상의 정수 N이 주어졌을 때 X중 N의 배수이면서 가장 작은 수를 구하는 프로그램을 작성하시요.
  
  첫줄에 테스트 케이스 T를 입력 받는다. 다음 줄 부터 T줄만큼 N을 입력받는다.
  
  각각의 테스트 케이스에 대해서 조건 만족하는 수 X를 한줄에 하나씩 출력한다. 단 숫자 앞에 0이 와서는 안된다.
  (ex: 00999 > 999로 출력할 것)
  
  제한
  1 <= T <= 104
  1 <= N <= 500
  
  입력>
  3
  5
  7
  1
  
  출력>
  90
  9009
  9
  
  이유>
  반복할 테스트는 3번
  
  Case1: 5의 배수이면서 9와 0으로만 이루어진 가장 작은 수는 90이다.
  Case2: 7의 배수이면서 9와 0으로만 이루어진 가장 작은 수는 9009이다.
  Case3: 1의 배수이면서 9와 0으로만 이루어진 가장 작은 수는 9이다.
  
  9 -> 90 -> 99 -> 990 -> 999 -> 순으로 반복해야 한다.
  

*/

public class practice38 {
  
  public static void main(String[] args) {
    
   Scanner keyScanner = new Scanner(System.in);
   
   System.out.println("테스트 케이스 수를 입력 해 주세요.");
   int T = Integer.parseInt(keyScanner.nextLine());
   int[] arr = new int[T];
   
   for (int i = 0; i < arr.length; i++) {
     arr[i] = Integer.parseInt(keyScanner.nextLine());
   }
   
   for (int i = 0; i < arr.length; i++) {
     System.out.println(nineAndZero(arr[i]));
   }
   
   
   keyScanner.close();
   
  }
  
  public static int nineAndZero(int N) {
    int num = 9;
    boolean flag = true;
    
    while(true) {
      if (num % N == 0) { // 9로 나눈 나머지가 0이면 그 수를 리턴
        return num;
      }
      
      if (flag) {
        if (num > 10) { // 10의 자리가 된 경우 9를 빼어 90일 때를 계산. 그러지 않으면 9만 반복하게 된다.
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
