package c60_extends.components;

public class AirForce extends Unit {
  public AirForce(String name) {
    //부모의 생성자 호출은 자식이 책임져야 한다.
    super(name);//부모의 생성자를 호출
  }

  @Override
  public void attack() {
      super.attack();
      System.out.println(this.getName() + " >> 이륙");
      System.out.println(this.getName() + " >> 공중공격 실행함");
  }

  public void bombing() {
      System.out.println(this.getName() + " >> 폭격");
  }
}
