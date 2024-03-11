package c70_polymorphism;

//다형성 - 클래스의 업캐스팅 규칙을 설명하는 예제
interface SmartPhone {
  public abstract String screen();
  public abstract String button();
}

class Samsung implements SmartPhone {

  @Override
  public String screen() {
    return "삼성스크린";
  }

  @Override
  public String button() {
    return "삼성버튼";
  }

}

class LG implements SmartPhone {

  @Override
  public String screen() {
    return "엘지 스크린";
  }

  @Override
  public String button() {
    return "엘지 버튼";
  }

}

class IPhone implements SmartPhone {

  @Override
  public String screen() {
    return "아이폰 스크린";
  }

  @Override
  public String button() {
    return "아이폰 버튼";
  }

  public String sound() {
    return "아이폰 사운드";
  }

}
public class Ex70_SmartPhoneMain {

  public static void main(String[] args) {

      /* 오버라이딩의 핵심 - 같은 이름, 다른 동작 */

      SmartPhone smPhone_1 = new Samsung();
      SmartPhone smPhone_2 = new LG();
      SmartPhone smPhone_3 = new IPhone();

      // 부모의 타입으로 자식의 오버라이딩한 메소드를 호출할 수 있다.
      // 부모의 타입에 있는 메소드중 오버라이딩한 메소드만 호출할 수 있다.
      System.out.println(smPhone_1.screen());
      System.out.println(smPhone_2.screen());
      System.out.println(smPhone_3.screen());


      // 부모의 타입에 없는 메소드이기 때문에 에러~!
      // System.out.println(iphone_1.sound());

      Samsung sm = new Samsung();
      LG lg = new LG();
      IPhone iphone = new IPhone();

      System.out.println("--------------");

      // 삼성 메소드 실행
      System.out.println(sm.screen());
      System.out.println(sm.button());

      System.out.println("--------------");

      // LG 메소드 실행
      System.out.println(lg.screen());
      System.out.println(lg.button());

      System.out.println("--------------");

      // 아이폰 메소드 실행
      System.out.println(iphone.screen());
      System.out.println(iphone.button());
      System.out.println(iphone.sound());  
      }

}
