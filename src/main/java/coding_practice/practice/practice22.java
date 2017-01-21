package coding_practice.practice;

/*
   PermCheck
   For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
    the function should return 1.

    Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    the function should return 0.
 */

public class practice22 {

  public static void main(String[] args) {

    int arr[] = {1,4,1};

    System.out.println(permCheck(arr));

  }

  public static int permCheck(int[] A) {
    
    int arr[] = new int[A.length];
    for (int i = 0; i < A.length; i++) {
      if (A[i] <= A.length) {
        arr[A[i]-1] = 1;
      }
    }
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        return 0;
      }
    }
    return 1;
    
    /*  80% & 60% = 70%
    int sum = 0;
    int temp = 0;
    for (int i = 0; i < A.length; i++){
      sum += A[i];
      temp += i+1;
    }
    
    System.out.println(sum+"-"+temp);
    if (sum == temp) {
      return 1;
    }
    return 0;
    */
    
  }
  
}

