package c140_thread;

/*
실행결과(항상 main이 먼저 실행되고 joinTh는 나중에 실행됨->왜냐하면 main 내에서 실행할 명령문의 양이 너무 적기 때문. for문을 돌리면 스레드가 왔다갔다 하는걸 확인할 수 있음)

main 메소드 내부 = 1
main 메소드 종료
run 메소드 내부 = 10
*/
class JoinThread20 extends Thread {
  
  int i=1;
  
  @Override
  public void run() {
    i = 10;
    System.out.println("run 메소드 내부 = "+i);
  }
}//end of JoinThread



public class SchedulingMainThread_40 {
  
  public static void main(String[] args) {//1. 출력결과로 미루어 보아 JDK에 의해 main()이 자동으로 쓰레드 취급됨을 알수 있다.
    
    JoinThread joinTh = new JoinThread(); //2. joinTh 생성단계, main 실행상태
    joinTh.start();//3. joinTh 실행가능상태, main 실행상태
    
    /*
    for(int i=0;i<10000;i++) {
      System.out.print("*");
    }
    */
    System.out.println("main 메소드 내부 = "+joinTh.i);//4. joinTh 실행가능상태, main 실행상태
    System.out.println("main 메소드 종료");//5. joinTh 실행가능상태, main 실행상태
    
    //6. joinTh 실행상태, main 종료상태
  }

}
