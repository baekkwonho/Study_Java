package coding_practice.practice;
/*
 Fibonacci 함수를 작성 하시오.
 n의 범위 : 1 ~ 10,000,000
 f(1) = f(2) = 1
 f(n) = f(n-1) + f(n-2)
 0 1 1 2 3 5 8
 */
public class practice05 {
  
  public static void main(String[] args) {
    
    for (int i = 1; i <= 10; i++) {
      System.out.println(fibo(i));
    }
    
    System.out.println(fibonacci(10));
     
  }
  
  //재귀함수를 이용한 fibonacci 메서드 구현
  public static int fibo(int n) {
    
    //입력받은 n의 유효값 설정
    if ( n < 1 || n > 10000000) {
      return 0;
    }
    
    if (n == 1 || n == 2) {
      return 1;
    }
    
    return fibo(n-1) + fibo(n-2); // 재귀호출
  }
  
  //반복문을 이용하여 메서드 구현
  public static int fibonacci(int n) {
    
    if (n < 1 || n > 10000000) {
      return 0;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    
    int num1 = 1, num2 = 1, num3 = 1;
    
    for (int i = 3; i <= n; i++) {
      num3 = num1 + num2;
      num1 = num2;
      num2 = num3;
    }
    return num3;
  }

}
