package c20_operator;

//비교연산자
public class Ex60_EqualOP {
  
  public static void main(String[] args) {
    
    // boolean타입의 값은 2개 -> true / false
    int a = 123;
    int b = 456;

    // 비교연산에 대한 결과는 boolean값이다.
    // 동등연산자 ==는 비교형, 참조형에 모두 사용가능 -> stack 저장값 동등비교
    boolean result1 = (a == b);// false
    boolean result2 = a != b;// true
    boolean result3 = a > b;// false
    boolean result4 = a <= b;// true

    System.out.println("1. result1 = " + result1);
    System.out.println("2. result2 = " + result2);
    System.out.println("3. result3 = " + result3);
    System.out.println("4. result4 = " + result4);
  }

}
