package coding_practice.practice;

import java.util.Scanner;

//연습용

public class practice00 {
  
  public static void main(String[] args) {
    
    Scanner keyScanner = new Scanner(System.in);
    
    System.out.println("문자열을 입력해 주세요.");
    char[] chars = keyScanner.nextLine().toUpperCase().toCharArray();
    int[] counts = new int[26];
    
    for (int i = 0; i < counts.length; i++) {
      counts[i] = 0;
    }
    
    for (int i = 0; i < chars.length; i++) {
      counts[chars[i] - 'A']++;
    }
    
    for (int i = 0; i < counts.length; i++) {
      if ( counts[i] <= 0)
        continue;
      
      System.out.printf("%c: %d\n", (char)(i + 'A'), counts[i]);
    }
    
  }
}
