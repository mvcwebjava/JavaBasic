package c50_class;

//생성자함수를 오버로딩하여 멤버변수의 값을 초기화
class Magic {

  private int num;// 0
  private String color;// null

  // 기본 생성자함수 명시적으로 작성해보기
  // 보이지 않는 가상 매개변수 this를 컴파일러가 첫번째 매개변수로 넣어준다.
  public Magic() {}

  // Constructor OverLoading
  // 보이지 않는 가상 매개변수 this를 컴파일러가 첫번째 매개변수로 넣어준다.
  public Magic(int num, String color) {
    this.num = num;
    this.color = color;
  }

  void show(Magic this) {
    System.out.println("this = " + this);
    System.out.println("num = " + this.num);
    System.out.println("color = " + this.color);
  }

}

public class Ex120_MagicMain {

  public static void main(String[] args) {
    
    // int age;// 초기화가 안된 지역변수의 값을 출력시도 해서 에러발생
    // System.out.println("age = " + age);    
    
    // 객체변수에는 참조값이 할당된다.
    // 객체변수를 참조변수라고도 한다.
    // Refference Type 레퍼런스타입 이라고 한다.      
    Magic magic_1 = new Magic();
    magic_1.show(); // this : lecture_10.Magic@2a139a55
    
    Magic magic_2 = new Magic(7, "블루");     
    magic_2.show(); // this : lecture_10.Magic@15db9742

  }

}
