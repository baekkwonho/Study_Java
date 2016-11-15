package coding_practice.practice;

/*
  배열에서 이웃 값과의 차이(절대값)를 모두 더하여 출력하라
  {1, 2, 4, 7, 11, 9}
 */

public class practice08 {
  public static void main(String[] args) {
    
    int[] numbers = {1, 2, 4, 7, 11, 9};
    int sum = 0;
    
    for (int i = 0; i < numbers.length - 1; i++) {
      sum += Math.abs(numbers[i] - numbers[i+1]);
    }
    
    System.out.println("값: "+ sum);
    
    
  }
}
