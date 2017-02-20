package coding_practice.practice;

/*
  제곱근 갯수 구하기.
  A <= B
  A and B are integers
  
  ex> A = 4, B = 17 
      return 3
      4 = 2 * 2 , 9 = 3 * 3, 16 = 4 * 4
      
 */

public class practice32 {

  public static void main(String[] args) {
    
    System.out.println(solution(-4, 17));

  }

  public static int solution(int A, int B) {
    int count = 0;
    int i = 1;
    int result = 0;
    
    if (A > B) {
      return 0;
    }
    
    if ( A < 0 && B < 0) {
      while (true) {
        result = i * i;
        if (result <= Math.abs(A)) {
          count++;
        } 
        i++;
        if (result > A) {
          i = 1;
          break;
        }
      }
      while (true) {
        result = i * i;
        if (result <= Math.abs(B)) {
          count++;
        } 
        i++;
        if (result > B) {
          break;
        }
      }
      
    } else if ( A < 0 && B >= 0) {
      while (true) {
        result = i * i;
        if (result <= Math.abs(A)) {
          count++;
        } 
        i++;
        if (result > A) {
          i = 1;
          break;
        }
      }
      while (true) {
        result = i * i;
        if (result <= B) {
          count++;
        } 
        i++;
        if (result > B) {
          break;
        }
        
      }
      
    } else if (A >= 0 && B >= 0) {
      while (true) {
        result = i * i;
        if (result >= A && result <= B) {
          count++;
        }
        i++;
        if (result > B) {
          break;
        }
      }
    }
    
    return count;
    
  }
  
  
  
}
