package c90_basic_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex60_SimpleDateFormat {

	public static void main(String[] args) {

		/*
		 * 날짜와 시간을 원하는 형식의 문자열로 변환 
		 * 
		 * SimpleDateFormat sdf = new SimpleDateformat("포맷형식지정");		 * 
		 * 
		 * 	1. 포맷형식 : 	"yyyy-MM-dd HH:mm:ss E"
		 * 
		 * 		yyyy 	- 4자리 연도 
		 * 		MM 		- 2자리 월 
		 * 		dd		- 2자리 일 (이달중에 몇번째 날인지)
		 * 		DDD		- 3자리 일 (1년중 몇번째 날인지)	
		 * 
		 *  	HH		- 24시간
		 *  	mm		- 2자리 분
		 *  	ss		- 2자리 초
		 *  
		 *  	E		- 요일 
		 *  
		 * 2. 변환 메소드
		 * 		
		 * 		sdf.format(Date 객체);
		 */
		
		Calendar cal = new GregorianCalendar();//여기까지는 현재시간 
		
		//날짜와 시간을 다음과 같이 설정
		//2002 4 5 10 30 25
		cal.set(2002,3,5,10,30,25);//월은 0~11이기 때문에 1작은 수를 입력해야 함 
		
		Date date = cal.getTime();//Date 객체로 변환
		
		//예시1)
		if(true) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:dd");
			String now = sdf.format(date);		
			System.out.printf("지금은 입니다.\n", now);			
		}
		
		//예시2
		if(true) {
			SimpleDateFormat sdf = new SimpleDateFormat("지금은 yyyy년 MM월 dd일 E요일 HH시 mm분 ss초 입니다.");
			
			//.format() 메소드에 Date 객체를 넣어주어야 한다.  
			String now = sdf.format(date);		
			System.out.println(now);			
		}
	}

}