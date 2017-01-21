package coding_practice.practice;

/*
  MissingInteger
  
  For example, given:

  A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2
the function should return 5.
 */

public class practice20 {

  public static void main(String[] args) {

    int arr[] = {1,3,6,4,1,2};

    System.out.println(missingInteger(arr));

  }

  public static int missingInteger(int[] A) {
    
    // 77점
    int[] arr = new int[A.length];
    for (int i = 0; i < A.length; i++) {
      int value = A[i];
      if (value > 0 && value <= A.length) {
        arr[value - 1] = 1;
      }
    }
    
    for (int i = 0; i < arr.length; i++) {
      if ( arr[i] == 0) {
        return i+1;
      }
    }
    return 0;
  }
    
    
    /*
     * 
     * 44점
    int[] arr = new int[A.length];
    for (int i = 0; i < A.length; i++) {
      for (int j = 1; j<= A.length; j++) {
          if (A[i] == j) {
              arr[j-1] = 1;
          }
      }
    }
    
    System.out.println();
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
          return i+1;
      }
    }
    return 0;
  }
  */
  
}

