package coding_practice.practice;

//연습용

public class practice00 {
  
  public static void main(String[] args) {
    
    System.out.println(fibo(6));
    System.out.println(fibonacci(6));
    
  }
  
  static int fibo(int n) {
    if ( n < 1 || n > 10000000) {
      return 0;
    }
    
    if ( n == 1 || n == 2) {
      return 1;
    }
    
    return fibo(n-1) + fibo(n-2);
  }
  
  static int fibonacci(int n) {
    if ( n < 1 || n > 10000000) {
      return 0;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    
    int num1 = 1, num2 = 1, num3 = 0;
    
    for (int i = 3; i <= n; i++) {
      num3 = num1 + num2;
      num1 = num2;
      num2 = num3;
    }
    return num3;
    
  }
}
