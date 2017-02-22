package coding_practice.practice;


/*
  binaryGap
  
  hat, given a positive integer N, returns the length of its longest binary gap
  The function should return 0 if N doesn't contain a binary gap.

  For example, given N = 1041 the function should return 5,
  because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 
  정수를 입력하면 이진수로 변환하여 '1'과 '1'의 사이의 '0'의 갯수가 가증 큰 값을 구하라.
  입력 : 1041
  출력 : 5
  입력 : 529
  출력 : 4
  
 */

public class practice14 {
  
  public static void main(String[] args) {
    
    System.out.println(binaryGap(1041));
    System.out.println(binaryGap(529));
    
  }
  
  public static int binaryGap(int num) {
    String binary = Integer.toBinaryString(num); //입력받은 정수를 이진수로 변환
    char[] ch = binary.toCharArray(); // 이진수의 1과0을 배열에 하나씩 저장
    int count = 0; // 갯수 저장할 변수
    int max = 0; // 갯수 최대값을 저장할 변수
    
    for (int i = 0; i < ch.length; i++) {
        if (ch[i] == '0') { //배열의 값이 0이면 카운트 증가
            count++;
        } else {
            if (count > max) { // 배여르이 값이 1을 만났을 때 최대값과 비교
                max = count;
            }
            count = 0; // 다음 1과 1사이의 갯수를 위해 초기화
        }
    }
    return max;
  }
}

