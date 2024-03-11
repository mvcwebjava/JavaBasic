package c20_operator;

import java.io.IOException;

public class Quiz_01_Casting {

  public static void main(String[] args) throws NumberFormatException, IOException {
    
    //문제1) 정수형변수 num1 과 num2에 각각 100, 200을 할당하시오.
    int num1 = 100;
    int num2 = 200;
    
    //문제2) 정수형 변수 result에 num1+num2의 값을 할당하시오.
    int result = num1 + num2;
    
    //콘솔창에 결과출력
    System.out.println("결과");
    System.out.println(result);
    System.out.printf("결과는 %d\n", result);
    System.out.printf("num1 + num2 = %d\n", result);

    //문제3) 나중에 게시판 페이지네이션의 prev 연산에 활동됨
    System.out.println("(int)Math.ceil(1/10) 의 연산결과가 1이 되게 하려면?");
    System.out.println("연산결과 = "+ (int)Math.ceil(1/10));
    System.out.println("연산결과 = "+ (int)Math.ceil((double)1/10));//해답
    
  }  
}
