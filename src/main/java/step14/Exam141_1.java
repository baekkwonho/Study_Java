/* 주제: Collection 클래스 - 컬렉션 클래스 사용 전
 */
package step14;

import java.util.Scanner;

public class Exam141_1 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    String[] names = new String[5];
    
    int i = 0;
    String name;
    System.out.println("이름을 입력 하세요.");
    while (true) {
      if (i >= names.length) {
        System.out.println("이름을 저장할 공간이 부족합니다.");
        break;
      }
      name = keyScan.nextLine();
      if (name.equals("")) 
        break;
      
      names[i] = name;
      i++;
    }
    
    System.out.println("--------------------");
    for (int x = 0; x < i; x++) {
      System.out.println(names[x]);
    }
    keyScan.close();
  }

}



















