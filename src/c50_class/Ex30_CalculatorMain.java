package c50_class;


//멤버 함수로만 이루어진 클래스 예제

//클래스는 설계도(붕어빵틀)
class Calculator {
  
  //멤버함수 선언
  //x, y는 plus 함수를 호출할때 넣어준 값을 받아내는 매개변수
  //매개변수의 유효범위(scope)는 함수내부이다.
  int plus(int x, int y) {
    return x + y;
  }
  
  //문제) 두개의 정수값을 매개변수 x, y에 받아 마이너스 연산하여 리턴하는 minus 함수
  int minus(int x, int y) {
  
    // return은 함수를 종료한다.
    // return은 리턴값이 있을경우 함수를 호출한 곳으로 리턴값을 돌려준다.
    return x - y;
  }
  
  int times(int x, int y) {
    return x * y;
  }
  
  int divide(int x, int y) {
    int result = 0;
  
    if (y != 0) {// 0으로 나눌 수 없으므로....
      result = x / y;
    }
  
    return result;
  }
}// end of Calculator

public class Ex30_CalculatorMain {
  public static void main(String[] args) {

 // Calculator 타입의 객체변수 생성 -> cal
    Calculator cal = new Calculator();

    int hab = cal.plus(100, 50);// 호출
    int cha = cal.minus(100, 50);
    int kob = cal.times(100, 50);

    System.out.println("1. 100+50 = " + hab);
    System.out.println("2. 100-50 = " + cha);
    System.out.println("3. 100*50 = " + kob);
    System.out.println("4. 100*50 = " + cal.divide(100, 50));
  }
}
