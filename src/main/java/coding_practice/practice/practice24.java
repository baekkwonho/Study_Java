package coding_practice.practice;

/*
 * 
   CountDiv 
   
   hat, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }
For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.


   
 */

public class practice24 {

  public static void main(String[] args) {


    System.out.println(countDiv(0,1,11));

  }

  public static int countDiv(int A, int B, int K) {
    
    int count = 0;
    int result = 0;
    
    for (int i = A; i <= B; i++) {
      if ( i % K == 0) {
        result++;
        result += (B-A-count) / K;
        break;
      }
      count++;
    }
    return result;
    
    
    /* 100% + 0% = 50%
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

