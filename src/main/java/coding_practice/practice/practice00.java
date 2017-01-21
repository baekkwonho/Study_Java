package coding_practice.practice;

//연습용

public class practice00 {
  
  public static void main(String[] args) {
    
  }
  
  public static int solution(int K, int A[]) {
    
    int count = 0;
    int sum = 0;
    
    for (int i = 0; i < A.length; i++) {
      sum += A[i];
      if (sum >= K) {
        count++;
        sum = 0;
      }
    }
    
    return count;
    
  
    
  }
  
}
