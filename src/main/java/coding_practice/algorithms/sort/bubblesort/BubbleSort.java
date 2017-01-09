package coding_practice.algorithms.sort.bubblesort;

public class BubbleSort {
  static int[] element = {1,38,29,5,10,24,50,48,37,25,12,15,4,7,8,28,19};
  
  public static void main(String[] args) {
    print();
    System.out.println();
    bubbleSort();
    print();
  }
  
  static void bubbleSort() {
    for (int i = 0; i < element.length - 1; i++) {
      for (int j = 0; j< element.length - 1 -i; j++) {
        if (element[j] >= element[j+1]) {
          swap(j, j+1);
        }
      }
    }
  }
  
  static void swap(int index1, int index2) {
    if (element[index1] == element[index2]) {
      return;
    }
    int temp = element[index1];
    element[index1] = element[index2];
    element[index2] = temp;
  }
  
  static void print(){
    for (int i = 0; i < element.length; i++) {
      System.out.printf("%d ", element[i]);
    }
  }
}
