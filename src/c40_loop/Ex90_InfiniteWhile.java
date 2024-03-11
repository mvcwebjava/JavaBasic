package c40_loop;

//무한루프 while문
public class Ex90_InfiniteWhile {
  public static void main(String[] args) {
    
    int sum = 0;
    
    while(true) {
        System.out.println("++sum = "+ ++sum);
    } //무한반복
  }
}
