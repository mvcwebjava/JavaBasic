package exception_120.components;


public class Calculator10 {
  
  public Calculator10() {
  }
  

  public static int add(int x, int y) throws 천을넘는예외, 음수가되는예외 {
    int result = x+y;
    
    //결과값이 1000을 넘으면 안되는 상황으로 가정
    if(result>1000)
      throw new 천을넘는예외();//예외를 던진다.
    
    //결과값이 음수가 되면 안되는 상황으로 가정
    if(result<0)
      throw new 음수가되는예외();
    
    return result;
  }
  
  
  public static int sub(int x, int y) {
    int result = x-y;
    return result;
  }
  
  
  public static int multi(int x, int y) {
    int result = x*y;
    return result;
  }
  
  
  public static int div(int x, int y) {
    int result = x/y;
    return result;
  }
  
}
