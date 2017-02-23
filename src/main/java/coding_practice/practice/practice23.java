package coding_practice.practice;

/*
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
   
   
   문제>
   정수 N과 배열 A를 받아 N의 크기만큼 배열을 만들고,
   A배열의 값을 만든 배열의 인덱스에 1씩 증가한다.
   만약, A의 값이 N보다 크다면 모든 값을 현재 임시 배열의 있는 최대값으로 바꾼다.
   
   입력>
   N = 5, A = [3,4,4,6,1,4,4]
   
   출력>
   [3,2,2,4,2]
   
   이유>
   A[0]의 값 3 -> arr[3]의 값을 증가
   A[1]의 값 4 -> arr[4]의 값을 증가
   A[6]의 값 6 -> N < arr[6] -> true -> arr의 전체 값을 최대값으로 맞춘다.
   A배열의 반복이 끝나면 [3,2,2,4,2]가 된다.
   
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
    
    int[] arr = new int[N]; // N크기만큼 임시배열 생성
    int maxCount = 0; // 최대값 저장할 변수 생성
    
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= arr.length) {
            arr[A[i]-1]++; // A의 값 - 1 은 arr의 인덱스로 가르킬 수 있다.
            maxCount = Math.max(maxCount, arr[A[i]-1]); // Math클래스의 max메서드를 이용하여 큰 값을 저장
        } else {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = maxCount; // 모든 값을 현재 최대값으로 설정
            }
        }
    }
    return arr;
    
  }
  
}

