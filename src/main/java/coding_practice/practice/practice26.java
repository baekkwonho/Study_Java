package coding_practice.practice;

import java.util.Arrays;

/*
 * 
  Distinct
  
  
   
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

