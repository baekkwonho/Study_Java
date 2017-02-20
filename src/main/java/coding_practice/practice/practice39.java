package coding_practice.practice;

import java.util.Scanner;

/* 주식 투자

    당신은 오늘 부터 N일(DAY) 동안의 삼성전자 주가를 예측할 수있는 알고리즘을 개발했다(와우~!!!).
    
    다만 현재 예산으로는 N일 동안 각각의 날에 다음의 액션중 하나만을 취할 수 있다.
    
    1) 어떤 날은 삼성전자 주식 1주를 살 수 있다.
    2) 어떤 날은 가지고 있는 주식 중 일부 혹은 전부를 팔 수 있다
    3) 어떤 날은 아무런 액션을 취하지 않을 수도 있다.
    
    N일 뒤에 최고의 수익을 남기기 위해서는 어떠한 전략을 수행해야 하는가?
    
    입력
    첫 줄에는 테스트 케이스의 수 T를 입력받는다.
    다음에는 숫자 N을 입력한다.
    그 다음 줄에는 N일 동안 예측한 주식의 가격을 입력한다. (모두 정수, 스페이스로 구분)
    이것을 T만큼 반복한다.
    
    출력
    각각의 테스트 케이스에 대해서 최고로 얻을 수 있는 수익을 출력한다.
    
    제한
    1 <= T <= 10
    1 <= N <= 50000
    
    입력 예제 #1
    3
    3
    5 3 2
    3
    1 2 100
    4
    1 3 1 2
    
    출력 예제 #1
    0
    197 <- 99
    3
    
    예제 설명 #1
    첫번째 테스트 케이스
    주가가 5 > 3 > 2로 떨어지기만 한다. 이래서는 수익을 낼수가 없다.
    두번째 테스트 케이스
    1일과 2일에는 1주씩 구매한다. 3일때 모든 주식을 판매한다.
    세번째 테스트 케이스
    1일째 1주를 구매하고 2일째 이 것을 판매한다. 3일째 다시 1주를 구매하고 4일째 판매한다.

*/
public class practice39 {
  
  public static void main(String[] args) {
    
   Scanner keyScanner = new Scanner(System.in);
   System.out.println("테스트 케이스 수를 입력 해 주세요.");
   int T = Integer.parseInt(keyScanner.nextLine());
   
   int[] result = new int[T];
   int j = 0;
   while (T > 0) {
     System.out.println("일수 입력 해 주세요.");
     int N = Integer.parseInt(keyScanner.nextLine());
     
     int[] arr = new int[N];
     System.out.println(N+"일 동안의 주식 가격을 입력 해 주세요.");
     for (int i = 0; i < arr.length; i++) {
       arr[i] = Integer.parseInt(keyScanner.next());
     }
     keyScanner.nextLine();
     
     result[j] = stock(arr);
     j++;
     T--;
   }
   
   for (int i = 0; i < result.length; i++) {
     System.out.println(result[i]);
   }
   
   keyScanner.close();
   
  }
  
  
  public static int stock(int[] arr) {
      
      int result = 0;
      
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i+1]) {
          continue;
        } else if (arr[i] < arr[i+1]) {
          result += arr[i+1] - arr[i];
        }
      }
      
      return result;
    
    }
  
  
  
}
