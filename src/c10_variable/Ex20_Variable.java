package c10_variable;

//변수의 선언과 값할당을 설명하는 예제

public class Ex20_Variable {

  //실행함수 main() - 프로그램의 시작점
  public static void main(String[] args) {
    
    
    //String은 초기화 할 값이 없을 경우 빈문자열 추천
    
    //문제) "둘리"를 값으로 가지는 문자열 변수 name을 선언하고 값을 할당하시오        
    String name = "둘리";// 변수의 선언과 할당을 동시에
    
    
    //선언과 값할당을 분리
    int age;
    age = 7;
    
    //문제) name,age 변수를 이용하여 "내친구 둘리는 7살 입니다."로 출력되도록 코드를 작성하시오.
    System.out.println("내친구 "+name+"는 "+age+"살 입니다.");

  }

}
