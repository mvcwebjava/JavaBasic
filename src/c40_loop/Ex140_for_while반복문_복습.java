package c40_loop;

public class Ex140_for_while반복문_복습 {

  public static void main(String[] args) {
    {
      //for(바가지역할의 변수선언 및 초기화;조건식;증감식){실행할 코드}
      int sum = 0;
      
      for(int n=1;n<=100;n++) {
        //실행할 코드
        sum += n;
      }
      
      System.out.println("sum = "+sum);
      
    }
    
      
    {  
      //while(조건식){ 실행시키고 싶은 코드 }
      
      int sum = 0;
      int i = 0;
      
      while(i<100) {
        i=i+1;
        sum = sum + i;
      }
      
      System.out.printf("sum = %d", sum);
      
    }

  }  
}
