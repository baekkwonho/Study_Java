package coding_practice.practice;

/*문제
1) 0 ~ 9까지 숫자를 출력한다.
2) 각 숫자가 홀수인지 짝수인지 출력한다.
출력 예:
0(짝수)
1(홀수)
2(짝수)
...
*/

public class practice01 {
  
  public static void main(String[] args) {
    
    for (int i = 0; i <= 9; i++) {
      if ( i % 2 == 0) {
        System.out.println(i+"(짝수)");
      } else {
        System.out.println(i+"(홀수)");
      }
    }
    
  }

}
