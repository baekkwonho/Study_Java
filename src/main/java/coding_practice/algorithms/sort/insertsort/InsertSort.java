package coding_practice.algorithms.sort.insertsort;

public class InsertSort {
  static int[] element = {2,12,14,18,21,42,32,45,40,10,1,19,9};
  
  public static void main(String[] args) {
    print(); // 정렬전 배열 출력
    System.out.println();
    insertSort(); // 삽입 정렬
    print(); // 정렬후 배열 출력
  }
  
  static void insertSort() { // 삽입 정렬
    for (int i = 1; i < element.length; i++) {
      for (int j = i; j > 0; j--) {
        if (element[j] <= element[j-1]) {
          swap(j, j-1);
        }
      }
    }
  }
  
  static void swap(int index1, int index2) { // swap 메서드
    if (element[index1] == element[index2]) {
      return;
    }
    int temp = element[index1];
    element[index1] = element[index2];
    element[index2] = temp;
  }
  
  static void print() { // 출력 메서드
    for (int i = 0; i < element.length; i++) {
      System.out.printf("%d ", element[i]);
    }
  }
}
