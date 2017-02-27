package designpatterns.observer.step03;

public class MyObserver {
  int words = 0; // 관사 a 의 개수를 저장할 변수
  public void findWord(String word) {
    System.out.println("==>" + word);
    
    if (word.equals("a")) {
      words++;
    }
  }

}
