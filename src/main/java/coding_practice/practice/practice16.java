package coding_practice.practice;


/*
  OddOccurrencesInArray
  
  For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
  the elements at indexes 0 and 2 have value 9,
  the elements at indexes 1 and 3 have value 3,
  the elements at indexes 4 and 6 have value 9,
  the element at index 5 has value 7 and is unpaired
  
  the function should return 7, as explained in the example above.

  문제>
  배열안의 쌍을 이루는 값이 없는 값을 찾아라.
  
  입력>
  [9,3,9,3,9,7,9]
  
  출력>
  7
  
  이유>
  index[0], index[2], index[4], index[6] 은 9의 값으로 쌍을 이룬다.
  index[1], index[3] 은 3의 값으로 쌍을 이룬다.
  index[5] 는 7의 값으로 쌍을 이루지 않는다.
  쌍을 이루지 않는 7의 값을 리턴한다.

  풀이>
  비트연산자 (^)를 사용
  본인의 값과 다음값을 비트연산한 후 다시 본인의 값을 비트연산 하게 되면 다음값이 다르다면 다른값이 나오게 된다.
  9 인 값과 -7 인 값을 비트연산한 후 다시 9인값을 연산하면 7이 나온다.
  
  1회전 -> 9 ^ 3 => 10
  2회전 -> 10 ^ 9 => 3
  3회전 -> 3 ^ 9 => 0
  4회전 -> 0 ^ 3 => 9
  5회전 -> 9 ^ 7 => 14
  6회전 -> 14 ^ 9 => 7
  
  결과값 7을 리턴.
  
 */

public class practice16 {

  public static void main(String[] args) {
    
    int[] arr = {9,3,9,3,9,7,9};
    System.out.println(oddOccurrencesInArray(arr));
  }

  public static int oddOccurrencesInArray(int[] arr) {
    
    int result = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        result ^= arr[i]; // 비트연산 실행
        //System.out.print(result+":  ");
        //System.out.println(Integer.toBinaryString(result)); //비트연산의 결과를 확인 할 수 있다.
    }
    return result;
  }
  
}

