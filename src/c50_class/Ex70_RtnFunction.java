package c50_class;

//함수를 호출한 곳으로 리턴값을 돌려주는 함수
public class Ex70_RtnFunction {
  
  public static int plus(int x) {
    int y = x + 1;
    return y;
  }

  public static int mul(int x) {
    return x * x;
  }

  public static void main(String[] args) {

    int result = plus(100); // 함수의 리턴값을 result에 저장

    System.out.println("plus(100) = " + result); // 리턴값을 출력에 사용
    System.out.println("mul(10) = " + mul(10));
  }
}
