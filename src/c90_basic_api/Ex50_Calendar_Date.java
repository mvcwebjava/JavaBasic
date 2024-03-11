package c90_basic_api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex50_Calendar_Date {

	public static void main(String[] args) {
		/*
		 * 기본형변수끼리 형변환 할때는 형변환연산자를 사용
		 * 상속관계에 있는 객체들끼리 형반환 할때는 형변환연산자를 사용
		 * 
		 * 그런데 Date와 Calendar 클래스는 상속관계가 아니기 때문에 
		 * 형변환 연산자를 사용할 수 없다.		 
		 * 
		 * Calendar 의 
		 * 		.getTime() -> Date 날짜객체 리턴
		 * 		.setTime(Date객체) -> 특정시점의 Calender 날짜정보로 설정
		 * 상호 변환할 수 있다.
		 * 
		 */
		
	  //1. Calender를 이용한 Date 날짜객체 생성
		Calendar cal = new GregorianCalendar();
		
		Date date = cal.getTime();		
		System.out.println("date 변환된 타입은 " + date.getClass().getName());//Java.Util.Date
		
		
		// 2. Date 객체를 이용해서 특정시점의 Calender 날짜정보 설정
    Date oneDay = new Date(1324565551235L);// Thu Dec 22 23:52:31 KST 2011
    System.out.println("oneDay = " + oneDay);
		
    Calendar oneDayCal = new GregorianCalendar();
    oneDayCal.setTime(oneDay);

    System.out.println("oneDayCal = " + oneDayCal.get(oneDayCal.YEAR));//2011
		System.out.println("oneDayCal의 타입은 " + oneDayCal.getClass().getName());//java.util.GregorianCalendar
		
	}

};