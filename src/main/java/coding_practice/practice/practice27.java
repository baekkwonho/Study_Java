package coding_practice.practice;

import java.util.Arrays;

/*
 * 
  MaxProductOfThree
  
  A non-empty zero-indexed array A consisting of N integers is given.
  The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
  For example, array A such that:
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
  contains the following example triplets:
  
  (0, 1, 2), product is −3 * 1 * 2 = −6
  (1, 2, 4), product is 1 * 2 * 5 = 10
  (2, 4, 5), product is 2 * 5 * 6 = 60
  Your goal is to find the maximal product of any triplet.
  
  the function should return 60, as the product of triplet (2, 4, 5) is maximal.
  
  문제>
  배열의 값 중 3개의 값을 곱한 값이 가장 큰 값을 찾아라.
  
  입력>
  [3, 1, 2, -2, 5, 6]
  
  출력>
  60
  
  이유>
  A[2] * A[4] * A[5] 의 값을 곱한 값인 60이 제일 크므로 60을 리턴한다.
  배열을 정렬하여 가장 큰 값을 비교한다.
  음수가 2개일 때 큰 값이 나올 수 있으므로 조건을 주어야 한다.
  
 */

public class practice27 {

  public static void main(String[] args) {

    int[] arr = {-3,2,0,-2,5,6};
    System.out.println(maxProductOfThree(arr));

  }

  public static int maxProductOfThree(int[] A) {
    
    Arrays.sort(A); // 배열 정렬
    
    int maxNum = A[A.length - 1] * A[A.length - 2] * A[A.length -3]; // 양수의 가장 큰 값 3개를 담아둔다.
    
    if (A[0] < 0 && A[1] < 0) { // 정렬 후 첫번째와 두번째 값이 음수일 경우 가장 큰 값과 함께 담아둔다.
      int minNum = A[0] * A[1] * A[A.length - 1]; 
      if (minNum > maxNum) { // 음수가 포함된 값과 양수만 이루어진 값을 비교
        return minNum;
      }
    }
    return maxNum;
    
    
  }
}

