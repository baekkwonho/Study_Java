/* 역할: 게시물 데이터를 보관 
 * 뭔가 데이터를 보관하는 역할자를 "값 객체(VO; Value Object)"라 부른다.
 * => 다른 말로 "(비즈니스) 도메인 객체(Domain Object)"라 부른다.
 * => 또 다른 말로 "데이터 전송 용으로 사용하는 객체(DTO; Data Transfer Object)"라 부른다.
 * => 용어 정리: VO == DTO == 도메인 객체 
 */
package step18.exam01;

import java.io.Serializable;

// java.io.Serializable 구현의 의미?
// => Board 객체의 값을 출력할 때 바이트 배열로 바꿀 수 있음을 허락한다는 의미.
// => 기본은 보안을 위해 객체 출력을 막는다.
public class Board implements Serializable {
  int no;
  String title;
  String contents;
  String writer;
  String createdDate;
  int viewCount;
  String password;

  public Board() {
    this.no = 1;
    this.title = "제목입니다";
    java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
    String str = today.toString();
    this.createdDate = str;
    this.viewCount = 0;
    this.password = "1111";
  }

  public Board(String title, String contents, String password) {
    this();
    this.title = title;
    this.contents = contents;
    this.password = password;
  }

  @Override
  public String toString() {
    return "Board [no=" + no + ", title=" + title + ", contents=" + contents + ", writer=" + writer + ", createdDate="
        + createdDate + ", viewCount=" + viewCount + ", password=" + password + "]";
  }
  
  
}







