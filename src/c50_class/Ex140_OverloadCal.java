package c50_class;

//메소드 오버로딩 - 같은 기능을 매개변수 유형별로 여러개 제공하는 개념


/*
 * 같은 이름으로 여러개의 plus() 함수를 정의하는것 => 오버로딩
 * 
 * 오버로딩 조건
 * 
 * 1) 함수명이 같아야 한다. 
 * 2) 매개변수의 개수 or 매개변수의 데이터타입 or 매개변수의 순서가 달라야 한다. 
 * 3) 리턴타입은 상관없다.
 */

class Cal {

  public void plus(int i, int j) {
    System.out.println(i + j);
  }

  public void plus(float f, float g) {
    System.out.println(f + g);
  }

  public void plus(double d, double e) {
    System.out.println(d + e);
  }
}

public class Ex140_OverloadCal {

  
  public static void main(String[] args) {
  
    Cal cal = new Cal();

    // 아래의 plus() 메소드 호출이 잘 작동하도록 오버로딩 하시오.
    cal.plus(3, 5);
    cal.plus(0.1f, 0.2f);
    cal.plus(0.5d, 0.7d);
  }
}
