package c20_operator;

//여러가지 자료형의 나눗셈 결과를 설명하는 예제
public class Ex20_DivOP {

  public static void main(String[] args) {
    
    /** 정수의 나눗셈 */
    int a = 7;
    int b = 3;
    int result1 = a / b;
    System.out.println("1. 7 / 3 = " + result1); //2

    /** 실수의 나눗셈 */
    double c = 7.0d;
    double d = 3.0d;
    double result2 = c / d;
    System.out.println("2. 7.0 / 3.0 = " + result2); //2.3333333333333335

    /** 정수와 실수를 계산 */    
    // int result3 = c / b; //이건 에러...

    double result3 = c / b;
    System.out.println("3. 7.0 / 3 = " + result3); //2.3333333333333335

    // 나눗셈의 오차
    System.out.println("4. 5 % 2 = " + 5 % 2); //1 (결과에 이상 없음)
    System.out.println("5. 5.2d % 2.0d = " + 5.2d % 2.0d); //오차 발생!! - 1.2000000000000002        
    
    // 0으로 나누기 -> 에러
    int num = 100;
    int zero = 0;
    int result4 = num / zero;// 연산이 불가능하므로 에러발생~!
    
    System.out.println("6. 100 / 0 = " + result4); //에러발생~!!!
  }
}
