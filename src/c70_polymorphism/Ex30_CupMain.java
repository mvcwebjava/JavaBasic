package c70_polymorphism;

//추상메소드를 포함하지 않은 추상클래스
abstract class Cup {
  public String showColor(){
     return "컵 색상은 파란색 입니다.";
  }
}

class PaperCup extends Cup {
  
}

public class Ex30_CupMain {
  public static void main(String[] args) {
      
      PaperCup pCup = new PaperCup();
      
      System.out.println(pCup.showColor());

  }

}
