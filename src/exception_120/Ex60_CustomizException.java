package exception_120;

public class Ex60_CustomizException {

  public static void main(String[] args) {

    BasicOP op = new BasicOP();
    int result = 0;

    try {
      result = op.add(5000, -6000);
      System.out.println("add = " + result);

    } catch (MinusException e) {
      System.out.println("1. 예외오류가 발생했습니다.");
      System.out.println("2. 원인 : " + e.getMessage());
    }

    System.out.println("\n★★★★★ 프로그램 종료 ★★★★★");
  }  
}
