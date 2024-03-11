 package c90_basic_api;

import java.util.Date;

public class Ex30_Date {

	public static void main(String[] args) {
		
		/*
      날짜를 처리하기 위한 Date 클래스

		   요즘은 GregorianCalendar를 이용하여 날짜정보를 처리한다.
		   그럼에도 Date 클래스가 필요한 이유는 아래와 같다. 
		   
		   	1) 과거 프로젝트의 유지보수 
		   	2) SimpleDateFormat 같은 클래스를 사용할때 날짜정보를 Date 객체로 전달
		  
		  1. System.currentTimeMills()는 Long타입의 밀리세컨즈값 추출
		  
		  2. 현재시점의 날짜정보를 갖는 객체 생성
		  		new Date() 
		     new Date(System.currentTimeMills())
		     
		  3. 특정시점의 날짜정보를 갖는 객체 생성 
		  		new Date(long 타입의 밀리세컨즈값)
		  		new Date().setTime(long 타입의 밀리세컨즈값)
		  
		  4. Date 객체에서 쓸만한 메소드
		  		.getTime() -> long 타입의 밀리세컨즈값으로 리턴
		      .setTime(long 타입의 밀리세컨즈값) -> 특정시점의 날짜정보로 설정
		      
		      결론 : Date 객체의 getTime(),setTime() 메소드는 밀리세컨즈값과 Date객체 설정을 왔다 갔다 하는 것 
		
		 */
		
		Date now = new Date();
		System.out.println("1."+now.getTime());//1705212008197 <- Long
		System.out.println("1."+System.currentTimeMillis());
		
		//1. 현재시점의 날짜정보를 갖는 객체 생성
		System.out.println("2."+new Date());//Sun Jan 14 11:21:44 KST 2024
		System.out.println("3."+new Date(System.currentTimeMillis()));//Sun Jan 14 11:21:44 KST 2024
		
		//2. 특정시점의 날짜정보를 갖는 객체 생성
		System.out.println("4."+new Date(1234567890123L));//Sat Feb 14 08:31:30 KST 2009
		
		now.setTime(0L);
		
		//한국은 GMT 시간상 +9시간 이기 때문에 00시가 아닌 아래와 같이 09시로 출력됨 
		System.out.println("5."+now);//Thu Jan 01 09:00:00 KST 1970
		


	}

}

