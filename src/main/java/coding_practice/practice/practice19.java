package coding_practice.practice;

/*
  TapeEquilibrium
  
  For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:



P = 1, difference = |3 − 10| = 7  // A[0] - (A[1]+A[2]+A[3]+A[4])
P = 2, difference = |4 − 9| = 5 
P = 3, difference = |6 − 7| = 1 
P = 4, difference = |10 − 3| = 7

the function should return 1, as explained above.


 */

public class practice19 {

  public static void main(String[] args) {

    int arr[] = {5,10,6,2,5,42,7,9};

    System.out.println(tapeEquilibrium(arr));

  }

  public static int tapeEquilibrium(int[] arr) {

    int min = Integer.MAX_VALUE;
    int leftValue = 0;
    int rightValue = 0;
    
    for (int i = 0; i < arr.length; i++) {
        rightValue += arr[i];
    }
    
    for (int i = 0; i < arr.length - 1; i++) {
        leftValue += arr[i];
        rightValue -= arr[i];
        
        if (Math.abs(leftValue - rightValue) < min) {
            min = Math.abs(leftValue - rightValue);
        }
    }
    
     return min;  

  }
}

