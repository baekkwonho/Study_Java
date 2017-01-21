package coding_practice.practice;


/*
  CyclicRotation
  
  that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].


 */

public class practice15 {

  public static void main(String[] args) {
    
    int[] arr = {3,5,6,7,0};
    cyclicRotation(arr, 4);
    
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

  }

  public static int[] cyclicRotation(int[] arr, int num) {
    for (int i = 0; i < num; i++) {
      for (int j = arr.length-1; j > 0; j--) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
      }
    }
    return arr;
  }
}

