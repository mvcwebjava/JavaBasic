package c40_loop;

public class Ex130_DoWhile {
  public static void main(String[] args) {
    
    int i = 1;
    int j = 0;

    do {
        j = 7 * i;
        System.out.println("j = "+j);
        i++;
    } while (i <= 9);
  }
}
