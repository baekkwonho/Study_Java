package coding_practice.practice;

/*
 배열이 등비수열인지 여부를 확인한다.
 배열 데이터 예:
    int[] list = {1, 4, 16, 64, 256};
 출력 예:
    {1, 4, 16, 64, 256} : 등비수열이다.
    {1, 4, 16, 32, 128} : 등비수열이 아니다
 */

public class practice11 {
  public static void main(String[] args) {
    
    int[] list = {1, 4, 16, 64, 256};
    boolean result = true;
    
    for (int i = 2; i < list.length; i++) {
      if (list[i-2] * list[i] != list[i-1] * list[i-1]) {
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
