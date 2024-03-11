package c30_condition;

//if문과 비교연산자
public class Ex30_If_Simple {
  
  public static void main(String[] args) {
    boolean is_korean = true;
    
    if (is_korean == true) {
        System.out.println("한국사람입니다.");
    }
    
    if (is_korean == false) {
        System.out.println("한국사람이 아닙니다.");
    }
    
    if (is_korean) {    // 값 자체가 참이므로 성립된다.
        System.out.println("한국사람입니다.");
    }
    
    if (!is_korean) {   // "!"는 값을 부정한다. 참을 부정하므로 거짓이다.
        System.out.println("한국사람이 아닙니다.");
    }
    
    boolean is_japanese = false;
    
    if (is_japanese != true) {
        System.out.println("일본사람이 아닙니다.");
    }
    
    if (is_japanese != false) {
        System.out.println("일본사람 입니다.");
    }
    
    if (is_japanese) {  // 값 자체가 거짓이므로 성립되지 않는다.
        System.out.println("일본사람이 아닙니다.");
    }
    
    if (!is_japanese) { // 거짓을 부정하였으므로 참이다.
        System.out.println("일본사람 입니다.");
    }
  }
}
