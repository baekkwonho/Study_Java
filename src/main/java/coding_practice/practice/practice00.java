package coding_practice.practice;

//연습용

public class practice00 {
  
  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(facto(5));
  }
 
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorial(n-1);
  }
  
  public static int facto(int n) {
    if (n == 1) {
      return 1;
    }
    int total = 1;
    for (int i = n; i > 0; i--) {
      total *= i;
    }
    return total;
  }
  
}
