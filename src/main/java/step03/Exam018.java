//주제: 메모리를 사용하는 방법 - 메모리 준비(변수 선언)
package step03;

public class Exam018 {
  public static void main(String[] args) {
    //1) 정수 값을 담을 메모리(4바이트)를 준비
    int i;

    //2) 부동소수점을 담을 메모리(8바이트)를 준비
    double d;

    //3) 논리 값을 담을 메모리를 준비
    boolean b;

    //4) 문자 값을 담을 메모리(2byte)를 준비
    // => JVM 내부에서 문자를 다룰 때 UTF-16을 사용한다.
    char c;

    //5) 문자열을 담을 메모리(주소를 담는)를 준비
    String s;
  }
}

/*
변수?
- 값을 저장하기 위해 준비한 메모리의 이름

메모리 준비?
- [메모리의 종류] [메모리 이름];

용어 정리
- 메모리 준비 => 변수 선언
- 메모리 종류 => 데이터 타입(자료형)
- 메모리 이름 => 변수명
- 메모리 => 변수

*/
