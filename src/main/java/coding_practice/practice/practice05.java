package coding_practice.practice;
/*
 Fibonacci 함수를 작성 하시오.
 n의 범위 : 1 ~ 10,000,000
 f(1) = f(2) = 1
 f(n) = f(n-1) + f(n-2)
 */
public class practice05 {
  
  public static void main(String[] args) {
    
    for (int i = 1; i <= 10; i++) {
      System.out.println(fibo(i));
    }
     
  }
  
  public static int fibo(int n) {
    
    if ( n < 1 || n > 10000000) {
      return 0;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    
    return fibo(n-1) + fibo(n-2);
    
  }

}
