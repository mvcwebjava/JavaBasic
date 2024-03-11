package c140_thread;

public class Thread10_Main {

  public static void main(String[] args) {
    
    //3. 멀티스레드객체생성
    Thread_10 th1 = new Thread_10("-");
    Thread_10 th2 = new Thread_10("*");
    
    //4. 멀티스레드실행 -  실행가능상태(은행에서 대기표 뽑고 예약후 기다림)에서 실행상태로 변환(CPU가 run() 수행) -> run() 종료상태
    //run()을 직접 호출하면 멀티스레드가 안됨. start()를 통해서 run() 실행해야 멀티스레드가 된다
    th1.start();//start()는 run()을 호출해 주는 역할
    th2.start();//만약 이전에 실행중인 다른 스레드의 run()이 있다면, 바로 run()을 실행하지 않고 차례를 기다리다 종료되면 그때 실행하게 된다.
    
  }
}
