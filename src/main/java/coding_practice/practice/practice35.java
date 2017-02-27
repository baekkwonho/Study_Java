package coding_practice.practice;

import java.util.Scanner;

/*
  문제>
  주민등록번호를 입력받아 검사 하여라.
  
  입력>
  주민등록번호를 입력하세요.(xxxxxx-xxxxxxx)
  900601-1010101
  
  출력>
  잘못된 주민등록번호입니다.
  
  이유>
  주민등록번호를 체크 하는 방법은 다음과 같다.
  주민등록번호 첫번째부터 12번째 자리까지 아래의 값들을 순차적으로 곱한다.
  [2,3,4,5,6,7,8,9,2,3,4,5]
  같은 순서의 있는 값끼리 곱한 값을 모두 더한다.
  총 합을 11로 나눈 나머지를 구하고 그 나머지 값을 11로 뺀 후 10으로 나눈 나머지가
  주민등록번호의 마지막 번호와 일치하면 올바른 주민등록 번호가 된다.
  
    [9, 0, 0, 6, 0, 1, 1, 0, 1, 0, 1, 0]
  x [2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5]
  --------------------------------------
    [18, 0,0, 30,0, 7, 8, 0, 2, 0, 4, 0]  -> 모두 더한다 -> 69
    
    더한 값을 아래 식에 적용 한다.
    (11 - (69 % 11)) % 10 = 8
    
    위 식에서 나온 8과 주민등록번호13번째자리수인 1과 비교한다.
    일치한다면 true, 일치하지 않는다면 false
    
 */

public class practice35 {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("주민등록번호를 입력하세요.(xxxxxx-xxxxxxx)");
    String str = scanner.nextLine().trim().replace("-", "");
    if (str.length() > 13) {
      System.out.println("주민등록번호 자릿수 확인 해주세요.");
    } else {
      checkJumin(str);
    }
    
    scanner.close();
    
  }
  
  public static void checkJumin(String jumin) {
    
    int[] arr = {2,3,4,5,6,7,8,9,2,3,4,5};
    int sum = 0;
    int lastNum = jumin.charAt(jumin.length() - 1) - 48; // 문자열을 비교하기 위해 48을 빼준다.
    
    for (int i = 0; i < jumin.length() - 1; i++) {
      sum += (jumin.charAt(i)-48) * arr[i];
    }
    
    int checkNum = (11 - (sum % 11)) % 10;

    if (checkNum == lastNum) {
      System.out.println("올바른 주민등록번호입니다.");
    } else {
      System.out.println("잘못된 주민등록번호입니다.");
    }
  }

  
}
