package c40_loop;

//while문 안에 있는 if문
public class Ex80_WhileIf {
  public static void main(String[] args) {
    
    int sum = 0;
    int i = 0;
    
    while (true) {
        i++;
        
        if (i % 2 == 0) {
            continue;
        }
        
        if (i > 100) {
            break;
        }
        
        sum += i;
        System.out.println("i = "+i);
    }

    System.out.println("sum = "+sum); //2500
  }
}
