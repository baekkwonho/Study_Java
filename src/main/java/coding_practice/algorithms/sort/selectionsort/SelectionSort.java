package coding_practice.algorithms.sort.selectionsort;

public class SelectionSort {
  static int[] element = {40,3,21,20,48,39,32,30,14,17,2,7,4,1,50,49};
  
  public static void main(String[] args) {
    print(); // 정렬 전 배열 출력
    System.out.println();
    selectionSort(); // 선택정렬
    print(); // 정렬 후 배열 출력
    
  }
  
  static void selectionSort() { // 선택정렬 구현
    for (int i = 0; i < element.length - 1; i++) {
      for (int j = i + 1; j < element.length; j++) {
        if (element[i] >= element[j]) {
          swap(i, j);
        }
      }
    }
  }
  
  static void swap(int index1, int index2) { // swap 메서드
    if (element[index1] == element[index2]){
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
