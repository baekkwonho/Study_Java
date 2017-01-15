/* 주제: 상속 - 인스턴스 메서드 상속 */
package step13.ex02;

public class Exam127 {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.plus(10);
    calc.plus(7);
    calc.minus(5);
    System.out.println(calc.result);
  }
}
