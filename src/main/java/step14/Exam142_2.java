/* 주제: Iterator 패턴 활용 - Iterator 객체3
 * Iterator 패턴
 * => 목록에서 값을 꺼내는 코드를 객체화시키는 설계 기법
 * => 개발자는 목록의 값을 어떻게 꺼내는지 알 필요가 없다.
 *    일관된 방법으로 값을 꺼낼 수 있다.
 */
package step14;

import java.util.HashMap;
import java.util.Iterator;

public class Exam142_2 {
  public static void main(String[] args) throws Exception {
    HashMap<Integer,String> list = new HashMap<>();
    list.put(100, "홍길동"); // list.put(new Integer(100), "홍길동"); 오토박싱
    list.put(101, "임꺽정");
    list.put(102, "유관순");
    list.put(103, "이순신");
    list.put(104, "안중근");
    
    // 직접 값을 꺼내는 대신, 값을 꺼내주는 객체(Iterator)의 도움을 받자!
    //Collection<String> collection = list.values();
    //Iterator<String> iterator = collection.iterator();
    Iterator<String> iterator = list.values().iterator();
    while (iterator.hasNext()) { // 꺼낼 값이 있냐?
      System.out.println(iterator.next()); // 값을 꺼내라!
    }
  }

}















