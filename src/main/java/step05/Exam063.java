//주제: 명령어 흐름을 제어하는 문법 - switch와 break
package step05;

public class Exam063 {
  public static void main(String[] args) {
    int level = 1;

    switch (level) {
    case 0:
      System.out.println("손님");
      break; // switch 문을 나간다.
    case 1:
      System.out.println("회원");
      break; // switch 문을 나간다.
    case 9:
      System.out.println("관리자");
      break; // switch 문을 나간다.
    default:
      System.out.println("권한이 없습니다.");
    }
  }
}

/*
switch (값)
- 값은 반드시 32비트 정수 값 이어야 한다.
  => byte, short, int, char 등.
- JDK 7 부터 String 도 가능.

주의!
- break나 return 과 같은 멈춤 명령이 없으면 switch 문 끝날 때까지 실행한다.


*/
