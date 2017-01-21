package coding_practice.practice;


/*
  FrogJmp
  
  that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100

 */

public class practice17 {

  public static void main(String[] args) {
   
    System.out.println(frogJmp(10,85,30));
    
  }

  public static int frogJmp(int x, int y, int d) {
    
    /* 정답은 나오지만 성능이 안좋다.
    int jump = 0;
    while (x < y) {
      x += d;
      jump++;
    }
    return jump;
    */
    
    int jump = y - x;
    return (jump%d == 0) ? jump/d : jump/d + 1;
    
  }
  
}

