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
    
    문제>
    배열의 값이 인덱스의 범위의 값이 맞는지 아닌지 체크하여라.
    배열의 인덱스 : 0 ~ 3
    배열의 값 : 1 ~ 4
    이 경우 범위의 값이기 때문에 1을 리턴
    아니라면 0을 리턴
    
    입력>
    [4,1,3,2]
    
    출력>
    1
    
    이유>
    배열의 인덱스 0 ~ 3의 값의 범위는 1 ~ 4 이다.
    해당 배열의 값이 모두 있으므로 1을 리턴한다.
    
    배열의 크기만큼 임시 배열을 만든 후 해당 값이 있으면 임시 배열에 체크를 한다.
    
 */

public class practice22 {

  public static void main(String[] args) {

    int arr[] = {1,4,1};

    System.out.println(permCheck(arr));

  }

  public static int permCheck(int[] A) {
    
    int arr[] = new int[A.length]; // A의 크기만큼 임시배열 생성
    for (int i = 0; i < A.length; i++) {
      if (A[i] <= A.length) { // A배열의 값이 범위 안인지 검사
        arr[A[i]-1] = 1; // 1로 체크 표시를 한다.
      }
    }
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) { //하나라도 0이라면 0을 리턴
        return 0;
      }
    }
    return 1;
    
  }
  
}

