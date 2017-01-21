package coding_practice.practice;

import java.util.Arrays;

/*
 * 
  Distinct
  
  For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
  
   
 */

public class practice26 {

  public static void main(String[] args) {

    int[] arr = {1,2,1,2,3,1,4,3};
    System.out.println(distinct(arr));

  }

  public static int distinct(int[] A) {
    if (A.length == 0) {
      return 0;
    }
    int count = 1;
    Arrays.sort(A);
    for (int i = 0; i < A.length - 1; i++) {
      if (A[i] != A[i+1]) {
        count++;
      }
    }
    return count;
  }
}

