package c40_loop;

//while문과 do~while문의 차이
public class Ex110_While_DoWhile {
  
  public static void main(String[] args) {
    
    int max = 100;
    
    while (max > 100) {
        System.out.println("while문");
    }
    
    do {
        System.out.println("do~while문");
    } while (max > 100);
  }
}
