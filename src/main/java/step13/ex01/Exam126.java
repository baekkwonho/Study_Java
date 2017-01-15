package step13.ex01;

public class Exam126 {
  public static void main(String[] args) {
    
    Student2 u1 = new Student2();
    // name, email, password는 User로부터 상속받아 만든 변수이다.
    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
    
    // Student에서 추가한 변수 
    u1.tel = "111-1111";
    u1.working = true;
    
    // Student2가 추가한 변수
    u1.company = "오호라주식회사";
    u1.position = "대리";
  }
}

/*
 * 상속?
 * => 기존 코드를 손대지 않고 확장하는 기법
 * => 특징
 *    1) 중복 코딩을 줄인다. => 개발시간 단축 => 개발비 절감
 *    2) 검증된 코드 사용 => 시스템 안정성에 기여
 *
 * 용어 정리
 * => 상속을 해주는 클래스 : 수퍼(super)클래스, 부모(parent)클래스
 * => 송속을 받는 클래스 : 서브(sub)클래스, 자식(child)클래스 
 */
