package step13.ex01;

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
}
