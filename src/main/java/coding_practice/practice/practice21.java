package coding_practice.practice;

/*
   FogRiverOne
   
   If the frog is never able to jump to the other side of the river, the function should return −1.

  For example, given X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
  the function should return 6, as explained above.
 */

public class practice21 {

  public static void main(String[] args) {

    int arr[] = {1,3,1,4,2,3,5,4};

    System.out.println(frogRiverOne(5, arr));

  }

  public static int frogRiverOne(int X, int[] A) {
    
    int arr[] = new int[X];
    int sec = X;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && arr[A[i]-1] != 0) {
            continue;
        } else {
            arr[A[i]-1] = 1;
            sec--;
        }
        
        if (sec == 0) {
            return i;
        }
    }
    return -1;
  }
  
}

