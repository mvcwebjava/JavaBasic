package c20_operator;

//증감연산자
public class Ex40_IncreaseOP {
  
  public static void main(String[] args) {
    int a = 1;
    a = a + 1;//2
    a += 1;//3
    
    //증가증연자 - 단독으로 사용할경우 전위와 후위증감연산자의 결과는 같다.
    a++;//4
    ++a;//5
    System.out.println("1. a = "+a); //5

    int b = 5;
    b = b - 1; //4
    b -= 1; //3
    
    //감소연산자
    b--; //2 
    --b;//1
    System.out.println("2. b = "+b); //1
  }
}
