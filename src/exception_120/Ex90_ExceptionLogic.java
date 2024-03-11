package exception_120;

import exception_120.components.Calculator20;

//RuntimeException 예제
//예외처리 하지 않아도 되는 unchecked exception
//try~catch 구문을 강제하지 않는다.
public class Ex90_ExceptionLogic {
  public static void main(String[] args) {
    
    int result = 0;
    
    result = Calculator20.add(3, -4);


    result = Calculator20.sub(3, 4);
    System.out.printf("sub : %d\n",result);
    

    result = Calculator20.multi(3, 4);
    System.out.printf("multi : %d\n",result);
    

    result = Calculator20.div(3, 4);
    System.out.printf("div : %d\n",result);
  }
}
