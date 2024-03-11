package collection_110;

import java.util.HashMap;
import java.util.Iterator;

public class Ex60_HashMap_클래스데이터 {

  public static void main(String[] args) {

    //컬렉션과 맵류는 객체만을 저장의 대상으로 한다.
    //동기화를 보장하지 않음 <=> HashTable
    HashMap<String, Student> memMap = new HashMap<String, Student>();

    Student hong = new Student(1, "홍길동", "010-1237-2536");
    Student lee = new Student(2, "이순신", "010-2345-4557");
    Student chang = new Student(3, "안창호", "010-3324-2654");
    Student mong = new Student(4, "고주몽", "010-3248-4587");

    memMap.put(hong.getName(), hong);
    memMap.put(lee.getName(), lee);
    memMap.put(chang.getName(), chang);
    memMap.put(mong.getName(), mong);

    System.out.println("memMap 저장소에 담긴 요소의 개수 = " + memMap.size());
    System.out.println("---------------------------------------------");

    // memMap 컬렉션에 있는 모든 데이터 출력
    Iterator<String> iter = memMap.keySet().iterator();
    while (iter.hasNext()) {
      String key = iter.next();
      Student student = memMap.get(key);
      student.printInfo();
    }
  }

}
