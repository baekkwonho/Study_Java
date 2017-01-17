/* 주제: 객체화 및 이터레이터 적용
 *  iterator 객체는
 *   hasNext() 메서드 : 값이 있는지 확인 있다면 true, 없다면 false를 return 
 *   next() : 다음 값을 return
 *   사용자정의 클래스 만들 때 hasNext() 와 next()를 만들어 준다.
 *  */
package designpatterns.iterator.step02;

public class Test {
  public static void main(String[] args) {
    String[] arr = {
        "홍길동", "임꺽정", "이순신", "유관순", "안중근", "윤봉길", "김구",
        "안창호", "강감찬", "장보고", "을지문덕"
    };
    
    //1) 이름을 순서대로 출력하기
    AscIterator iterator1 = new AscIterator(arr);
    while (iterator1.hasNext()) {
      System.out.print(iterator1.next() + ",");
    }
    System.out.println();
    
    //2) 이름을 역순으로 출력하기
    DescIterator iterator2 = new DescIterator(arr);
    while (iterator2.hasNext()) {
      System.out.print(iterator2.next() + ",");
    }
    System.out.println();
    
    //3) 홀수 인덱스의 이름을 출력하기
    OddIterator iterator3 = new OddIterator(arr);
    while (iterator3.hasNext()) {
      System.out.print(iterator3.next() + ",");
    }
    System.out.println();
    
    //4) 짝수 인덱스의 이름을 출력하기
    EvenIterator iterator4 = new EvenIterator(arr);
    while (iterator4.hasNext()) {
      System.out.print(iterator4.next() + ",");
    }
    System.out.println();
    
    
  }
}





