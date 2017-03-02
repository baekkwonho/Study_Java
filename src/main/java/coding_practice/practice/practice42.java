package coding_practice.practice;

import java.util.TreeSet;

/* 
  
  문제>
  배열안에 있는 이름 중 이씨와 김씨는 몇명인지 구하여라.
  또, "이재영"이라는 사람이 몇명있는지 구하여라.
  마지막으로 중복을 제외하여 오름차순으로 정렬하고 출력하여라.
  
  입력>
  String[] nameArr = {"이유덕","이재영","권종표","이재영","박민호","강상희","이재영",
        "김지완","최승혁","이성연","박영서","박민호","전경헌","송정환","김재성","이유덕","전경헌"};
  
  출력>
  이씨 : 6명
  김씨 : 2명
  이재영 : 3명
  [강상희, 권종표, 김재성, 김지완, 박민호, 박영서, 송정환, 이성연, 이유덕, 이재영, 전경헌, 최승혁]
  
  이유>
  배열을 반복 검사 하면서 이씨와 김씨를 substring메서드로 찾아 카운팅한다.
  이재영과 같은 이름이라면 카운팅을 한다.
  배열의 값들을 treeset을 이용하여 저장한다.
  treeset은 중복을 제거하고 보관하기 때문이다.
  

*/
public class practice42 {
  
  public static void main(String[] args) {
    
    String[] nameArr = {"이유덕","이재영","권종표","이재영","박민호","강상희","이재영",
        "김지완","최승혁","이성연","박영서","박민호","전경헌","송정환","김재성","이유덕","전경헌"};
  
    int jaeyoungCount = 0; // 이재영 카운트 변수
    int leeCount = 0; // 이씨 카운트 변수
    int kimCount = 0; // 김씨 카운트 변수
    
    TreeSet ts = new TreeSet(); // 중복을 제거한 이름 저장할 변수
    
    for (int i = 0; i < nameArr.length; i++) {
      ts.add(nameArr[i]); // 배열의 값 중복 제거하여 treeset에 넣기.
      if (nameArr[i].equals("이재영")) {
        jaeyoungCount++;
      }
      if (nameArr[i].substring(0,1).equals("이")) {
        leeCount++;
        continue;
      } else if (nameArr[i].substring(0, 1).equals("김")) {
        kimCount++;
      }
    }
    
    System.out.printf("이씨: %d명\n",leeCount);
    System.out.printf("김씨: %d명\n",kimCount);
    System.out.printf("이재영: %d명\n",jaeyoungCount);
    System.out.println(ts);
    
  }
  
}
