package coding_practice.practice;


/*
  CyclicRotation
  
  that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

  For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

  문제>
  배열과 회전수를 전달하면 회전수 만큼 배열을 회전하는 함수를 만든다.
  
  입력>
  [3,8,9,7,6]
  
  출력>
  [9,7,6,3,8]
  
  이유>
  배열을 3번 돌리게 되면 아래와 같다.
  1회전 -> [6,3,8,9,7]
  2회전 -> [7,6,3,8,9]
  3회전 -> [9,7,6,3,8]


 */

public class practice15 {

  public static void main(String[] args) {
    
    int[] arr = {3,8,9,7,6};
    cyclicRotation(arr, 3);
    
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }

  }

  public static int[] cyclicRotation(int[] arr, int num) {
    for (int i = 0; i < num; i++) { //회전수만큼 반복문
      for (int j = arr.length-1; j > 0; j--) { //마지막 값을 맨 처음 값으로 이동
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
      }
    }
    return arr; //배열 리턴
  }
}

