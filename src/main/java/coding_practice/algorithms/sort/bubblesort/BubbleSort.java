package coding_practice.algorithms.sort.bubblesort;

public class BubbleSort {
  static int[] element = {1,38,29,5,10,24,50,48,37,25,12,15,4,7,8,28,19}; // 정렬할 배열 변수
  
  public static void main(String[] args) {
    print(); // 정렬 전 배열 콘솔에 찍기
    System.out.println();
    bubbleSort(); // 버블 정렬
    print(); // 정렬 후 배열 콘솔에 찍기
  }
  
  static void bubbleSort() { // 버블정렬 메서드
    for (int i = 0; i < element.length - 1; i++) {
      for (int j = 0; j< element.length - 1 -i; j++) { // 한번 반복 후에는 맨 마지막은 제일 큰 수가 오기 때문에 i의 값을 빼준다.
        if (element[j] >= element[j+1]) { // 큰값이 오른쪽으로 가기 위해 조건 설정
          swap(j, j+1);
        }
      }
    }
  }
  
  static void swap(int index1, int index2) { //인덱스 2개를 받아 swap 해주는 메서드
    if (element[index1] == element[index2]) {
      return;
    }
    int temp = element[index1];
    element[index1] = element[index2];
    element[index2] = temp;
  }
  
  static void print(){ // static 변수인 배열을 콘솔이 찍기
    for (int i = 0; i < element.length; i++) {
      System.out.printf("%d ", element[i]);
    }
  }
}
