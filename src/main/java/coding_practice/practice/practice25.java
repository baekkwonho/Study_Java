package coding_practice.practice;

import java.util.Arrays;

/*
 * 
   Passing Cars
   
   Array A contains only 0s and/or 1s:

0 represents a car traveling east,
1 represents a car traveling west.
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

For example, consider array A such that:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

that, given a non-empty zero-indexed array A of N integers, returns the number of pairs of passing cars.

The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

the function should return 5, as explained above
   
   
 */

public class practice25 {

  public static void main(String[] args) {

    int[] arr = {0,1,0,1,1};
    System.out.println(passingCars(arr));

  }

  public static int passingCars(int[] A) {
    
    // 100% + 90% = 90%
    int west = 0;
    int pair = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] == 0) {
            west++;
        } else {
            pair += west;
        }
    }
    if (pair > 1000000000) {
        return -1;
    }
    return pair;
    
  }
  
}

