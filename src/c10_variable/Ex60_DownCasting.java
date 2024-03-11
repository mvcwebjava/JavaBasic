package c10_variable;

//명시적형변환(DownCasting)을 설명하는 예제
public class Ex60_DownCasting {
  
  public static void main(String[] args) {
    long l = 100l; //8바이트
    int i = (int) l; //4바이트
    short s = (short) i; //2바이트

    System.out.println("1. l = " + l); //100
    System.out.println("2. i = " + i); //100
    System.out.println("3. s = " + s); //100

    double pi1 = 3.14d;

    // 큰 범위의 변수를 작은 범위의 변수에 대입하는 것은 에러!!
    // int pi2 = pi1;

    //큰 범위의 데이터를 작은 범위의 데이터에 할당하려면 명시적형변환(DownCasting)이 필요하다.
    int pi2 = (int) pi1;

    System.out.println("4. pi1 = " + pi1); //3.14
    System.out.println("5. pi2 = " + pi2); //3

    
    int num1 = 97;// 'a'에 해당하는 아스키코드
     
    //'c'에 해당하는 아스키코드 99
    char c2 = (char) (num1 + 2);// DownCasting
    
    System.out.println("6. c2 = " + c2); //c
  }
}
