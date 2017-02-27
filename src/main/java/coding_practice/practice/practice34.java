package coding_practice.practice;

import java.util.Arrays;

/*
  문제>
  배열에 있는 값을 한번 바꾸어 오름차순이 된다면 true를 리턴하여라.
  단, 바꾸지 않고도 오름차순이라면 true 그 외에는 false이다.
  
  입력>
  Case1: A[1,5,3,3,7]
  Case2: A[1,3,5]
  Case3: A[1,3,5,3,4]
  
  출력>
  Case1: true
  Case2: true
  Case3: fasle
  
  이유>
  A[1,5,3,3,7] => [1,3,3,5,7] => swap 1 => return true
  A[1,3,5] => [1,3,5] => swap 0 => return true
  A[1,3,5,3,4] => [1,3,3,4,5] => swap 2 => return false
  
  A를 그대로 복사한 배열 B를 만들고
  복사한 배열 B를 정렬 시킨다.
  A와 B의 값이 다른곳이 2개 보다 많다면 swap의 수가 1번 초과가 되는 것이다.
  
 */

public class practice34 {

  public static void main(String[] args) {
    
    int[] arr = {1,5,3,3,7};
    int[] arr2 = {1,3,5};
    int[] arr3 = {1,3,5,3,4};
    
    System.out.println(solution(arr));
    System.out.println(solution(arr2));
    System.out.println(solution(arr3));

  }

  public static boolean solution(int A[]) {
    
    int count = 0;
    int[] B = new int[A.length]; // A의 길이만큼 배열 생성
    
    for (int i = 0; i < A.length; i++) { // A의 값을 동일하게 B에 복사
      B[i] = A[i];
    }
    
    Arrays.sort(B); // 배열 B 정렬
    
    for (int i = 0; i < A.length; i++) {
      if (A[i] != B[i]) { // A와 B의 값이 다른 것이 있다면 갯수 증가
        count++;
      }
    }
    
    if (count == 0 || count == 2) { // 갯수가 0 이면 바꾼곳이 없다, 갯수가 2라면 바꾼곳은 1쌍 있다. 그로므로 true
      return true;
    } else {
      return false;
    }
    
  }
  
  
  
}
