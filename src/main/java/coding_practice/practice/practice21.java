package coding_practice.practice;

/*
   FogRiverOne
   
  If the frog is never able to jump to the other side of the river, the function should return −1.
  For example, given X = 5 and array A such that:
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
  the function should return 6, as explained above.
  
  문제>
  개구리가 강을 건너려한다.
  강에는 돌이 있어서 밟으며 넘어가야 한다.
  X동안 점프하며 넘어갈 수 있고, 기존에 밟았던 돌(배열의 값이 같은 돌)은 넘어가야 한다.
  이 때 X동안 몇번째 있는 돌까지 갈수 있는지 구하여라.
  이 함수는 기본으로 -1을 리턴한다.
  
  입력>
  5, A[1,3,1,4,2,3,5,4]
  
  출력>
  6
  
  이유>
  5초 동안 개구리는 한번씩 뛴다.
  처음 1, 3 은 뛸 수 있다.
  다음 1이 나왔을 때는 다음 돌인 4로 뛰어야 한다.
  그렇게 5번을 반복하면 6번째 돌에 도착하게 되어 6을 반환한다. 
  
  코드를 설명하면 아래와 같다.
  
  1회전 -> A[0] <= 5 && arr[0] != 0 -> false -> arr[0] = 1, sec--
  2회전 -> A[1] <= 5 && arr[2] != 0 -> false -> arr[2] = 1, sec--
  3회전 -> A[2] <= 5 && arr[0] != 0 -> true
  4회전 -> A[3] <= 5 && arr[3] != 0 -> false -> arr[3] = 1, sec--
  이렇게 총 6번을 반복하게 된다.
 */

public class practice21 {

  public static void main(String[] args) {

    int arr[] = {1,3,1,4,2,3,5,4};

    System.out.println(frogRiverOne(5, arr));

  }

  public static int frogRiverOne(int X, int[] A) {
    
    int arr[] = new int[X]; // X의 크기만큼 배열 생성
    int sec = X; // X를 임시변수에 저장
    
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && arr[A[i]-1] != 0) { // 밟았던 돌인지 아닌지 비교
            continue;
        } else {
            arr[A[i]-1] = 1; // 밟은 돌을 배열의 값을 바꿔주며 체크한다.
            sec--;
        }
        
        if (sec == 0) { // sec 즉 5초가 지났으므로 0이 되었고 해당 인덱스를 리턴한다.
            return i;
        }
    }
    return -1; // 기본으로 리턴될 값은 -1이다.
  }
  
}

