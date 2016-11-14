package step01;

public class Exam000 {}

/* 1. 프로젝트 생성 시 자바프로젝트로 생성 할 경우
      - java 파일만들고 컴파일 하는데 아무 문제가 없다.

   2. 프로젝트 생성 시 일반프로젝트로 생성 할 경우
      - 폴더 구조를 아래와 같이 만들어 줘야 한다.
      
      src
        /main
           /java
           /resources
        /test
           /java
           /resocures
         
         
      - build.gradle 파일을 프로젝트 폴더 밑에 만든다.
      
      - build.gradle 파일에 아래와 같이 설정 해 둔다.
      
      1) 사용할 gradle 플러그인 가져오기
      apply plugin: 'java'
      apply plugin: 'eclipse'

      2) 컴파일 옵션 지정하기
      compileJava {
        options.encoding = 'UTF-8'  
        sourceCompatibility = '1.8' 
      }
      
      3) 터미널을 이용하여 해당 프로젝트 폴더로 이동 후 gradle Eclipse 실행
      
      4) 프로젝트 refresh
      

   
*/


