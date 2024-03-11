package c40_loop;

public class Quiz_04_Star {

  public static void main(String[] args) {
    
    //피라미드 별
    for(int i=1;i<=5;i++) {
      
      //공백 : 4, 3, 2, 1, 0
      for(int b=0;b<5-i;b++) {
        System.out.print("_");
      }
      
      //별 : 1, 3, 5, 7, 9
      for(int s=0;s<2*i-1;s++) {
        System.out.print("*");
      }
      
      
      System.out.println();
    }
    
    
    System.out.println();
    
    
    //역피라미드 별
    for(int i=0;i<5;i++) {
      
      //공백찍기 : 0, 1,2,3,4
      for(int b=0;b<i;b++) {
        System.out.print("_");
      }
      
      
      //별찍기 : 9, 7, 5, 3, 1
      for(int s=9;s>=2*i+1;s--) {
        System.out.print("*");
      }
      
      System.out.println();
    }
    
    
  }
}

















