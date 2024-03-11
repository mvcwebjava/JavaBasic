package c20_operator;

//복합대입 연산자
public class Ex30_CompoundOP {

  public static void main(String[] args) {
    
    int buscard = 100;

    // 누적은 버카충이다.
    buscard = buscard + 10000;

    buscard += 10000;// 20100

    buscard = buscard - 5000;
    buscard -= 5000;// 15100

    buscard = buscard * 2;
    buscard *= 2;// 30200

    buscard = buscard / 100;
    buscard /= 100;// 302

    buscard = buscard % 2;
    buscard %= 2;// 0

    System.out.println("buscard = " + buscard);
  }  
}
