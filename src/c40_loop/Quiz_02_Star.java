package c40_loop;

public class Quiz_02_Star {

  public static void main(String[] args) {
    
    //연습문제 - 증가별 출력
    /**
     *-------------------------------------------------
     * 이중 반복문을 사용하여 다음의 결과를 출력해 보시오.
     * 
     * - 다음의 메서드를 사용하세요.
     *      System.out.print(내용) --> 출력후 줄바꿈 하지 않음
     *      System.out.println() --> 출력하는 내용 없이 줄바꿈만 수행함
     * 
     * 
     * [출력결과 예시] --> 별(*)이 라인마다 하나씩 증가하면서 총 10줄이 출력됩니다.
     *--------------------------------------------------
     *  *
     *  **
     *  ***
     *  ****
     *  *****
     *  ******
     *  *******
     *  ********
     *  *********
     *  **********
     */
    
    
     System.out.println("증가별 출력");
     
     System.out.println("*");
     System.out.println("**");
     System.out.println("***");
     System.out.println("****");
     System.out.println("*****");
     
     /*
      * 1회전 : 별1개
      * 2회전 : 별2개
      * .
      * 10회전 : 별10개 
      */
     
     System.out.println();
     System.out.println();
     
     //유형1
     for(int i=0;i<10;i++) {//회전수
       
       for(int s=0; s<1+i; s++) {//별찍기
         System.out.print("*");
       }
       
       System.out.println();
     }
     

     System.out.println();
     System.out.println();
     
     
     //연습문제 - 감소별 출력
     /**
      *-------------------------------------------------
      * [출력결과 예시] --> 별(*)이 라인마다 하나씩 증가하면서 총 10줄이 출력됩니다.
      *--------------------------------------------------
      *  **********
      *  *********
      *  ********
      *  *******
      *  ******
      *  *****
      *  ****
      *  ***
      *  **
      *  *
      */
     
     //유형2
     for(int i=0;i<10;i++) {//회전수
       
       //별찍기
       for(int s=0;s<10-i;s++) {
         System.out.print("*");
       }
       
       System.out.println();
     }
     
     
  }//main
  

}
