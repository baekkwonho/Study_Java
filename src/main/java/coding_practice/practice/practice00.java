package coding_practice.practice;

import java.util.Scanner;

//연습용

public class practice00 {
  
  public static void main(String[] args) {
    
   Scanner keyScanner = new Scanner(System.in);
   
   System.out.println("테스트 케이스 수를 입력 해 주세요.");
   int T = Integer.parseInt(keyScanner.nextLine());
   
   while (T > 0) {
     System.out.println("문자열을 입력 해 주세요.");
     String w = keyScanner.nextLine();
     
     compareString(w);
     
     
     //System.out.println(w.compareTo("ba"));
     
     //char[] w = keyScanner.nextLine().toLowerCase().toCharArray();
     
     
     T--;
   }
   
   keyScanner.close();
  }
  
  public static String compareString(String str) {
    char[] chars = str.toLowerCase().toCharArray();
    
    for (int i = 0; i < chars.length -1; i++) {
      char[] temp = chars;
      if (i == 0) {
        for (int j = i+1; j < temp.length - 1; j++) {
          String s = swap(temp, j, j+1);
        }
      }
      
    }
    
    return "";
    
  }
  
  public static String swap(char[] chars, int a, int b) {
    char c = chars[a];
    chars[a] = chars[b];
    chars[b] = c;
    
    String s = "";
    for (int i = 0; i < chars.length; i++) {
      s += chars[i];
    }
    
    return s;
    
  }
  
  
}
