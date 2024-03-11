package c140_thread;

public class Runnable_20Main {

  public static void main(String[] args) {
    
    //3. Runnable 객체생성
    Runnable run1 = new RunnableThread_20("-");
    Runnable run2 = new RunnableThread_20("*");
    
    //4. 멀티스레드객체변환
    Thread thread1 = new Thread(run1);
    Thread thread2 = new Thread(run2);
    Thread_10 thread10 = new Thread_10("@");
    
/*
    5. 스레드의 우선순위에 영향을 미치는 요소 2가지 -> 스레드 스케줄링 기법(OS마다 다름) - 개발자가 관여할 부분이 아님
        1) setPriority(10), getPriority() - 스레드가 만들어질때 1~10 사이의 우선순위값이 자동으로 주워지는데(기본값5) 이 메소드를 통해 우선순위를 정할 수 있지만 사실상 무의미하다.
        2) time-slice 방식으로 일정시간 분배역할 - 문제는 OS마다 다르고 제어할 수 있는 메소드를 제공하지 않는다. 즉, 운영체제 마다 다르며 자동으로 이루어 진다. 
           이때 setPriority(10) 설정은 완전히 무시하는데 window7~10이 그렇다.     
*/
    
    //스레드 우선순위 출력
    thread1.setPriority(1);
    thread2.setPriority(10);
    thread10.setPriority(9);
    
    System.out.println("thread1의 우선순위 : "+thread1.getPriority());
    System.out.println("thread1의 우선순위 : "+thread2.getPriority());
    
    //5. 멀티스레드실행 -  run 정의 동시 실행
    thread1.start();//start()는 run()을 호출해 주는 역할
    thread2.start();
    thread10.start();
    
    
  }
}
