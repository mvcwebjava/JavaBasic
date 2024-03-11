package c50_class;

//getter, setter 기능의 메소드
class Computer {

  private String brand;// 초기화시 자동으로 null(지금 현재 값을 알수없다) 값이 할당됨

  // 기본 생성자함수 명시적으로 작성해보기
  public Computer() {
  }

  // brand 변수에 값을 할당하는 함수 정의
  // setter(세터)함수
  public void setBrand(String name) {
    brand = name;
  }

  // brand 변수에 저장된 값을 리턴하는 함수 정의
  // getter(게터)함수
  public String getBrand() {
    return brand;
  }

}

public class Ex170_ComputerMain {
  public static void main(String[] args) {

    Computer com = new Computer();

    // 세터를 이용해 private 변수에 값을 할당
    com.setBrand("Apple MacBook Pro");

    // 게터를 이용해 private 변수의 값을 인출
    String brand = com.getBrand();

    System.out.println("컴퓨터 브랜드는 " + brand);
  }
}
