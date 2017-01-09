package coding_practice.algorithms.sort.quicksort;

public class test_quicksort {
  static int[] element = {3,44,38,5,47,15,36,27,2,1,49,50,32,34,7};
  
  public static void main(String[] args) {
    quickSort(0, element.length - 1);
    print();
  }
  
  static void quickSort(int startIndex, int endIndex) {
    if ((endIndex - startIndex) <= 0) {
      return;
    }
    
    int pivotIndex = startIndex;
    int storeIndex = pivotIndex + 1;
    
    for (int i = pivotIndex + 1; i <= endIndex; i++) {
      if (element[i] < element[pivotIndex]) {
        swap(i, storeIndex);
        storeIndex++;
      }
    }
    swap(pivotIndex , storeIndex - 1);
    quickSort(startIndex, storeIndex - 2);
    quickSort(storeIndex, endIndex);
    
  }
  
  static void swap(int index1, int index2) {
    if (index1 == index2) {
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
