package c90_basic_api;

//Object 클래스의 toString(), equeals()를 오버라이드 하는 예제
class MyObject /*extends Object*/ {
  private String msg;

  public MyObject(String msg) {
    this.msg = msg;
  }
  
  /*
    -Object 클래스 특징 
      1. import 없이 사용가능 
      2. extends 선언없어도 자동 상속 
      3. 자바 모든 클래스들은 Object의 하위클래스 
      4. Object 메소드들은 자바 다른 클래스 자동 포함    
    
      5. toString() – 객체 출력시에 자동 호출되어 결과 출력 
                  오버라이딩시에 객체출력내용변경 가능 
                  변경하기 전엔 – 패키지명.클래스명@16진수... 이렇게 출렴됨 
                  리턴결과는 String 
                  
      6. equals() – 객체의 동등성 비교. 
                 변경하기 전엔 – 주소만 동등 비교 
                 오버라이딩시에 변경한 기준으로 동등성 비교  
                 리턴결과는 boolean        
  */
      

  
  // 자동으로 Object()를 상속받기 때문에 toString(), equals() 메소드 모두 오버라이드 가능  
  
  //문제) toString() 메소드를 오버랑이딩 하여 멥버변수 msg 값이 출력되도록 오버라이드 하시오.  
  @Override
  public String toString() {
    return msg;
  }

  //문제) 두 객체의 동등성비교 규칙을 변경하기 위해 equals() 메소드를
  //타입이 같고 전달받은 문자열이 같으면 true 가 될 수 있도록 오버라이드 하시오.   
  @Override
  public boolean equals(Object obj) {
    if(this.getClass()==obj.getClass()) {//같은표현 obj instanceof MyObject
      return msg.equals( ((MyObject)obj).msg );      
      //return msg.equals( ((MyObject)obj).toString() );      
      //return msg.equals(obj.toString());      
    }
    return false;
  }
  
   
}

public class Ex20_Object_Override {

  public static void main(String[] args) {
    
    //문제) 같은 메모리에 있는 같은 타입의 객체인지 확인
    MyObject obj1 = new MyObject("굿모닝");
    
    MyObject obj2 = new MyObject("Good Morning");    
    MyObject obj3 = new MyObject("Good Morning");
    
    String str4 = new String("Good Morning");
    
    /*
     * 우리가 원하는 결과는 ...
     
      obj1.equals(obj2) -> false
      obj2.equals(obj3) -> true (타입이 같고 전달받은 문자열이 같으면 true)
      obj2.equals(str4) -> false
      
      
    *
    */

    if(obj1.equals(obj2)) {
      System.out.println("obj1.equals(obj2) is TRUE");
    }
    
    if(obj2.equals(obj3)) {
      System.out.println("obj2.equals(obj3) is TRUE");//true
    }
    
    if(obj2.equals(str4)) {
      System.out.println("obj2.equals(str4) is TRUE");
    }
    
    if(obj1 == obj2) {//false 동등연산자 ==는 비교형, 참조형에 모두 사용가능 -> stack 저장값 동등비교
      System.out.println("obj1 == obj2 is TRUE");
    }

  }

}


