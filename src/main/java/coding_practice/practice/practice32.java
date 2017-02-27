package coding_practice.practice;

/*
  문제>
  정수 A와 B사이의 값 중 제곱근의 갯수를 구하여라.
  A <= B
  A and B are integers
  
  입력>
  Case 1 : A = 4, B = 17
  Case 2 : A = -10, B = 9
  Case 3 : A = -10, B = -4
  
  출력>
  Case 1 : 3
  Case 2 : 6
  Case 3 : 2
  
  이유>
  4 = 2 * 2 -> 1개
  9 = 3 * 3 -> 2개
  16 = 4 * 4 -> 3개
  
  A와 B 가 음수 일 것을 가정하여 조건을 추가 해주어야 하며,
  A만 음수 일 수도 있다.
  
      
 */

public class practice32 {

  public static void main(String[] args) {
    
    System.out.println(solution(4, 17));
    System.out.println(solution(-10, 9));
    System.out.println(solution(-10, -4));
  }

  public static int solution(int A, int B) {
    int count = 0; // 갯수를 저장할 변수
    int i = 1;
    int result = 0; // 제곱근을 임시로 저장할 변수
    
    if (A > B || (A == 0 && B == 0)) { // A < B 의 조건을 성립 해야 한다.
      return 0;
    }
    
    if (A < 0 && B < 0) { // A,B 음수 일 경우 절대값을 이용하여 그 사이의 제곱근의 갯수를 구한다.
      while(true) {
        result = i * i;
        if (result <= Math.abs(A) && result >= Math.abs(B)) {
          count++;
        } else if(result > Math.abs(A)){ // 절대값으로 변경 시 A보다 커지면 종료해야 한다.
          return count;
        }
        i++;
      }
    } else if (A < 0 && B >= 0) { // A만 음수 일 경우 A만 0~절대값까지 갯수와 B의 갯수를 구한다.
      while(true) { // 0 ~ 절대값 A 까지의 갯수 구하는 반복문
        result = i * i;
        if (result <= Math.abs(A)) {
          count++;
          i++;
        } else  {
          i = 1;
          break; // while만 종료
        }
      }
      
      while(true) {// 0 ~ B 까지의 갯수 구하는 반복문
        result = i * i;
        if (result <= B) {
          count++;
          i++;
        } else {
          return count;
        }
      }
      
    } else { // A, B 양수 일 경우
      while(true) {
        result = i * i;
        if(result >= A && result <= B) {
          count++;
        } else if (result > B){ // B보다 커지면 반복문 종료와 동시에 count를 리턴
          return count;
        }
        i++;
      }
      
    }
    
  }
  
}
