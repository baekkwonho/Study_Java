# Design Patterns


##factorymethod
- Test01.java :factory method 적용 전
  Car1.java
- Test02.java : factory method 적용 후
  Car2.java => factory method를 위한 method 추가
- Test03.java : factory method 적용 후
  Car3.java => 상수 이용

##iterator
- step01.Test.java : iterator pattern 적용 전
- step02.Test.java : iterator pattern 적용 후 사용하기
  step02.AscIterator.java, step02.DescIterator.java, step02.EvenIterator.java, step02.OddIterator.java => hasNext(), next() 정의 클래스
- step03.Test.java : iterator 클래스를 상속하여 만든 클래스 사용하기
  step03.Iterator.java => hasNext() 와 next() 를 강제적으로 구현하게 하는 수퍼클래스
  step03.AscIterator.java, step03.DescIterator.java, step03.EvenIterator.java, step03.OddIterator.java => iterator 서브 클래스로 hasNext(), next() 오버라이딩한 서브클래스
-step04.Test.java : iterator 추상 클래스를 상속하여 만든 클래스 사용하기
  step04.Iterator.java => 추상 클래스와 추상메서드로 만든 수퍼클래스
  step04.AscIterator.java, step04.DescIterator.java, step04.EvenIterator.java, step04.OddIterator.java => iterator 추상 클래스를 상속받아 hasNext()와 next()를 오버라이딩한 서클래스
- step05.Test.java : 추상 클래스의 한계
- step06.Test.java : 추상 클래스와 인터페이스 결합

