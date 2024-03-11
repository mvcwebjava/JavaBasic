package c50_class;

//클래스 = 속성(상태) + 기능(동작)
class Car{
  
  //멤버변수, 속성, Property
  int number, speed; // 값을 지정하지 않을 경우 0으로 초기화
  String color;//null 값으로 초기화

//멤버함수, 멤버메소드, 메소드, 함수
  public void speedUp() {
    System.out.println("속도를 100만큼 올립니다~!!");
    speed += 100;
  }

  public void speedDown() {
    System.out.println("속도를 50만큼 내립니다~!!");
    speed -= 50;
  }
}

public class Ex110_CarMain {
  public static void main(String[] args) {

    // 아래 두개의 객체변수는 서로 독립적으로 동작
    Car myCar = new Car(); // 클래스를 객체화 할 때는
    Car yourCar = new Car(); // 클래스명 참조변수 = new 클래스명()

    myCar.number = 3724;
    myCar.color = "black";
    myCar.speed = 10;
    
    System.out.println("1. 차번 = " + myCar.number);
    System.out.println("2. 색상 = " + myCar.color);
    System.out.println("3. 현재속도 = " + myCar.speed);

    myCar.speedUp(); //함수호출
    System.out.println("4. 현재속도 = " + myCar.speed);
    
    System.out.println("-----------------------------------------");
    
    //두개의 객체변수가 독립적으로 동작
    yourCar.number = 9399;
    yourCar.speed = 50;
    yourCar.color = "red";

    System.out.println("1. 차번 = " + yourCar.number);
    System.out.println("2. 색상 = " + yourCar.color);
    System.out.println("3. 현재속도 = " + yourCar.speed);

    yourCar.speedUp(); //함수호출
    System.out.println("4. 현재속도 = " + yourCar.speed);

    yourCar.speedDown(); //함수호출
    System.out.println("5. 현재속도 = " + yourCar.speed);

    // 함수안에서 선언한 지역변수
    int number2;
    //System.out.println("number2 = "+number2);
           
    // ★함수안의 지역변수는 선언만하고 초기화하지 않은 상태에서 사용할경우 에러발생
    // 지역변수는 꼭 초기화를 직접 해야 한다.

  }
}
