package c70_polymorphism;

//유연한 프로그램을 설계하기 위해 인터페이스를 이용해서 나중에 다른 클래스로 쉽게 변경할 수 있도록 하는것이 좋다.  
//인터페이스를 이용하면 실제 객체를 모르고 타입만을 이용해서 코드를 작성하는 일이 가능해 진다.
//인터페이스의 구체화
interface Computer {
  String monitor();
  String keyboard();
  String mouse();
  String maincom();    
}

abstract class Com implements Computer {
  @Override
  public String monitor() {
     return "1. 모니터 작동";
  }

  @Override
  public String keyboard() {
     return "2. 키보드 작동";
  }

  @Override
  public String mouse() {
     return "3. 마우스 작동";
  }
}

class LGCom extends Com {
  @Override
  public String maincom() {
     return "4. 본체 작동";
  }
}
public class Ex40_ComputerMain {

  public static void main(String[] args) {
      
      LGCom xnote = new LGCom();
      
      System.out.println(xnote.monitor());
      System.out.println(xnote.keyboard());
      System.out.println(xnote.mouse());
      System.out.println(xnote.maincom());
  }
}
