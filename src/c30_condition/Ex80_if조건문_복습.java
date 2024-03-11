package c30_condition;

public class Ex80_if조건문_복습 {
  public static void main(String[] args) {
    
    String msg = "";//빈문자열
    int myage = 29;
    
    //1. 단순 if문
    if(myage==19) {
      msg = "당신은 곧 군대에 갑니다~!";
    }
    
    if(myage != 19) {
      msg = "당신은 몇살인가요?";
    }
    
    
    if(myage>19) 
      msg="당신은 성인이군요~!";

    if(myage < 19) msg = "당신은 학생이군요~!";
    
    
    System.out.println(msg);
    
    
    
    //---------------------------
    
    int point = 75;
    String grade = "";
    
    //2. 두개의 조건을 가진 if문
      //&&(and) -> 두 조건이 모두 참이어야 true
      if(point>70 && point<=80) {
        grade = "C학점";
      }
    
    
      //||(or) -> 두 조건중 하나라도 참이면 true
      if(point<=70 || point>80) {
        grade = "당신은 천재아니면 바보";
      }
      
      
    //3. if~else 구문 (삼항연산자와 호환)
    int a=100;
    int b=200;
    
    if(a<b) {
      grade = "오늘은 금요일";
    }else {
      grade = "내일도 수업합니다.";
    }
    
    
    
    //4. 다중if문 (Switch문과 호환)
    if(point>=90 && point<=100) {
      grade = "A학점";
    }else if(point>=80 && point<90) {
      grade = "B학점";
    }else if(point>=70 && point<80) {
      grade = "C학점";
    }else {
      grade = "낙제점";
    }
    
    
    //5. 중첩된 if문
    if(point>=70 && point<80) {
      
      if(point>77) {
        grade = "C+ 학점";
      }else if(point<74) {
        grade = "C- 학점";
      }else {
        grade = "C0 학점";
      }
      
    }
      
      
      
    System.out.println(grade);

  }
}
