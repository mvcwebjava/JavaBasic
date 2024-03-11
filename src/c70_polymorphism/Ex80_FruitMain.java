package c70_polymorphism;

//업캐스팅시 호출할 수 있는 메소드와 없는 메소드 구분하는 예제
class Fruit {
  public void color(){
      System.out.println("다양한 과일색");
  };
}

class Apple extends Fruit {
  public void taste() {
    System.out.println("1. 상쾌한 맛");
  }

  public void size() {
    System.out.println("2. 큰 부사");
  }

  @Override
  public void color() {
    System.out.println("3. 빨간색 사과");
  }
}

class FineApple extends Apple {
  public void color(){
      System.out.println("4. 노란색 파인애플");
  }
}

public class Ex80_FruitMain {

  public static void main(String[] args) {

      Apple apple = new Apple();

      apple.color();
      apple.taste();
      apple.size();

      System.out.println("----------------------------------");
      
      Fruit f = new Apple();        
      f.color(); // 애플의 메소드 호출 - 가상메소드        
      //  f.size(); // Fruit 클래스는 size() 가 없으므로 호출 불가

      System.out.println("----------------------------------");
              
      Fruit f2 = new FineApple();
      f2.color(); // 파인애플의 메소드 호출 - 가상메소드  
  }

}
