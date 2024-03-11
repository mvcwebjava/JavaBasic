package c140_thread;

//1. 멀티스레드클래스정의
public class RunnableThread_20 implements Runnable {

  String shape;
  
  public RunnableThread_20(String shape) {
    this.shape = shape;
  }
  
  // 2. run() { 오버라이딩 }
  @Override
  public void run() {
    for(int i=0;i<100;i++) {
      System.out.print(shape);
    }
  }

  
}
