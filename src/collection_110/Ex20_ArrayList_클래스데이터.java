package collection_110;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.stream.Stream;

//특정 클래스의 객체를 ArrayList의 원소로 등록하는 예제
public class Ex20_ArrayList_클래스데이터 {

	public static void main(String[] args) {

    Calendar cal = Calendar.getInstance();
    Date now = cal.getTime();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String joinday = sdf.format(now);
	
    // Member 타입의 값을 원소로 하는 ArrayList
		ArrayList<Member> memList = new ArrayList<Member>();

		memList.add(new Member("홍길동", "hong@daum.com", "1234", joinday));
		memList.add(new Member("이순신", "leess@naver.com", "5678", joinday));
		memList.add(new Member("안창호", "chang@nate.com", "3456", joinday));
		memList.add(new Member("고주몽", "mong@abc.com", "7890", joinday));
		
    // 목업데이터 입력
    for (int i = 1; i <= 10; i++) {
      memList.add(new Member("Name_" + i, "email_" + i + "@naver.com", "1234", joinday));
    }
		

    System.out.println("------------------------------------스트림으로 출력------------------------------------");
    Stream<Member> memStream = memList.stream();
    memStream.forEach(mem->{
      System.out.println(mem.toString());
    });
    
    

    System.out.println("\n----------------------------------어드밴스드 for문으로 출력-------------------------------------");
		for (Member member : memList) {
			System.out.println(member.toString());
		}

		System.out.println("\n---------------------------------Iterator를 활용하여 출력-------------------------------------");
		//컬렉션에 저장되어 있는 요소들을 읽어오는 표준화된 방법중 하나
		Iterator<Member> iter = memList.iterator();
		
		while (iter.hasNext()) {			
			Member member = iter.next();
			System.out.println(member.toString());
		}

	}

}
