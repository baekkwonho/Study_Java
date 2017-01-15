package step13.ex03;

//기존의 User 클래스의 코드를 상속받아 Student 클래스를 만든다.
//Student는 User 클래스의 코드를 사용할 수 있다.
public class Student extends User {
  /* User 클래스에서 상속받았다.
  String name;
  String email;
  String password;
  */
  String tel;
  Boolean working;
  
  static { // 스태틱 블록: 클래스가 로딩된 후 자동으로 실행되는 블록 
    System.out.println("Student 클래스 로딩");
  }
}
