//주제: 같은 종류의 메모리를 여러 개 다루는 방법 - 배열 만들기
package step03;

public class Exam025 {
  public static void main(String[] args) {
    // 변수를 낱개씩 선언하는 방법
    int kor, eng, math, sci, soc, mus, art;

    // 같은 데이터 타입의 메모리를 한 번에 선언하는 방법 : "배열"이라 부른다.
    // 1) 배열을 가리킬 변수를 선언한다.
    int[] scores;
    
    /* 코드 분석:
       - int 메모리를 만들라는 의미가 아니다.
       - 배열을 가리키는 이름을 선언하는 것이다.
       - 아직 어떤 배열을 가리킬 지 지정하지 않았기 때문에 사용할 수 없다.
     */

    // 2) 배열을 준비한다.
    scores = new int[7];
    // 코드 분석:
    // new int[7] ==> int 메모리 7 개를 준비하라!
    // 그 메모리를 scores라는 이름으로 가리키겠다는 의미이다.

    // 배열 선언 단축 문법
    // => 배열을 가리키는 변수와 배열을 준비하는 명령어를 한 번에 작성할 수 있다.
    int[] scores2 = new int[7];
  }
}

