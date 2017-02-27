package designpatterns.observer.step04;

// 이제 호출 규칙에 따라 옵서버를 만들어야 한다.
// 문법: class 클래스명 implements 규칙명 {...}
//
public class MyObserver implements Observer {
  int words = 0; // 관사 a의 개수를 저장할 변수
  public void findWord(String word) {
    System.out.println("==>" + word);
    
    if (word.equals("a")) {
      words++;
    }
  }

}
