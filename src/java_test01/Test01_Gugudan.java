package java_test01;

import java.util.Scanner;

public class Test01_Gugudan {
  public static void main(String[] args) {
    // 1. 단을 입력합니다. 
    Scanner s = new Scanner(System.in);
    System.out.println("구구단 몇 단? ");
    int dan = s.nextInt();

    // 2. 구구단은 2단에서 9단까지만 가능합니다. 
    if () { //15점
        System.out.println("구구단은 2단~ 9단까지만 선택할 수 있습니다. 프로그램을 종료합니다.");
        s.close();
        return;
    }

    // 3. 구구단을 출력합니다.
    for () { //15점
        System.out.println(dan + " * " + i + " = " + (dan * i));
    }

    // 4. 스캐너를 닫습니다. 
    s.close();
  }
}
