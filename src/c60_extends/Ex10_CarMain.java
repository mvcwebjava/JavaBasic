package c60_extends;

//is-a 상속 : SM -> Sedan -> Car
//상속을 통해 기능을 확장할 수 있다.
class Car {
  public void carSound() {
      System.out.println("1. Car : 빵~빵!");
  }
}

class Sedan extends Car {
  public void sedanSound() {
      System.out.println("2. Sedan : 빠바방~!");
  }
}

class SM extends Sedan {
  public void smSound() {
      System.out.println("3. Sedan : 빵라방빵!");
  }
}

public class Ex10_CarMain {

  static int num = 100;

  public static void main(String[] args) {
    
    System.out.println(num);//static 변수만 출력가능
      
    SM sm = new SM(); // SM 객체 생성
    
    sm.carSound(); // 빵~빵!       
    sm.sedanSound(); // 빠바방~!        
    sm.smSound(); // 빵라방빵!
  }

}
