package java_test02;

class Friend {
  
  private String name;
  private int age;
  
  // name 멤버변수에 대한 getter 함수를 정의하시오. (10점)

  // 문제) name 멤버변수에 대한 setter 함수를 정의하시오. (10점)

  // 문제) age 멤버변수에 대한 getter, setter 함수를 정의하시오. (10점)
}

public class Test02_Member {
  public static void main(String[] args) {
    Friend hong = new Friend();
    hong.setName("홍길동");
    hong.setAge(18);

    String name = hong.getName();
    System.out.println("1. 이름: " + name);

    int age = hong.getAge();
    System.out.println("2. 나이: " + age);
  }
}
