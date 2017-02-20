package coding_practice.practice;

import java.util.Scanner;

/*
  주민등록번호를 입력받아 검사 하여라.
  
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
    int lastNum = jumin.charAt(jumin.length() - 1) - 48;
    
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
