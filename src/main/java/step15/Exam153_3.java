/* 주제 : 이너 클래스 사용법 - 다른 클래스의 top level inner 클래스 사용하기
 */
package step15;

public class Exam153_3 {
  public static void main(String[] args) {
    // 다른 클래스의 top level inner 클래스를 사용하려면
    // 스태틱 변수나 스태틱 메서드를 사용하는 것처럼 
    // 클래스 이름을 붙여야 한다.
    Exam153_2.A p = new Exam153_2.A();
    p.print();
  }
}





