package coding_practice.practice;

/*
 * 
 * https://codility.com/demo/results/trainingFVZK33-75M/
   MaxCounts 
   
   For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.
   
 */

public class practice23 {

  public static void main(String[] args) {

    int arr[] = {3,4,4,6,1,4,4};

    int[] arr2 = maxCounts(5, arr);
    
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

  }

  public static int[] maxCounts(int N, int[] A) {
    
    int[] arr = new int[N];
    int maxCount = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= arr.length) {
            arr[A[i]-1]++;
            maxCount = Math.max(maxCount, arr[A[i]-1]);
        } else {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = maxCount;
            }
        }
    }
    return arr;
    
  }
  
}

