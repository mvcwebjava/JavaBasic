package c20_operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

//연습문제 - 나이계산

/**
 *-------------------------------------------------
 * 1) int형 변수 year를 선언하고 자신이 태어난 년도를 대입합니다.
 * 2) age 변수를 선언하고, year 변수를 사용하여 자신의 나이를 계산하여 대입하세요.
 *    
 * [출력결과 예시]
 *--------------------------------------------------
 * 25세 입니다.
 */

public class Quiz_02_Age_1 {
  public static void main(String[] args) {
    int year = 2002;
    int age = (2023 - year);
    System.out.println(age+"세 입니다.");
  }
}

/*
  또 다른 풀이
  
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    //출생년도
    System.out.println("출생년도를 입력하세요");    
    int birthYear = Integer.parseInt(br.readLine());    
 
    //올해년도
    Calendar cal = Calendar.getInstance();
    int thisYear = cal.get(Calendar.YEAR);
    
    //나이
    int age = thisYear - birthYear;
    
    System.out.printf("\n당신의 나이는 %d세 입니다.", age);

*/