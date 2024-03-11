package c90_basic_api;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex40_Calendar {

	public static void main(String[] args) {
		/* 
		 * 날짜에서 세부정보를 제공하는 Calendar 클래스
		 * 
		 * Calendar 클래스의 추상메소드를 모두 구현한 GregorianCalendar 클래스 사용 권장
		 * GregorianCalendar 클래스는 다른시간대의 날짜와 시간을 출력할 수 있다.
		 * 
		 * 위 두가지 클래스를 한 세트로 하여 사용(권장)
		 * 
		 * 1. get(cal.상수) 메소드를 사용하면 결과가 int 타입으로 리턴
		 * 
		 * 2. 日의 경우 여러가지로 분류된다.
		 * 		DAY_OF_MONTH
		 * 		DAY_OF_YEAR 등
		 * 
		 * 3. 요일은 DAY_OF_WEEK
		 *    (일~토:1~7)
		 * 		
		 */
		
		Calendar cal = new GregorianCalendar();//현재시간 정보를 가진 객체 생성
		
		//만약 날짜와 시간을 특정 시간으로 설정하고 싶다면 아래와 같이 설정 
		//예시) 2002 4 5 10 30 25
		//cal.set(2002,3,5,10,30,25);//월은 0~11이기 때문에 1작은 수를 입력해야 함 
		
		System.out.printf("1. %s\n",cal);//출력결과를 확인하면 Gregoriancalendar 객체가 리턴됨을 알수있음
		
		//년월일 - .get(상수) 메소드를 사용하면 결과가 int 타입으로 리턴
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);//0~11
		int date = cal.get(Calendar.DAY_OF_MONTH);//월마다 일수가 다르기 때문
		
		System.out.printf("2. %d년 %d월 %d일\n", year, (month+1), date);
		
		//시분초
		int hour = cal.get(Calendar.HOUR_OF_DAY);//24시간제  HOUR는 12시간제
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("3. %d시 %d분 %d초\n", hour, minute, second);
		
		//요일 - switch 또는 배열을 이용한 추가 작업 필요
    String[] dayName = {"", "일", "월", "화", "수", "목", "금", "토"};
		int day = cal.get(Calendar.DAY_OF_WEEK);//(일~토:1~7)
		System.out.printf("4. 오늘은 %d\n", day);
		System.out.printf("4. 오늘은 %s요일\n", dayName[day]);
		
		//국가별 월,요일 정보 - .getDisplayName(보여줄항목, 리턴되는 문자열의 길이타입, 지역정보)
		// LONG, SHORT 선택에 따라 -> 1 또는 1월, 월 or 월요일 중 하나가 출력됨
		String koreaMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.KOREA);//3월
		
		String koreaDay_long = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.KOREA);//목요일
		String koreaDay_short = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.KOREA);//목
		
		System.out.printf("5. 한국:%s, %s, %s\n", koreaMonth, koreaDay_long, koreaDay_short);
		
		
		String usMonth_long = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);//March
		String usMonth_short = cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);//Mar
		
		String usDay_long = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);//Thursday
		String usDay_short = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US);//Thu
		
		System.out.printf("6. 미국:%s, %s, %s, %s\n", usMonth_long, usMonth_short, usDay_long, usDay_short);
		

	}

}
