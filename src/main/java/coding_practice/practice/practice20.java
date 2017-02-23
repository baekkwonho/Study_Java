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
  
  문제>
  배열을 받아 1~배열의크기+1 까지 값 중 없는 값을 찾아라.
  단 배열의 값에는 중복이 될 수 있다.
  
  입력>
  [1,3,6,4,1,2]
  
  출력>
  5
  
  이유>
  배열의 인덱스 : 0 ~ 5
  배열의 값 : 1 ~ 6
  없는 값 : 5
  
  있다 없다 할 수 있는 배열을 미리 만든다.
  입력받은 배열의 값을 반복하면서 범위의 값이라면 만든 배열에 표시한다.
  해당 인덱스 값이 없는 인덱스를 리턴해준다.
 */

public class practice20 {

  public static void main(String[] args) {

    int arr[] = {1,3,6,4,1,2};

    System.out.println(missingInteger(arr));

  }

  public static int missingInteger(int[] A) {
    
    // 77점
    int[] arr = new int[A.length]; // 입력받은 배열의 길이만큼 배열을 생성
    for (int i = 0; i < A.length; i++) {
      int value = A[i]; // 해당 값을 임시 변수에 저장
      if (value > 0 && value <= A.length) { // 값이 0~ 배열의 크기까지 라면 만들어둔 배열의 해당 인덱스 값을 1로 바꾼다.
        arr[value - 1] = 1;
      }
    }
    
    for (int i = 0; i < arr.length; i++) {
      if ( arr[i] == 0) { // 배열의 값이 0이면 해당 인덱스가 없다는 뜻이다.
        return i+1;
      }
    }
    return 0;
  }
  
}

