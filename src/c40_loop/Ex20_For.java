package c40_loop;

public class Ex20_For {
  public static void main(String[] args) {

    //구구단 7단 값 출력
    
    int sum = 0;

    // 풀이1
    for (int i = 1; i <= 9; i++) {
      sum = sum + 7;
      System.out.println(sum);
    }
    
    System.out.println("-----------------");

    // 풀이2
    int result = 0;

    for (int i = 1; i <= 9; i++) {
      result = 7 * i;
      System.out.println(result);
    }

  }
}
