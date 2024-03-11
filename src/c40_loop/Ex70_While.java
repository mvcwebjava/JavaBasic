package c40_loop;

//while문 : 7의 배수 출력 
public class Ex70_While {
  
  public static void main(String[] args) {
    
    int i = 1;
    int j = 0;
    
    while (i < 10) {
        j = 7 * i;
        System.out.println("j = "+j);
        i++;
    }
  }
}
