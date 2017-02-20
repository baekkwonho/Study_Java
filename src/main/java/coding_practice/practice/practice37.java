package coding_practice.practice;

import java.util.Scanner;

/*
   배열의 중심
   
   [A1][A2]....[An]으로 이루어진 배열이 있다. 이 배열에서 다음의 조건을 만족하는 요소 Ai가 있는지 검사하는 프로그램을 작성하시오
    1. Ai의 왼쪽에 있는 요소들의 합과 오른쪽에 있는 요소들의 합이 동일하다.
    2. 왼쪽이나 오른쪽에 요소가 없다면 (A1이거나 An이라면) 합은 0으로 간주한다.
    
    즉 [A1] + [A2].... [Ai-1] = [Ai+1] + [Ai+2] + [An]
    
    입력
    첫 번째 줄에 테스트 케이스의 수를 입력한다.
    각 테스트 케이스에서 첫번째 줄은 배열의 크기 N을 그 다음 줄은 스페이스로 구분한 배열의 요소들을 입력받는다.
    
    출력
    각각의 테스트 케이스에 대해서 Ai가 존재하면 YES를 그렇지 않으면 No를 출력한다.
    
    입력 예제 #1
    2
    3
    1 2 3
    4
    1 2 3 3
    
    출력 예제 #1
    NO
    YES
    
    예제 설명 #1
    첫번째 케이스에서는 만족하는 것을 찾을 수 없다.
    두번째 케이스에서는 A[1] + A[2] = A[4]이다.
   
 */

public class practice37 {

  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.println("테스트 케이스 수를 입력 해 주세요.");
    int num = Integer.parseInt(keyScanner.nextLine());
    
    System.out.println("배열의 크기를 입력 해 주세요.");
    int N = Integer.parseInt(keyScanner.nextLine());
    
    int[] arr = new int[N];
    
    System.out.println(N+"개의 배열 요소를 입력 해 주세요.");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(keyScanner.next());
    }
    
    System.out.println(centerOfArr(num, arr));
    
    keyScanner.close();
    
   }
   
   public static String centerOfArr(int num, int[] arr) {
     if (num == arr.length - 1) {
       return "NO";
     }
     
     int leftSum = 0;
     int rightSum = 0;
     
     for (int i = 0; i < arr.length; i++) {
       if (i < num) {
         leftSum += arr[i];
       } else if (i == num) {
         continue;
       } else {
         rightSum += arr[i];
       }
     }
     
     if (leftSum == rightSum) {
       return "YES";
     }
     
     return "NO";
     
   }
  
  
  

  
}
