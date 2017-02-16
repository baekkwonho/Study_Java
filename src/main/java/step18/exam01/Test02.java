/* 주제: 예외 처리 - 소개 */
package step18.exam01;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {
    // 예외 처리 후
    Scanner keyScan = new Scanner(System.in);
    int a, b;
    
    while (true) {
      System.out.print("a / b? ");
      try { // 예외가 발생하는 코드를 두는 블록
        a = keyScan.nextInt();
        b = keyScan.nextInt();
        System.out.printf("결과는 %d입니다.\n", a / b);
        
      } catch (Exception e) { // 예외가 발생했을 때 실행되는 블록
        System.out.println("실행 중 오류가 발생했습니다.\n다시 시도해 주세요!");
        keyScan.nextLine(); // 오류가 발생했을 때 입력 데이터를 소비한다.
      }
    }
  }

}

/* 예외 처리 문법
 * try {
 *   예외가 발생할 수 있는 코드
 *   
 * } catch (예외의 종류에 따라 그 객체를 받을 파라미터 변수) {
 *   예외를 처리하는 코드
 *   
 * } catch (예외의 종류에 따라 그 객체를 받을 파라미터 변수) {
 *   예외를 처리하는 코드
 *   
 * } finally {
 *   예외가 발생하든 안하든 무조건 실행하는 코드
 * } 
 * 
 * 예외 처리 문법의 특징
 * 1) 일반 코드와 예외 처리 코드를 구분함으로써 코드를 읽기 쉽다. => 코드의 가독성을 높인다.
 * 2) 예외를 구분해서 다룰 수 있다. 
 */








