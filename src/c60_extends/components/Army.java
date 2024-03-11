package c60_extends.components;

public class Army extends Unit {
  public Army(String name) {
    //부모의 생성자 호출은 자식이 책임져야 한다.
    super(name);//부모의 생성자를 호출
  }

  @Override
  public void attack() {
      super.attack();
      System.out.println(super.getName() + " >> 지상공격 실행함");
  }

  public void tank() {
      System.out.println(super.getName() + " >> 탱크공격");
  }
}
