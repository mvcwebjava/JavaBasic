package c10_variable;

//여러가지 기본타입의 변수선언과 할당을 설명하는 예제
public class Ex30_BasicType {

  public static void main(String[] args) {
    
    //문제) 변수 num1에 값 정수 100을 저장하되 선언과 할당을 분리하시오.
    int num1;    
    num1 = 100;

    // 선언+할당+접미사의 사용
    long num2 = 1234567890000000000L;// Long타입 정수
    double num3 = 128.4d;
    float num4 = 3.14f;

    // 다른 자료형
    byte t = 100;
    short s = 250;
    
    /*
      아스키 코드와 유니코드는 다른 문자 인코딩 체계이며, 
      아스키 문자(0부터 127)의 경우, 아스키 코드값과 유니코드는 값이 동일           
     */
    
    // Char는 초기화 할 값이 없을 경우 한칸공백 추천
    char c = '가';// 문자 하나를 저장
    char u = '\u002A';//유니코드
    
    boolean b = true;// 진리값 - true 아니면 false

    /** 결과 출력 */
    // 문자열과 변수를 더하면, 내용이 연결되어 출력된다.
    System.out.println("1. num1=" + num1); //100
    System.out.println("2. num2=" + num2); //1234567890000000000
    System.out.println("3. num3=" + num3); //128.4
    System.out.println("4. num4=" + num4); //3.14
    System.out.println("5. t=" + t); //100
    System.out.println("6. s=" + s); //250
    System.out.println("7. c=" + c); //가
    System.out.println("8. u=" + u); //*
    System.out.println("9. b=" + b); //true      
}

}
