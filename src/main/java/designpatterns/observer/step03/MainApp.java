/* 주제: 옵서버 패턴 적용 
 * observer 패턴
 * => 어떤 객체의 다양한 상태에 대해 보고 받는 방법
 * => 보고를 받는 객체를 "observer" 또는 "listener"라 부른다.
 * => 여러 관찰자를 등록할 수 있다.
 * => 관찰자를 등록하지 않으면 보고하지 않는다.
 * => 특정 상태에 대해 코드를 실행할 수도 있고 실행하지 않을 수도 있는 
 *    그런 프로그래밍 구조를 만들 수 있다. 
 */
package designpatterns.observer.step03;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("문장을 입력하세요> ");
    String str = keyScan.nextLine();
    
    WordCounter counter = new WordCounter();
    
    //1) MyObserver 생성
    MyObserver observer = new MyObserver();
    //2) 옵저버(관찰자)를 WordCounter에 등록한다.
    counter.addObserver(observer);
    
    int words = counter.count(str);
    System.out.printf("단어 개수: %d\n", words);
    
    System.out.printf("관사 a의 개수: %d\n", observer.words);
    
    keyScan.close();
  }
}







