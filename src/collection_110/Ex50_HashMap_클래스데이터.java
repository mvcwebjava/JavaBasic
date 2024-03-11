package collection_110;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex50_HashMap_클래스데이터 {

  public static void main(String[] args) {

    Calendar cal = Calendar.getInstance();
    Date now = cal.getTime();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String joinday = sdf.format(now);
    
    //컬렉션과 맵류는 객체만을 저장의 대상으로 한다.
    //동기화를 보장하지 않음 <=> HashTable
    Map<String, Member> memMap = new HashMap<String, Member>();

    Member hong = new Member("홍길동", "hong@naver.com", "1234", joinday);
    Member lee = new Member("이순신", "lee@daum.net", "3456", joinday);
    Member chang = new Member("안창호", "chang@cj.com", "6789", joinday);
    Member mong = new Member("고주몽", "mong@nate.com", "2580", joinday);

    memMap.put("keyHong", hong);
    memMap.put("keyLee", lee);
    memMap.put("keyChang", chang);
    memMap.put("keyMong", mong);

    Iterator<String> iter = memMap.keySet().iterator();

    while (iter.hasNext()) {
      String key = iter.next();
      Member member = memMap.get(key);

      System.out.println(member.toString());
      System.out.println("--------------------------------");
    }

  }

}
