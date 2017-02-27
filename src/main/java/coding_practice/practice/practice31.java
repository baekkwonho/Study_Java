package coding_practice.practice;

/*
  TieRopes
   
  There are N ropes numbered from 0 to N − 1, whose lengths are given in a zero-indexed array A,
  lying on the floor in a line. For each I (0 ≤ I < N), the length of rope I on the line is A[I].
  We say that two ropes I and I + 1 are adjacent. Two adjacent ropes can be tied together with a knot,
  and the length of the tied rope is the sum of lengths of both ropes. The resulting new rope can then be tied again.
  
  For a given integer K, the goal is to tie the ropes in such a way that the number of ropes whose length is greater than or equal to K is maximal.
  
  For example, consider K = 4 and array A such that:
    A[0] = 1
    A[1] = 2
    A[2] = 3
    A[3] = 4
    A[4] = 1
    A[5] = 1
    A[6] = 3
  We can tie:
  rope 1 with rope 2 to produce a rope of length A[1] + A[2] = 5;
  rope 4 with rope 5 with rope 6 to produce a rope of length A[4] + A[5] + A[6] = 5.
  After that, there will be three ropes whose lengths are greater than or equal to K = 4.
  It is not possible to produce four such ropes.
  that, given an integer K and a non-empty zero-indexed array A of N integers, 
  returns the maximum number of ropes of length greater than or equal to K that can be created.

  For example, given K = 4 and array A such that:
  A[0] = 1
  A[1] = 2
  A[2] = 3
  A[3] = 4
  A[4] = 1
  A[5] = 1
  A[6] = 3
  the function should return 3, as explained above.
  
  문제>
  A배열에는 길이가 다른 줄들이 있다.
  그 줄들을 묶어 K길이를 만들어야 한다.
  K길이와 같아도 되고 더 커도 상관없다.
  몇개를 만들 수 있는지를 구하여라.
  
  입력>
  A[1,2,3,4,1,1,3]
  K = 4
  
  출력>
  3
  
  이유>
  A[0]부터 차례대로 검사를 하면서 K의 값보다 같거나 커진다면 카운팅을 한다.
  1. A[0]+A[1]+A[2] = 6 -> 6 >= 4 -> true -> 1개
  2. A[3] = 4 -> 4 >= 4 -> true -> 2개
  3. A[4]+A[5]+A[6] = 5 -> 5 >= 4 -> true -> 3개
  총 갯수는 3개이므로 3을 리턴한다.

 */

public class practice31 {

  public static void main(String[] args) {
    
    int[] A = {1,2,3,4,1,1,3};
    System.out.println(tieRopes(4,A));

  }

  public static int tieRopes(int K, int A[]) {
    int count = 0; // 갯수를 저장할 변수
    int sum = 0; // 임시 합계를 저장 변수
    for (int i = 0; i < A.length; i++) {
      sum += A[i]; // 값들을 계속 더한다
      if ( sum >= K ) { // K보다 같거나 커진다면 카운팅을 하고 sum을 초기화
        count++;
        sum = 0;
      }
    }
    return count;
  }
}
