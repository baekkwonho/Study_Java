package coding_practice.practice;

/*
 * 
  Passing Cars
   
  Array A contains only 0s and/or 1s:
  0 represents a car traveling east,
  1 represents a car traveling west.
  The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.
  
  For example, consider array A such that:
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
  We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
  that, given a non-empty zero-indexed array A of N integers, returns the number of pairs of passing cars.
  The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.
  the function should return 5, as explained above
   
  문제>
  차가 동쪽 서쪽으로 지나간다.
  0 은 동쪽으로 지나가고, 1은 서쪽으로 지나간다.
  동쪽으로 지나간 차와 서쪽으로 지나간 차들의 쌍을 이룬다.
  이미 지나간 차들과는 쌍을 이룰 수 없다.
  총 쌍의 값을 리턴 해주어라. 단, 쌍이 1,000,000,000이 넘으면 -1을 리턴하여라.
  
  입력>
  A = [0,1,0,1,1]
 
  출력>
  5
 
  이유>
  (A[0], A[1]) , (A[0], A[3]), (A[0], A[4]), (A[2], A[3]), (A[2], A[4])
  위와 같이 총 5쌍을 이룬다.
  먼저 A[0]의 값 0일 때 반대방향인 1로 지나가는 차와 쌍을 이루게 되면 3개가 된다.
  A[2]의 값 0일 때 그 당므 인덱스부터 1인 값들과 쌍을 이루면 2개가 된다.
  따라서 총 5개가 된다.
   
 */

public class practice25 {

  public static void main(String[] args) {

    int[] arr = {0,1,0,1,1};
    System.out.println(passingCars(arr));

  }

  public static int passingCars(int[] A) {
    
    // 100% + 90% = 90%
    int east = 0; // 동쪽으로 가는 차의 갯수
    int pair = 0; // 쌍을 이루는 갯수
    
    for (int i = 0; i < A.length; i++) {
        if (A[i] == 0) {
            east++;
        } else {
            pair += east;
        }
    }
    if (pair > 1000000000) {
        return -1;
    }
    return pair;
    
  }
  
}

