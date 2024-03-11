package c140_thread;

//sleep()은 출력속도 조정, 실행속도를 조정하는 하는 개념으로 사용
class RunThread1 implements Runnable {
  // 1. run() { 오버라이딩 }   
  @Override
  public void run() {
    for(int i=0;i<10;i++) {
      System.out.print("-");
      try {
        Thread.sleep(1000);//지정된 시간동안 쓰레드를 멈추고 예약대기 상태부터 다시 시작한다. 
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}//end of RunThread1

class RunThread2 implements Runnable {
  // 1. run() { 오버라이딩 }
  @Override
  public void run() {
    for(int i=0;i<10;i++) {
      System.out.print("|");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}//end of RunThread1=2

public class SchedulingSleep_30 {
  
  public static void main(String[] args) {
    
    RunThread1 rTh1 = new RunThread1();
    RunThread2 rTh2 = new RunThread2();
    
    Thread th1 = new Thread(rTh1);
    Thread th2 = new Thread(rTh2);
    
    th1.start();
    th2.start();
  }

}
