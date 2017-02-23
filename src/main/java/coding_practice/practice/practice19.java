package coding_practice.practice;

/*
  TapeEquilibrium
  
  For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
  We can split this tape in four places:
  
  P = 1, difference = |3 − 10| = 7  // A[0] - (A[1]+A[2]+A[3]+A[4])
  P = 2, difference = |4 − 9| = 5 
  P = 3, difference = |6 − 7| = 1 
  P = 4, difference = |10 − 3| = 7
  
  the function should return 1, as explained above.
  
  문제>
  배열을 받아 기준점에서 왼쪽항의 값과 오른쪽의 합의 절대값 중 최소값을 구하여라.
  
  입력>
  [3,1,2,4,3]
  
  출력>
  1
  
  이유>
  1회전(index[0]) -> | 3 - 10 | = 7 => index[0]에서 index[1,2,3,4]의 값의 합을 뺀다.
  2회전(index[1]) -> | 4 - 9 | = 5 => index[1,2] 합에서 index[2,3,4]의 값의 합을 뺀다.
  3회전(index[2]) -> | 6 - 7 | = 1 => index[1,2] 합에서 index[2,3,4]의 값의 합을 뺀다.
  4회전(index[3]) -> | 4 - 9 | = 7 => index[1,2] 합에서 index[2,3,4]의 값의 합을 뺀다.
  
  나온 값 중 가장 작은 값이 1을 리턴한다.


 */

public class practice19 {

  public static void main(String[] args) {

    int arr[] = {3,1,2,4,3};
    
    System.out.println(tapeEquilibrium(arr));

  }

  public static int tapeEquilibrium(int[] arr) {

    int min = Integer.MAX_VALUE; // 최소값 초기화를 정수의 최대값으로 설정
    int leftValue = 0; // 기준의 왼쪽 합을 담아둘 변수
    int rightValue = 0; // 기준의 오른쪽 합을 담아둘 변수
    
    for (int i = 0; i < arr.length; i++) { // 처음 전체값을 오른쪽 합에다 담아둔다.
        rightValue += arr[i];
    }
    
    for (int i = 0; i < arr.length - 1; i++) {
        leftValue += arr[i]; // 왼쪽 합에 해당 기준을 더한다
        rightValue -= arr[i]; // 오른쪽 합에 기준을 뺀다
        
        if (Math.abs(leftValue - rightValue) < min) {
            min = Math.abs(leftValue - rightValue); // Math클래스의 abs메서드를 이용하여 최소값 계산
        }
    }
    
     return min;  

  }
}

