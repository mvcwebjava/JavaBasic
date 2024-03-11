package c20_operator;

//삼항연산자를 설명하는 예제
public class Ex90_ConditionOP {

  public static void main(String[] args) {
    
    // (조건식) ? 조건식이 참일때의 값 : 조건식이 거짓일때의 값;

    int a = 200;
    int b = 100;

    // 만약 a>b 이면 result 변수에 "a는 b보다 크다", 아니면 "a는 b보다 작다"를 저장하여 출력하시오.
    String result = (a > b) ? "a는 b보다 크다" : "a는 b보다 작다";

    System.out.println("연산결과 : " + result);
    
  }
}
