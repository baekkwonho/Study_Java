package coding_practice.practice;

import java.util.Arrays;

/*
 * 
  Distinct
  
  For example, given array A consisting of six elements such that:
  A[0] = 2    A[1] = 1    A[2] = 1
  A[3] = 2    A[4] = 3    A[5] = 1
  the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 
  문제>
  배열안의 들어있는 값의 갯수를 구하여라.
  단, 중복되는 수는 제외하여라.
  
  입력>
  [2,1,1,2,3,1]
  
  출력>
  3
  
  이유>
  중복을 제외하여 1,2,3의 숫자가 존재하므로 3을 리턴한다.
  배열을 정렬 시킨 후 중복되지 않은 숫자가 나올 때 마다 갯수를 세는 방법을 적용한다.
  
  
   
 */

public class practice26 {

  public static void main(String[] args) {

    int[] arr = {2,1,1,2,3,1};
    System.out.println(distinct(arr));

  }

  public static int distinct(int[] A) {
    if (A.length == 0) {
      return 0;
    }
    
    int count = 1;
    Arrays.sort(A); // 배열 정렬
    
    for (int i = 0; i < A.length - 1; i++) {
      if (A[i] != A[i+1]) { // 현재값과 다음값을 비교하여 다르다면 갯수 증가
        count++;
      }
    }
    return count;
  }
}

