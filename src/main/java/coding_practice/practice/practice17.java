package coding_practice.practice;

/*
  FrogJmp
  
  that, given three integers X, Y and D, 
  returns the minimal number of jumps from position X to a position equal to or greater than Y.

  For example, given:
  
    X = 10
    Y = 85
    D = 30
  the function should return 3, because the frog will be positioned as follows:
  after the first jump, at position 10 + 30 = 40
  after the second jump, at position 10 + 30 + 30 = 70
  after the third jump, at position 10 + 30 + 30 + 30 = 100
  
  문제>
  개구리가 X에서 Y까지 D만큼의 점프력으로 점프하며 간다.
  이 때 개구리가 X에서 Y까지 가는데 걸리는 점프수를 구하여라.
  
  입력>
  X = 10, Y = 85, D = 30
  
  출력>
  3
  
  이유>
  10에서 30만큼 점프하여 40이 되고, 40에서 30만큼 뛰어 70이 된고, 또 한번 30만큼 뛰어 100이 되는데
  이 때 85보다 멀리 가괴 되어 횟수는 3이 된다.
  
  1. 목적지의 값(Y)에서 출발지의 값(X)을 뺀 값(jump)을 구한다.( 출발 기준을 0부터 하게 된다.)
  2. 위에서 뺀 값(jump)를 점프력(D)로 나누어 나머지가 0이면 그 횟수를 리턴한다.
  3. 나머지가 0이 아닌 경우에는 점프수가 1회 증가 한 후 리턴한다.

 */

public class practice17 {

  public static void main(String[] args) {
   
    System.out.println(frogJmp(10,85,30));
    
  }

  public static int frogJmp(int x, int y, int d) {
    
    int jump = y - x; // 출발 기준 0으로 맞추고 총 거리를 구한다.
    return (jump%d == 0) ? jump/d : jump/d + 1; // 총 거리를 점프력으로 나누어 나머지값으로 횟수를 센다.
    
  /* 
    정답은 나오지만 성능이 안좋다.
    길이가 길고 반복횟수가 많아 지게 되면 성능이 떨어지게 된다.
    int jump = 0;
    while (x < y) {
      x += d;
      jump++;
    }
    return jump;
  */
    
  }
  
}

