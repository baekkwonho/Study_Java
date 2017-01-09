package coding_practice.algorithms.sort.selectionsort;

public class SelectionSort {
  static int[] element = {40,3,21,20,48,39,32,30,14,17,2,7,4,1,50,49};
  
  public static void main(String[] args) {
    print();
    System.out.println();
    selectionSort();
    print();
    
  }
  
  static void selectionSort() {
    for (int i = 0; i < element.length - 1; i++) {
      for (int j = i + 1; j < element.length; j++) {
        if (element[i] >= element[j]) {
          swap(i, j);
        }
      }
    }
  }
  
  static void swap(int index1, int index2) {
    if (element[index1] == element[index2]){
      return;
    }
    int temp = element[index1];
    element[index1] = element[index2];
    element[index2] = temp;
  }
  
  static void print() {
    for (int i = 0; i < element.length; i++) {
      System.out.printf("%d ", element[i]);
    }
  }
}
