package c50_class;

class Member {
  // 일반적으로 멤버변수는 선언만 한다.
  String name;// null 로 초기화
  int age;// 0 으로 초기화
}

//멤버변수에 값 할당
public class Ex20_MemberMain {
  public static void main(String[] args) {
    // 하나의 클래스가 정의되면, 그 클래스의 구조를 기반으로하는
    // 여러 개의 객체(=정보묶음)를 생성할 수 있다.
    Member hong = new Member();
    hong.name = "홍길동";
    hong.age = 18;

    Member duly = new Member();
    duly.name = "둘리";
    duly.age = 7;

    System.out.println("이름: " + hong.name + ", 나이: " + hong.age);
    System.out.println("이름: " + duly.name + ", 나이: " + duly.age);
  }
}
