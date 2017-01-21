package coding_practice.practice;

import java.util.Arrays;

/*
 * 
  MaxProductOfThree
  
  
  A non-empty zero-indexed array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

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
   
 */

public class practice27 {

  public static void main(String[] args) {

    int[] arr = {-3,2,0,-2,5,6};
    System.out.println(maxProductOfThree(arr));

  }

  public static int maxProductOfThree(int[] A) {
    
    Arrays.sort(A);
    
    int maxNum = A[A.length - 1] * A[A.length - 2] * A[A.length -3];
    
    if (A[0] < 0 && A[1] < 0) {
      int minNum = A[0] * A[1] * A[A.length - 1];
      if (minNum > maxNum) {
        return minNum;
      }
    }
    return maxNum;
    
    
  }
}

