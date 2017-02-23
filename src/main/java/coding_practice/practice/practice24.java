package coding_practice.practice;

/*
 * 
  CountDiv 
 
  hat, given three integers A, B and K, 
  returns the number of integers within the range [A..B] that are divisible by K, i.e.:

  { i : A ≤ i ≤ B, i mod K = 0 }
  For example, for A = 6, B = 11 and K = 2, your function should return 3,
  because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

  문제>
  정수 A, B, K가 있다.
  A와 B사이의 값 중 K로 나누어 떨어지는 수의 갯수를 구하여라.
  
  입력>
  A = 6, B = 11, K = 2
  
  출력>
  3
  
  이유>
  6 <= i <= 11, i % 2 = 0
  i = 6, 8 10 -> 3개 리턴
  
  (B - A) / K 결과값은 하나 작은 값이 나오게 된다.
  위 조건이 성립 한다면 결과값 1증가를 해주어야 한다.
  처음 위 조건이 맞지 않는 경우 count변수에 조건이 만족할 때 까지의 카운트를 한 후에
  (B - A - count) / K 를 해주게 되면 원하는 결과값이 나오게 된다.
   
 */

public class practice24 {

  public static void main(String[] args) {


    System.out.println(countDiv(4,11,3));

  }

  public static int countDiv(int A, int B, int K) {
    
    int count = 0;
    int result = 0;
    
    for (int i = A; i <= B; i++) {
      if ( i % K == 0) { // 처음 i가 나누어 떨어지지 않으면 count가 증가 되었다.
        result++;
        result += (B-A-count) / K; //  이 식을 이용하면 한 번에 개수를 구할 수 있다. 
        break;
      }
      count++;
    }
    return result;
    
    
  /* 100% + 0% = 50% 
    범위가 클 경우 성능이 저하되어 이 방법으로는 100점을 맞을 수 없었다.
    int count = 0;
    for (int i = A; i <= B; i++) {
      if ( i % K == 0) {
        count++;
      }
    }
    return count;
  */
  }
  
}

