package c10_variable;

/*
 * JDK9버전 이후 이클립스로 프로젝트 생성시 옵션을 선택하면 module-info.java 파일이 자동으로 생성
 * 최초 Java Project 생성시 처음에 기본상태 만들기 체크상태 인데
 * 체크 해제후 프로젝트를 만들면 이후 생성되는 모든 Java Project에서 안 만들어짐
 * 
 * module-info.java 역할
 * jdbc driver같은 외부 클래스를 가져다 쓸때 requires 명령어로 이 파일에 알려주는 용도
 * 또는 다른 이클립스 프로젝트의 클래스를 가져다 쓸 수 있게 하는 용도
 * -> 14일차-MySQL-3 4분
 * 
 * 다만, 이것은 이클립스의 편집기의 기능이므로 사용하지 않을 예정
 * */

//클래스 코드 작성법과 콘솔에 문자열 출력

/**
 * 자바 프로그램 소스의 최소 단위는 클래스
 * 클래스명은 파일명과 일치해야 하며, 영어/숫자/언더바(_)만 사용 
 * 특히 첫 글자는 반드시 영문 대문자로 시작
 */

public class Ex10_StringPrint {

  //main 메서드 : 프로그램의 시작점
  public static void main(String[] args) {
    
    //문제) 콘솔창에 "독도는 대한민국 영토!" 문자열을 출력하시오.
    System.out.println("독도는 대한민국 영토!");
    // 콘솔에 문장을 출력하기 위한 명령어
    // 문장을 표현하는 방법 --> 쌍따옴표로 묶는다. --> 문자열
    
  }//end of main

}//end of Dokdo
