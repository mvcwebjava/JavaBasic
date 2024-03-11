package c10_variable;

//불변변수(상수)의 선언과 할당을 설명하는 예제
public class Ex40_FinalVariable {

  public static void main(String[] args) {
    
    int width = 100;// 가변변수

    //final 키워드를 붙이면 js의 const 역할을 하여 불변변수(상수)가 된다.
    final double PI = 3.14d;

    System.out.println("1. width = " + width); //100
    System.out.println("2. PI = " + PI); //3.14

    
    width = 200;// 가변변수는 재할당 가능
    
    // PI = 3.141582d;//final 키워드를 붙인 불변변수는 재할당 불가능 -> 에러발생     

    System.out.println("3. width = " + width); //200
    System.out.println("4. PI = " + PI); //3.14
  }
  
}
