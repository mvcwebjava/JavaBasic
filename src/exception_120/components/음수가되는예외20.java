package exception_120.components;

//RuntimeException은 실행중에 작동
//예외처리 하지 않아도 되는 unchecked exception
//try~catch 구문을 강제하지 않는다.
public class 음수가되는예외20 extends RuntimeException {

  @Override
  public String getMessage() {
    return "입력값의 합이 음수가 되는 오류가 발생했습니다.";
  }
}
