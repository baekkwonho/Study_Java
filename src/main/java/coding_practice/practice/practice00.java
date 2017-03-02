package coding_practice.practice;

//연습용

public class practice00 {
  
  public static void main(String[] args) {
    
    String name = "kwonho";
    
    char[] chars = name.toCharArray();
    int[] counts = new int[26];
    
    for (int i = 0; i < counts.length; i++) {
      counts[i] = 0;
    }
    for (int i = 0; i < chars.length; i++) {
      counts[chars[i] - 'a']++;
    }
    
    for (int i = 0; i < counts.length; i++) {
      if ( counts[i] == 0) {
        continue;
      } else {
        System.out.printf("%c: %d\n", (char)(i + 'a'), counts[i]);
      }
    }
    
  }
  
  
  
}
