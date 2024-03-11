package c50_class;

//함수의 호출
public class Ex50_CallFunction {
  
  //함수 안에서 선언한 변수는 그 함수 안에서만 유효하다.
  public static void cal() {
    int x = 100;
    int y = x + 1;// 101
    System.out.println("y = " + y);

    return;// 함수를 종료한다.

    // return 키워드로 인해 함수가 종료되었기 때문에 아래 코드는 실행 불가(에러발생)
    // System.out.println("cal 함수가 호출되었습니다.");
  }

  public static void main(String[] args) {
    // 여러번 사용이 가능하다.
    cal();// 함수안에서 또다른 함수를 호출
    cal();// 함수안에서 또다른 함수를 호출

    // System.out.println("x = ",x);
  }
}
