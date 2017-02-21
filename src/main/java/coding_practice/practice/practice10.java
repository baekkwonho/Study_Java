package coding_practice.practice;

/*
   두 개의 배열이 있다. 한 배열의 값을 다른 배열로 역순으로 복사하라
   {1, 2, 4, 7, 11, 9}
   
   출력: 9, 11, 7, 4, 2, 1
 */

public class practice10 {
  public static void main(String[] args) {
    
    int[] list1 = {1, 2, 4, 7, 11, 9};
    
    int[] list2 = new int[list1.length];
    
    for (int i = 0; i < list1.length; i++) {
      list2[list1.length - 1 - i] = list1[i]; //맨 마지막부터 첫번째 값 순으로 값 넣기.
    }
    
    for (int i = 0; i < list2.length; i++) {
      System.out.printf("%d, ",list2[i]);
    }
    
    
  }
}
