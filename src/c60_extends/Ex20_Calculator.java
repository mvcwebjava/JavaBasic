package c60_extends;

/*
  디자인패턴 IS-A, has-A
  
  ChildCal는 ParentCal이다. -> ChildCal는 ParentCal의 특성을 모두 가진다. -> 상속관계
    IS-A 관계가 성립한다면 상속처리 하여 사용하자~!
    (is a relationship -> inheritance)
  
  has-A 관계 -> "가지다" 포함관계가 성립한다면
    객체를 생성하여 클래스에서 변수로 사용하자~!
    (has a relationship -> association)
*/

//상속을 통한 기능확장을 설명하는 예제
//부모, 상위클래스
class ParentCal {
  public ParentCal() {
    super();// Object 클래스의 생성자함수를 호출
    System.out.println("ParentCal 생성자함수가 먼저 실행됨");
  }  
  
  public int plus(int x, int y) {
      return x + y;
  }
  public int minus(int x, int y) {
      return x - y;
  }
} //부모 클래스


//자식, 하위클래스
class ChildCal extends ParentCal {

  // 상속을 받았을 경우 아래의 기본생성자에 super()가 자동 추가된다.
  public ChildCal() {
    super();// 생략가능
    System.out.println("ChildCal 생성자함수는 그후에 실행됨");
  }
  
  public int mul(int x, int y) {
    return x * y;
  }
  
  public int div(int x, int y) {
    if (y != 0) {
      return x / y;
    }
  
    return 0;
  }
}

public class Ex20_Calculator {

  public static void main(String[] args) {
      
    // 부모객체
    ParentCal parent = new ParentCal();
    
    System.out.println(parent.plus(100, 50));
    System.out.println(parent.minus(100, 50));

    System.out.println("---------------");
        
    // 자식객체
    ChildCal child = new ChildCal();
    System.out.println(child.plus(200, 100));
    System.out.println(child.minus(200, 100));
    System.out.println(child.mul(200, 100));
    System.out.println(child.div(200, 100));
  }

}
