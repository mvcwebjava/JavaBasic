package c50_class;

//함수 호출시 인자값을 매개변수에 전달하는 예제
public class Ex60_ArgsFunction {
  // 매개변수 x, y
  public static void plus(int x, int y) {
    int result = x + y;
    System.out.println("1. plus(10, 20) = " + result);

    return;// 호출한곳으로 돌려주는 값이 없을경우 return 키워드 생략가능
  }

  public static void minus(int x) {
    int result = x - 1;
    System.out.println("2. minus(100) = " + result);
  }

  public static void main(String[] args) {

    plus(10, 20);// 여기에서 10,20은 "인자"라고 한다.
    minus(100);
  }
}
