package coding_practice.practice;

import java.util.Arrays;

/*
  배열에 있는 값을 한번 바꾸어 오름차순이 되는지 확인하라.
  
  ex>
  A[1,5,3,3,7] => [1,3,3,5,7] => swap 1 => return true
  A[1,3,5] => [1,3,5] => swap 0 => return true
  A[1,3,5,3,4] => [1,3,3,4,5] => swap 2 => return false
  
 */

public class practice34 {

  public static void main(String[] args) {
    
    int[] arr = {1,5,3,3,7};
    
    System.out.println(solution(arr));

  }

  public static boolean solution(int A[]) {
    
    int count = 0;
    int[] B = new int[A.length];
    
    for (int i = 0; i < A.length; i++) {
      B[i] = A[i];
    }
    
    Arrays.sort(B);
    
    for (int i = 0; i < A.length; i++) {
      if (A[i] != B[i]) {
        count++;
      }
    }
    
    if (count == 0 || count == 2) {
      return true;
    } else {
      return false;
    }
    
  }
  
  
  
}
