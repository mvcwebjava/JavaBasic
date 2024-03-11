package c60_extends;

//메소드 오버라이딩
class Shoe {
  public void infoShoe()  {
     System.out.println("1. Shoe 클래스의 infoShoe() 실행");
  }
}

class Hill extends Shoe{
  @Override
  public void infoShoe() {      
     System.out.println("2. Hill 클래스의 infoShoe() 실행");
  }
}

class Hi_Hill extends Hill {
  @Override
  public void infoShoe() {      
     System.out.println("3. Hi_Hill 클래스의 infoShoe() 실행");
  }   
}

public class Ex40_ShoesMain {

  public static void main(String[] args) {
      
      Shoe s = new Shoe();
      s.infoShoe(); //Shoe 클래스의 infoShoe() 호출

      Hill h = new Hill();
      h.infoShoe(); //Hill의 sayHello() 호출

      
      Hi_Hill hh = new Hi_Hill();
      hh.infoShoe(); //Hi_Hill의 sayHello() 호출     

  }

}
