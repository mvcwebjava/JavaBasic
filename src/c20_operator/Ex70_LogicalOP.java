package c20_operator;

//논리연산자
public class Ex70_LogicalOP {
  
  public static void main(String[] args) {
    
    int a = 100;
    int b = 200;
    int x = 5;
    int y = 3;
    
    // 논리연산에 대한 결과는 boolean형이다.
    boolean result1 = a != b || a == b;
    boolean result2 = a < b || x > y;
    boolean result3 = a < b || x < y;
    boolean result4 = a > b || x > y;
    boolean result5 = a > b || x < y;
    
    System.out.println("1. result1="+result1); //true
    System.out.println("2. result2="+result2); //true
    System.out.println("3. result3="+result3); //true
    System.out.println("4. result4="+result4); //true
    System.out.println("5. result5="+result5); //false
    System.out.println("----------------");
    
    // boolean 값 끼리는 논리연산이 가능하다.
    boolean r1 = a >= b;
    boolean r2 = x >= y;
    boolean result6 = r1 && r2;
    boolean result7 = r1 || r2;
    System.out.println("6. result6="+result6); //false
    System.out.println("7. result7="+result7); //true
    System.out.println("----------------");

    boolean success = true;
    boolean fail = !success;// false Not연산자
    System.out.println("8. fail="+fail); //false
  }
}
