package c50_class;

class Human {

  // 기본 생성자함수 명시적으로 작성해보기
  public Human() {
  }
  
  public int age;         // public 멤버변수 선언
  public float height;    
  private float weight;   // private 멤버변수 선언
}

public class Ex160_HumanMain {
  public static void main(String[] args) {
    
    Human her = new Human();
    her.age = 25;
    her.height = 180.0F;
    
    //private 변수에 직접 접근시 에러발생
    //her.weight = 70.0F;  
    
    System.out.println("1. 그녀의 나이는 "+her.age);
    System.out.println("2. 그녀의 키는 "+her.height);
    //System.out.println("3. 그녀의 몸무게는 "+her.weight);
  }
}
