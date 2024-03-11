package c100_inner_class;

/*
  상속을 받아야 하는 인터페이스가 많을 때
  오버라이딩하여 구현해야 하는 메소드도 많아지게 되는데
  이때 각각의 메소드가 어떤 인터페이스에 속해있는지
  구분하기가 매우 어려워지기 때문에 아래와 같은 형태의 코드가 사용된다.
  
  특히ㅡ 안드로이드앱에서 이런 상황들이 많다.
*/

interface Duly{
  void greet();
}

//inner 클래스는 우리가 직접 만들기 보다는
//구글링 하다가 비슷한 코드를 봤을때 이해할 수 있는 수준이면 된다.
public class AnnoyInterface_20 {
  public static void main(String[] args) {
    
    //Duly duly = new Duly(); //이런식으로 객체 생성은 불가능
    
    //무명 = 익명 = ANONYMOUS CLASS 사용법 -> 인터페이스 타입의 객체를 직접 생성
    //"인터페이스->클래스상속->객체생성" 하는 과정을 단순화시킨 문법
    //Duly를 상속받은 클래스를 정의 및 오버라이딩하여 객체를 동시에 생성 -> 익명클래스
    //특징 : 실제로 "Duly를 상속받아 이렇게 구현할께~!" 라는 코드 구현부는 있지만 상속받은 하위 클래스의 이름은 필요없다. 
    //main() 메소드 안에 들엉가 있으므로 inner class(지역내부클래스) 이다.
    
    Duly duly = new Duly() {//이름 없는 내부클래스 형태 - 안드로이드앱에서 많이 사용되는 방식의 코드
      public void greet() {
        System.out.println("안녕, 나는 아기공룡 둘리야~!");
      }
    };//Duly
    
    duly.greet();
    
  }//main
}
