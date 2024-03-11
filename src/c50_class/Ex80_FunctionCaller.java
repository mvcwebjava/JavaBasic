package c50_class;

//함수안에서 다른 함수를 호출하는 예제
public class Ex80_FunctionCaller {
  
  public static int add(int x) {
    return x + 1;
  }
  
  public static int cal(int x) {
  
      //다른 함수를 호출
      return add(x) * 100;
  }
  
  public static void main(String[] args) {
      System.out.println("cal(99) = "+cal(99));
  }
}
