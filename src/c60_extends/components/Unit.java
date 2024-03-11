package c60_extends.components;

public class Unit {
  
  // 부대명 변수(육군, 공군, 해군)
  private String name;

  public Unit(String name) {
      super();
      this.name = name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getName() {
      return this.name;
  }

  public void attack() {

  }
}
