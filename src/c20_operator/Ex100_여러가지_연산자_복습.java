package c20_operator;

public class Ex100_여러가지_연산자_복습 {

  public static void main(String[] args) {
    
    //문자숫자 100을 진짜 정수로 변환하는 방법
    int num = Integer.parseInt("100");
    System.out.printf("num + 100 = %d", num+100);//200
    
    //자바의 기본연산자 + - * /(몫) %(나머지)
    int buscard = 100;//변수의 선언과 할당
    
    buscard = buscard + 5000;//5100 버스카드충전(버카충)-누적
    
    
    //복합대입연산자 +=  -=  /=  %=
    buscard += 5000;//10100
    
    buscard -= 100;//10000
    
    buscard *= 2;//20000
    
    buscard /= 5;//4000
    
    buscard %= 2;//0

    System.out.println("\nbuscard = "+buscard);
    
    
    
    int weight = 45;
    int height = 170;
    
    //증감연산자
    weight = weight + 1;//46
    weight += 1;//47
    weight++;//48   
    
    System.out.println("weight = "+weight);
    
    height = height-1;//169
    height -= 1;//168
    height--;//167
    
    
    System.out.println("height = "+height);
    
    
    //논리형 연산자 => true, false 추출
    //==  >  <    >=    <=   !=    !(부정)
    //true와 false의 데이터타입은 불린형 => boolean
    //boolean 형의 변수는 오직 true, false만 값으로 올 수 있다.
    
    boolean result;//불린형 변수 선언
    
    result = (weight==height);//false
    result = (weight != height);//true
    result = (weight < height);//true
    result = (weight >= height);//false
    
    
    
    //논리연산자 &&, || 에 대한 결과는 무조건 boolean 형이다.
    int a = 100;
    int b = 200;
    int x = 5;
    int y = 3;
    
    
    result = (a!=b) && (a==b);//false
    result = (a<b) && (x>y);//true
    
    System.out.println("result = "+result);
    
    
    
    boolean success = true;
    boolean fail = !success;//false
    
    System.out.println("fail = "+fail);//false
    
    
    
    //삼항연산자
    //String msg = (조건식) ? 조건식이 참일때의 값 : 거짓일때의 값;
    String msg = (a>b) ? "오늘은 금요일" : "내일도 수업합니다.";
    
    System.out.printf("msg = %s", msg);
    
  }  
}
