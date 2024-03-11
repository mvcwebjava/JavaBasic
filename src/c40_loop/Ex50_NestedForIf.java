package c40_loop;

//for문 안에 있는 for문과 if문
public class Ex50_NestedForIf {
  
  public static void main(String[] args) {
    
    for (int i = 2; i <= 9; i++) {
        
        for (int j = 1; j < 10; j++) {
            int k = i * j;
            System.out.println("k = " + k);
        }
        
        if (i < 9) {
            System.out.println("------------");
        }
        
    }
  }
}
