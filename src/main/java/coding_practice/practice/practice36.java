package coding_practice.practice;

import java.util.Scanner;

/*
   정수쌍 구하기
   
   N개의 정수가 주어졌을 때 그 차가 K인 정수 쌍의 수를 구하시오

    입력
    첫째 줄에 N, K를 입력받는다. (스페이스로 구분)
    두번째 줄부터 N개의 정수를 입력받는다. 단, 모든 정수는 그 값이 서로 달라야 한다. (스페이스로 구분)
    
    출력
    차가 K인 정수 쌍의 수를 출력한다.
    
    제한
    N <= 10^5
    0 < K < 10^9
    각 정수는 0보다 크고 2^31 - 1 보다 작다.
    
    예제 입력 #1
    5 2
    1 5 3 4 2
    
    예제 출력 #1
    3
   
 */

public class practice36 {

  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    //System.out.println("N, K를 입력 해 주세요.");
    int N = Integer.parseInt(keyScanner.next());
    int K = Integer.parseInt(keyScanner.next());
    
    int[] numbers = new int[N];
    
    //System.out.println(N+"개의 정수를 입력 해주세요.");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(keyScanner.next());
    }
    
    //System.out.println(pairs(numbers, K)+"개");
    
    keyScanner.close();
    
  }
  
  public static int pairs(int[] arr, int K) {
    
    int count = 0;
    
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (Math.abs(arr[i] - arr[j]) == K) {
          count++;
          break;
        }
      }
    }
    
    return count;
    
  }
  
  
  

  
}
