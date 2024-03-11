package java_test02_answer;

public class Test01_Sum {
  /*
    for 반복문을 이용하여 1부터 100까지 짝수의 합과 홀수의 합을 구하여 출력하시오.
        
    짝수의 합 = evenSum -> 2550 
    홀수의 합 = oddSum -> 2500
   */
  public static void main(String[] args) {

    int oddSum = 0;
    int evenSum = 0;

    // 짝수, 홀수의 합을 구합니다.
    for (int i = 1; i <= 100; i++) { //15점
      
      if (i % 2 == 1) {// 15점       
        oddSum += i;
      } else {
        evenSum += i;
      }
    }

    System.out.println("oddSum = " + oddSum);
    System.out.println("evenSum = " + evenSum);

  }
}
