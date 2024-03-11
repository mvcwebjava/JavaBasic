package c60_extends;

//super 키워드를 이용한 상위클래스의 메소드 호출
class NewFather {
  public void sayHello(){
      System.out.println("NewFather의 sayHello()");
  }
}

class NewSon extends NewFather {

  @Override
  public void sayHello() {
    System.out.println("NewSon의 sayHello()~!");
  }

  public void test() {
    super.sayHello();
  }

}

public class Ex50_NewSon extends NewFather {
  
  public static void main(String[] args) {
    NewSon newson = new NewSon(); 
    newson.sayHello(); 
    newson.test(); 
    
    // son.super.sayHello(); 이런코드는 불가능
    newson.test();// 메소드를 하나 만든후 그 내부에서 부모의 메소드 호출가능
  } 
}
