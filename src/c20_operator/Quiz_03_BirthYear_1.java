package c20_operator;

import java.util.Scanner;

//연습문제 - 출생연도 계산

/**
 *-------------------------------------------------
 * 1) int형 변수 age를 선언하고 자신의 나이를 대입합니다.
 * 2) year 변수를 선언하고, age 변수를 사용하여 자신이 태어난 년도를 계산하여 대입하세요.
 *    
 * [출력결과 예시]
 *--------------------------------------------------
 * 1990년도에 태어났습니다.
 */

public class Quiz_03_BirthYear_1 {
  public static void main(String[] args) {
    int age = 21;
    int year = (2023 - age);
    System.out.println(year+"년도에 태어났습니다.");
  }
}

/*
  또 다른 풀이
  

    //나이
    System.out.println("현재 나이를 입력하세요");    
    Scanner sc = new Scanner(System.in);
    int myage = sc.nextInt();

    //출생년도
    int birthyear = thisYear - myage;
    
    System.out.printf("\n당신은 %d년도에 태어났습니다.", birthyear);
      
*/