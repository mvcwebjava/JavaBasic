package c60_extends.components;

public class Navy extends Unit {
  public Navy(String name) {
      //부모의 생성자 호출은 자식이 책임져야 한다.
      super(name);//부모의 생성자를 호출
  }

  @Override
  public void attack() {
      super.attack();
      System.out.println(this.getName() + " >> 어뢰 발사!!");
      System.out.println(this.getName() + " >> 지상 상륙");
  }

  public void nucleus() {
      System.out.println(this.getName() + " >> 핵미사일");
  }
}
