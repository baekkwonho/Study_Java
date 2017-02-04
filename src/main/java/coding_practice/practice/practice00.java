package coding_practice.practice;

//연습용

public class practice00 {
  
  public static void main(String[] args) {
    
    System.out.println(fibo(6));
    
    
  }
  
  public static int fibo(int N) {
    
    if (N == 1 || N == 2) {
      return 1;
    }
    
    return fibo(N-1) + fibo(N-2);
    
  
    
  }
  
}
