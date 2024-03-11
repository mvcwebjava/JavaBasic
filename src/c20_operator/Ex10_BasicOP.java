package c20_operator;

//사칙연산 : +  -  *  / % 연산자를 설명하는 예제
public class Ex10_BasicOP {
  
  public static void main(String[] args) {
    int num1 = 12;
    int num2 = 8;

    int result1 = num1 + num2;// 20
    int result2 = num1 - num2;// 4
    int result3 = num1 * num2;
    int result4 = num1 / num2;// 몫 1
    int result5 = num1 % num2;// 나머지 4
    
    System.out.println("1. 12 + 8 = " + result1); //20
    System.out.println("2. 12 - 8 = " + result2); //4
    System.out.println("3. 12 * 8 = " + result3); //96
    System.out.println("4. 12 / 8 = " + result4); //1
    System.out.println("5. 12 % 8 = " + result5); //4
  }
}
