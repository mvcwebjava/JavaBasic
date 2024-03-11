package c60_extends;

//다중상속과 생성자의 호출 순서 -> 상위클래스부터 호출됨
class Animal {
  public Animal(){
     System.out.println("1. Animal의 생성자함수 실행");
  }
}

class Person extends Animal{
  public Person(){
      System.out.println("2. Person의 생성자함수 실행");
  }
}

class Man extends Person{
  public Man(){
      System.out.println("3. Man의 생성자 함수 실행");
  }
}

public class Ex30_AnimalMain {
  public static void main(String[] args) {
      Man man = new Man();
  }
}
