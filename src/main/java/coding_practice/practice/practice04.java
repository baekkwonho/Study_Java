package coding_practice.practice;

import java.util.Scanner;

/*
문제
입력받은 숫자 중에 컴퓨터에서 생성한 난수를 몇 개 포함하고 있는 지 세어라

난수: 3
개수: 2개

*/

public class practice04 {
   public static void main(String[] args) {
     
     Scanner keyScanner = new Scanner(System.in);
     
     int randNum = (int)(Math.random() * 10);
     int count = 0;
     
     System.out.println("숫자를 입력 하세요");
     int number = Integer.parseInt(keyScanner.nextLine());
     
     while (number > 0) {
       if (number % 10 == randNum) {
         count++;
       }
       number /= 10;
     }
     
     System.out.println("난수: " + randNum);
     System.out.println("개수: " + count +"개");
     
     keyScanner.close();
   }
}
