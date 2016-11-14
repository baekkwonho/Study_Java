//주제: 표현 가능한 값의 범위 - 부동 소수점 값의 표현 범위
package step02;

public class Exam014 {
  public static void main(String[] args) {
    System.out.println(-9876543210.98765);
    System.out.println(9876543210.98765);

    System.out.println(-9876543210.987654987);
    System.out.println(9876543210.987654987);


  }
}

/*
# 부동소수점을 메모리에 저장하는 방법
1) 부동소수점을 정수화시킨다.
   3.14 = 314 * 10^-2
   314와 -2를 메모리에 저장한다.
   32비트 메모리를 정수를 저장하는 부분과(가수부:24비트)
   제곱수를 저장하는 부분(지수부:8비트)로 나누어 저장한다.
   32비트 메모리 전체를 정수를 저장하는데 사용할 수 없기 때문에
   부동소수점을 저장할 때는 정수 최대/최소값 보다는 작은 값을 저장한다.
   => 24비트 가수부 영역에 저장할 수 있는 최대 정수 값은
      약 6~7자리까지 저장할 수 있다.
   => 7자리 정수 중에서 저장할 수 없는 수가 있기 때문에
      안전하게 저장하려면 6자리 정수를 저장하라!
   => 그래서 부동소수점을 저장할 수 있는지 여부를 따질 때는
      소수점을 떼 낸 수의 자릿수가 몇 개인지를 따지면 된다.
   => 가수부에 저장할 수 있는 유효한 숫자의 개수를
      "유효자릿수"라고 부른다.
2) 2진수로 바꿔 저장한다.

# 자바에서 부동소수점을 다룰 때 사용하는 메모리의 크기
1) 64비트 메모리(기본) = 가수부(53비트) + 지수부(11비트)
   유효자릿수? 15 ~ 16자리
   32비트 보다 두 배 더 큰 데이터를 저장할 수 있다.
   => double 형
2) 32비트 메모리 = 가수부(24비트) + 지수부(8비트)
   유효자릿수? 6 ~ 7자리

# 주의!
- 정수인 경우 값의 범위를 벗어나면 컴파일 오류 발생한다.
- 부동소수점인 경우 값의 범위를 벗어나더라도 오류를 발생시키지 않는다.
  다만 값이 반올림되어 짤릴 뿐이다.


*/
