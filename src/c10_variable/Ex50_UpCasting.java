package c10_variable;

//자동형변환(UpCasting)을 설명하는 예제
//참고 : https://tcpschool.com/java/java_datatype_basic
public class Ex50_UpCasting {
  public static void main(String[] args) {
    
    short s = 100; //2바이트  -32,768 ~ 32,767
    int i = s; //4바이트  -2,147,483,648 ~ 2,147,483,647
    long l = i; //8바이트
    float f = l; //4바이트
    double d = f; //8바이트
    
    System.out.println("1. s=" + s); //100
    System.out.println("2. i=" + i); //100
    System.out.println("3. l=" + l); //100
    System.out.println("4. f=" + f); //100.0
    System.out.println("5. d=" + d); //100.0

    System.out.println("----------------");
    
    int myage1 = 20;
    double myage2 = myage1;//자동형변환 : 작은범주의 데이터타입은 큰범주의 데이터타입으로 자동 변환
    
    System.out.println("6. myage1=" + myage1); //20
    System.out.println("7. myage2=" + myage2); //20.0
    
    System.out.println("----------------");
    
    char c1 = 'a'; //2바이트
    int num1 = c1; //자동형변환 : 작은범주의 데이터타입은 큰범주의 데이터타입으로 자동 변환
    System.out.println("8. num1=" + num1); //97
  }
}
