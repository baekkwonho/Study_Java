package coding_practice.algorithms.sort.quicksort;

public class QuickSort {
  static int[] element = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
  
  public static void main(String[] args) {
    quickSort(0,element.length - 1); // 퀵정렬
    print(); // 배열 출력
  }
  
  static void quickSort(int startIndex, int endIndex) { // 퀵정렬
    if ((endIndex - startIndex) <= 0) //  정렬할 데이터가 1개 이하면 정렬할 게 없다.
      return;
    
    int pivotIndex = startIndex; // 기준 인덱스 변수
    int storeIndex = pivotIndex + 1; // 다음 기준 인덱스를 가르킬 변수
    
    for (int i = pivotIndex + 1; i <= endIndex; i++) {
      if (element[i] < element[pivotIndex]) { // 기준값보다 작은 것들을 모두 옆에 두고, 다음 기준 인덱스(storeIndex)를 증가
        swap(i, storeIndex);
        storeIndex++;
      }
    }
    swap(pivotIndex, storeIndex - 1); // 기준값과 다음 기준값의 이전까지의 위치를 바꾼다. 기준값보다 모두 작은 값들이 오게 된다.
    
    quickSort(startIndex, storeIndex - 2); // 기준의 왼쪽 부분을 퀵정렬 시킨다.
    quickSort(storeIndex, endIndex); // 기준의 오른쪽 부분을 퀵정렬 시킨다.
    
  }
  
  static void swap(int index1, int index2) { // swap 메서드
    if (index1 == index2) // 교환할 값의 인덱스가 같다면 교환할 필요가 없다.
      return;
    int temp = element[index1];
    element[index1] = element[index2];
    element[index2] = temp;
  }
  
  static void print() { // 출력 메서드
    for (int value : element) {
      System.out.printf("%d, ", value);
    }
  }
}
