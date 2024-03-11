package c70_polymorphism;

import c60_extends.components.AirForce;
import c60_extends.components.Army;
import c60_extends.components.Navy;
import c60_extends.components.Unit;

public class Ex100_Polymorphism02 {
  public static void main(String[] args) {
      // 클래스 배열변수
      Unit[] units = new Unit[5];

      //상위클래스의 타입으로 저장
      units[0] = new AirForce("공군1호");
      units[1] = new AirForce("공군2호");
      units[2] = new Navy("해군1호");
      units[3] = new Army("육군1호");
      units[4] = new Army("육군2호");

      // 부대 일괄 공격
      for (int i = 0; i < units.length; i++) {
          units[i].attack();

          if (units[i] instanceof Army) {
              Army a = (Army) units[i];//다운캐스팅
              a.tank();
          } else if (units[i] instanceof Navy) {
              Navy n = (Navy) units[i];//다운캐스팅
              n.nucleus();
          } else {
              AirForce f = (AirForce) units[i];//다운캐스팅
              f.bombing();
          }
      }
  }
}
