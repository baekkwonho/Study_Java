package coding_practice.practice;

/*
   두 개의 배열이 있다. 한 배열의 값을 다른 배열로 깊은 복사하라!
   {1, 2, 4, 7, 11, 9}
 */

public class practice09 {
  public static void main(String[] args) {
    
    int[] list1 = {1, 2, 4, 7, 11, 9};
    
    int[] list2 = new int[list1.length];
    
    for (int i = 0; i < list1.length; i++) {
      list2[i] = list1[i];
      System.out.println(list2[i]);
    }
    
    
  }
}
