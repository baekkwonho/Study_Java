/* 주제: String 클래스 - split()
 */
package step14;

public class Exam137_8 /*extends Object*/ {
  public static void main(String[] args) {
    String[] arr = "홍길동 임꺽정 유관순 임청하 왕조현 오천련".split(" ");
    for (String s : arr) {
      System.out.println(s);
    }
  }

}






