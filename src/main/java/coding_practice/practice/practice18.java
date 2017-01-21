package coding_practice.practice;

/*
  PermMissingElem
  
  For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
 */

public class practice18 {

  public static void main(String[] args) {
   
    int arr[] = {1,3,6,2,5,4,7,9};
    
    System.out.println(permMissingElem(arr));
    
  }

  public static int permMissingElem(int[] arr) {
    
    int arrSum = 0;
    int valueSum = 0;
    
    for (int i = 1; i <= arr.length + 1; i++) {
      valueSum += i;
    }
    for (int i = 0; i < arr.length; i++) {
      arrSum += arr[i];
    }
    return valueSum - arrSum;
  }
  
}

