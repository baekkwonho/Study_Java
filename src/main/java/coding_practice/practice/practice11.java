package coding_practice.practice;

/*
 배열이 등비수열인지 여부를 확인한다.
 배열 데이터 예:
    int[] list = {1, 4, 16, 64, 256};
 출력 예:
    {1, 4, 16, 64, 256} : 등비수열이다.
    {1, 4, 16, 32, 128} : 등비수열이 아니다
    
  아래와 같이 만족하면 등비수열이다.
  list[0] * list[2] == list[1]   => 1 * 16 == 4 * 4
  list[1] * list[3] == list[2]   => 4 * 64 == 16 * 16
  list[2] * list[4] == list[3]   => 16 * 256 == 64 * 64
  
 */

public class practice11 {
  public static void main(String[] args) {
    
    int[] list = {1, 4, 16, 64, 256};
    boolean result = true;
    
    for (int i = 2; i < list.length; i++) { //배열의 끝까지 기준을 삼기 위하여 2부터 시작
      if (list[i-2] * list[i] != list[i-1] * list[i-1]) { // 기준에서 그 전의 값들을 이
        result = false;
        break;
      }
    }
    
    System.out.print("{");
    for (int i = 0; i < list.length; i++) {
      if (i > 0) {
        System.out.print(", ");
      }
        System.out.print(list[i]);
    }
    System.out.print("}");
    
    System.out.println(" "+ result);
    
    
    
  }
}
