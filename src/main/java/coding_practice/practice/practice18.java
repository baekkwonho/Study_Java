package coding_practice.practice;

/*
  PermMissingElem
  
  For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
  the function should return 4, as it is the missing element.
  
  문제>
  배열A의 값 중에서 빠진 값을 찾아라.
  배열의 값은 1부터 배열의 크기 + 1 까지이다.
  
  입력>
  [2,3,1,5]
  
  출력>
  4
  
  이유>
  배열의 인덱스는 0~3까지이다.
  배열의 값은 1~5까지 올 수 있다. (1부터 배열의 크기(4)+1 까지 이므로)
  배열에는 [2,3,1,5]의 값이 들어 있고 4가 빠져 있다.
  
  배열의 인덱스를 1을 더하여 총 합(인덱스를 각 1씩 더한 총 합)을 구한다.
  배열의 값들의 총 합을 구한다.
  인덱스의 총 합과 배열의 총 합을 비교하여 그 차이의 값을 리턴한다.
  
  indexSum(15) - valueSum(11) = 4
 */

public class practice18 {

  public static void main(String[] args) {
   
    int arr[] = {2,3,1,5};
    
    System.out.println(permMissingElem(arr));
    
  }

  public static int permMissingElem(int[] A) {
    
    int indexSum = 0; //인덱스의 총 합을 저장할 변수
    int valueSum = 0; //배열 값의 총 합을 저장할 변수
    
    for (int i = 1; i <= A.length + 1; i++) { //인덱스의 시작과 끝에 1을 더하여 반복문 실행
      indexSum += i;
    }
    
    for (int i = 0; i < A.length; i++) { // 배열의 값의 총합 구하는 반복문 실행
      valueSum += A[i];
    }
    return indexSum - valueSum; // 인덱스총합에서 배열값 총합의 차이의 값이 배열에서 빠진 값이 된다. 
  }
  
}

