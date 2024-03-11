package c140_thread;


//40번 예제를 복붙하여 수정함
class JoinThread extends Thread {
  
  int i=1;
  
  @Override
  public void run() {
    i = 10;
    System.out.println("run 메소드 내부 = "+i);
  }
}//end of JoinThread



public class SchedulingJoinThread_50 {
  
  public static void main(String[] args) {//1. 출력결과로 미루어 보아 JDK에 의해 main()이 자동으로 쓰레드 취급됨을 알수 있다.
    
    JoinThread joinTh = new JoinThread(); //2. joinTh 생성단계, main 실행상태
    joinTh.start();//3. joinTh 실행가능상태, main 실행상태
    
    //main이 joinTh의 결과가 필요한 상태라고 가정함
    try {
      joinTh.join();//joinTh에게 실행의 권한을 양보하는 .join()
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    
    System.out.println("main 메소드 내부 = "+joinTh.i);//4. joinTh 실행가능상태, main 실행상태
    System.out.println("main 메소드 종료");//5. joinTh 실행가능상태, main 실행상태
    
    //6. joinTh 실행상태, main 종료상태
  }

}
