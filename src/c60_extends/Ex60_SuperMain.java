package c60_extends;

//super를 이용한 상위클래스의 생성자함수 호출
class SuperFather {
  private String name;

  public SuperFather(String name) {
      this.name = name;      
      System.out.println("SuperFather의 생성자 호출");  
  }
}

class SuperSon extends SuperFather{
  public SuperSon(String str) {
    super(str); 
    System.out.println("SuperSon의 생성자 호출"); 
}
}

public class Ex60_SuperMain {

  public static void main(String[] args) {
    SuperSon son = new SuperSon("홍길동");
  } 
}
