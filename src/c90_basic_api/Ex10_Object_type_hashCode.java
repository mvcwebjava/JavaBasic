package c90_basic_api;

import c60_extends.components.Army;

//객체의 타입확인 방법과 같은 객체인지 확인하는 방법
public class Ex10_Object_type_hashCode {

  public static void main(String[] args) {
    /*
      -Object 클래스 특징 
      1. import 없이 사용가능 
      2. extends 선언없어도 자동 상속 
      3. 자바 모든 클래스들은 Object의 하위클래스 
      4. 모든 클래스들은 Object에 속한 메소드를 사용할 수 있다.  
    */
    
    //문제) 메모리상에서 같은 타입의 객체인지 확인
    Object obj1 = new Object();
    Object obj2 = new Object();
    
    //obj1 출력결과와 obj1.toString() 결과는 같다. 
    //즉, 객체이름만 작성하면 toString()이 자동 호출된다.    
    //getClass().getName() + '@' + Integer.toHexString(hashCode())
    System.out.println(obj1);//java.lang.Object@1e81f4dc
    System.out.println(obj1.toString());//패키지명.클래스명@16진수주소값
    
    Army army = new Army("육군");
    System.out.println(army);
    System.out.println(army.toString());
    
    /*
     * Object 클래스의 equals()는 '=='로 비교한것과 같은 결과이다. 
     * 즉, 기본적으로 주소값이 동등한지 비교한다. 하지만 하위클래스에서 얼마든지 오버라이딩 가능  
     * 대표적으로 String 클래스는 문자열 값을 비교할 수 있도록 toString() 메소드를 오버라이딩 했다. 
     */
    
    System.out.println("--------------");
    //동등연산자 ==는 비교형, 참조형에 모두 사용가능 -> stack 저장값 동등비교
    if(obj1 == obj2) {//false 
      System.out.println("obj1 == obj2 is TRUE");
    } else {
      System.out.println("obj1 === obj2 is False");
    }
    
    
    if(obj1.equals(obj2)) {//false
      System.out.println("obj1.equals(obj2) is TRUE");
    } else {
      System.out.println("obj1.equals(obj2) is False");
    }

    //패키지명.클래스명
    System.out.println("obj1.getClass() = " + obj1.getClass());
    System.out.println("obj1.getClass().getName() = " + obj1.getClass().getName());//자바에서 타입확인하는 방법 java.lang.Object
    
    System.out.println("obj2.getClass() = " + obj2.getClass());
    System.out.println("obj2.getClass().getName() = " + obj2.getClass().getName());//java.lang.Object
    
    //동일한 타입에 대한 .hashCode()는 같을 수 밖에 없다.
    System.out.println("obj1.getClass().hashCode() = " + obj1.getClass().hashCode());//1426407511
    System.out.println("obj2.getClass().hashCode() = " + obj2.getClass().hashCode());//1426407511
    
    //타입이 같더라도 각각의 객체에 대한 .hashCode()는 다르다.
    //해시 코드값이 다르면 다른 객체로 판단
    int obj1_hashCode = obj1.hashCode();//511833308 -> obj1 객체의 해시코드 값
    int obj2_hashCode = obj2.hashCode();//1785210046 -> obj2 객체의 해시코드 값
    System.out.println("obj1_hashCode = " + obj1.hashCode());
    System.out.println("obj2_hashCode = " + obj2.hashCode());
    
    System.out.println("obj1의 hexString = " + Integer.toHexString(obj1_hashCode));//1e81f4dc
    System.out.println("obj2의 hexString =  " + Integer.toHexString(obj2_hashCode));//6a6824be    
    
  }

}


