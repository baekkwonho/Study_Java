/* 주제: OOP 문법 활용 - 상속 활용 후
 * 
 */
package step15;

import java.awt.Frame;

public class Exam144 extends Frame {
  public Exam144() {
    super("윈도우 제목");
    
    /*this.*/setSize(400, 300); /* this는 생략 가능하다. */ 
  }

  
  public static void main(String[] args) {
    Exam144 f = new Exam144();
    f.setVisible(true);
  }

}







