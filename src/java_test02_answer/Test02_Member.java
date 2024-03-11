package java_test02_answer;

//접근지정자 private
class Friend {
  
  // 은닉된 멤버변수 --> 현재 블록 안에서만 접근 가능함.
  private String name;
  private int age;

  // 은닉된 멤버변수에 값을 넣는 방법 --> 메서드를 사용
  public void setName(String name) {
      this.name = name;
  }

  public void setAge(int age) {
      this.age = age;
  }

  // 은닉된 멤버변수의 값을 읽는 방법
  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }
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
