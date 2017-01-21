package coding_practice.practice;


/*
  OddOccurrencesInArray
  비트연산자 (^)를 사용
  [0]-9 인 값과 [1]-7 인 값을 연산한 후 다시 [2]-9인값을 연산하면 7이 나온다.
  
  
  For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired

the function should return 7, as explained in the example above.


 */

public class practice16 {

  public static void main(String[] args) {
    
    int[] arr = {9,7,9,3,9,3,9};
    System.out.println(oddOccurrencesInArray(arr));
  }

  public static int oddOccurrencesInArray(int[] arr) {
    
    int result = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        result ^= arr[i];
        System.out.print(result+":  ");
        System.out.println(Integer.toBinaryString(result));
    }
    return result;
  }
  
}

