/* 주제: OOP 문법 활용 -  Frame의 기본 배치 관리자
 * => BorderLayout에게 버튼의 위치를 알려주는 방법.
 * 
 */
package step15;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Exam146 extends Frame {
  public Exam146() {
    super("Hello");
    
    Button yesBtn = new Button("Yes");
    Button noBtn = new Button("No");
    
    // 상속 받은 메서드나 자신의 메서드를 호출할 때는 this를 생략할 수 있다.
    // 배치 관리자에게 위치를 알려주자!
    add(yesBtn, BorderLayout.NORTH);
    add(noBtn, BorderLayout.CENTER);
    
    setSize(400, 300); 
  }

  
  public static void main(String[] args) {
    Exam146 f = new Exam146();
    f.setVisible(true);
  }

}







