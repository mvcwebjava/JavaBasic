package c100_inner_class;

//inner 클래스는 우리가 직접 만들기 보다는
//구글링 하다가 비슷한 코드를 봤을때 이해할 수 있는 수준이면 된다.

/*
  InnerClass란 하나의 클래스가 다른 클래스에 포함되는 개념
  
  House, Room, InnerTest_10 세개의 클래스가 있는데 
  House클래스 안에서 멤버내부클래스 Room를 선언하면
  InnerTest_10 클래스에서 Room을 직접적으로 사용할 수 없음을 보여주는 예제
*/
class House {
  
  //House 클래스의 내부 클래스 Room
  //마치 House 클래스의 멤버변수처럼 사용
  class Room {//이름 있는 내부클래스 형태
    public void study() {
      System.out.println("멤버내부클래스 Room의 study 메소드 호출");
    }
  }
  
  public void clean() {
    
    //메소드내부 지역내부클래스
    //Desk 클래스는 House 클래스의 메소드에 포함되었기 때문에 지역변수처럼 메소드 안에서만 사용가능
    class Desk {//이름 있는 내부클래스 형태
      public void sort() {
        System.out.println("지역내부클래스 Desk의 sort() 메소드 호출");
      }
    }
    
    Desk desk = new Desk();
    desk.sort();
  }//end of clean()
}

public class InnerTest_10 {
  
   
  public static void main(String[] args) {
    
    //Room room = new Room(); House를 거치지 않고 바로 생성 불가
    
    
    House house = new House();    
    House.Room houseroom = house.new Room();//House클래스의 멤버처럼 사용
    
    //House.Room houseroom = new House().new Room();//위의 두줄을 하나로 합침 
    
    houseroom.study();
    
    //메소드내부에 선언된 지역내부클래스 Desk에 직접 접근해 sort()를 호출할 수 없다.
    //할 수 있는건 clean() 메소드를 호출하는것 뿐이다.
    //따라서 clean() 안에서 Desk 클래스의 객체를 만들어 sort()를 호출해야 한다.
    house.clean();
  }
}














