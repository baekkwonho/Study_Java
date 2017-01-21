package coding_practice.practice;


/*
  binaryGap
  
  hat, given a positive integer N, returns the length of its longest binary gap
   The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5,
 because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 */

public class practice14 {
  
  public static void main(String[] args) {
    
    System.out.println(binaryGap(20));
    System.out.println(binaryGap(529));
    
  }
  
  public static int binaryGap(int num) {
    String binary = Integer.toBinaryString(num);
    char[] ch = binary.toCharArray();
    int count = 0;
    int max = 0;
    for (int i = 0; i < ch.length; i++) {
        if (ch[i] == '0') {
            count++;
        } else {
            if (count > max) {
                max = count;
            }
            count = 0;
        }
    }
    return max;
  }
}

