package collection_110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

//데이터의 중복을 허용하며 동기화를 보장하지 않음 <=> Vector
//List 인터페이스로부터 상속받은 메소드 : add(), remove(), set(), get, clear(), size(), indexOf(), lastIndexOf(), contains(), isEmpty()
public class Ex10_ArrayList_기본데이터_add_get_remove_size {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("둘리","또치","도우너","마이콜");
	  
		ArrayList<String> arrList = new ArrayList<String>();

    // 컬렉션은 객체만을 저장의 대상으로 한다.
    // 기본타입 값을 입력할 경우 AutoBoxing 처리된다.
    // arrList.add(100);// new Integer(100) - 오토박싱
    // arrList.add(true);// new Boolean(true) - 오토박싱    
    
		arrList.add("홍길동");
		arrList.add("이순신");
		arrList.add("안창호");
		arrList.add("주몽");
		arrList.add("세종대왕");
		arrList.add("hani");
		
		arrList.set(0, "hani");//수정
		
		//인덱스 값 알아보기		
		System.out.println("이순신의 인덱스는 "+arrList.indexOf("이순신"));//1
		System.out.println("홍길동의 인덱스는 "+arrList.indexOf("홍길동"));//-1
		System.out.println("마지막 hani의 인덱스는 "+arrList.lastIndexOf("hani"));//5
		
		
		//특정 데이터값의 포함여부
		if(arrList.contains("주몽")) {
		  System.out.println("arrList의 원소중 \"주몽\"이 있습니다.");
		}
		
		//arrList.clear();//초기화
		
		// 비어있는지 확인
		if(arrList.isEmpty()) {
		  System.out.println("arrList는 비어 있습니다.");
		}
		
		//맨 아래에 Stream을 이용한 출력 예제 참조

		// ArrList의 내용보기
		System.out.println("arrList = " + arrList);

		System.out.println("------------------------------------------------");

		// 요소별로 아이템 가져오기
		System.out.println("arrList(0) = " + arrList.get(0));
		System.out.println("arrList(1) = " + arrList.get(1));
		System.out.println("arrList(2) = " + arrList.get(2));
		System.out.println("arrList(3) = " + arrList.get(3));

		System.out.println("------------------------------");

		// 인덱스 1에 해당하는 요소 삭제
		arrList.remove(1);

		//길이가 고정이 아니므로 length를 사용하지 않고 size()를 사용
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));			
		}
		
		
		//컬렉션에 저장되어 있는 요소들을 읽어오는 표준화된 방법중 하나
		Iterator<String> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		System.out.println("-------------------------------------------------");

    // arrList 객체의 데이터를 꺼내서 배열로 만드는 작업
    // 1. 같은 크기(길이)의 배열생성
    // 2. toArray() 메소드를 이용하여 생성한 배열에 데이터 삽입
		String[] array = new String[arrList.size()];
		arrList.toArray(array);

		System.out.println("배열로 변환후 전통적인 for문을 이용하여 출력");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		//ArrayList 객체에 스트림 생성하고 사용하기
		
    System.out.println("-------------------------------------------------");
    System.out.println("arrList를 stream으로 출력");
    Stream<String> arrStream = arrList.stream();
    arrStream.forEach(name->System.out.println(name));
    
    System.out.println("-------------------------------------------------");
    System.out.println("array를 중간연산 정렬하여 stream으로 출력");
    Stream<String> stringStream = Arrays.stream(array);
    stringStream.sorted().forEach(str->System.out.println(str));
       
    System.out.println("-------------------------------------------------");
    System.out.println("array 요소의 이름글자수를 stream으로 출력");
    Stream<String> nameStream = Arrays.stream(array);
    
    // 방법2 - 중간처리 메소드 map()을 이용
    // map()은 모든 아이템에 공통적인 작업을 하여 그 결과를 새로운 스트림으로 리턴
    nameStream.map((name) -> {
      return name.length();
    }).forEach((cnt) -> {
      System.out.println(cnt + "글자");
    });

    // 방법1
    // nameStream.forEach(name->{
    // System.out.printf("%s는 %d글자\n", name, name.length());
    // });
    
    System.out.println("----------이름 글자수가 3 이상이면 출력----------");
    // 문제) 이름 글자수가 3 이상이면 출력

    // 한번 사용한 스트림은 재사용 할 수 없다는 규칙
    Stream<String> letterStream = Arrays.stream(array);

    // 방법2
    // filter()는 모든 아이템에 공통조건을 적용하여 true인 아이템만을 모아 새로운 스트림으로 리턴
    letterStream.filter(letter -> {
      return letter.length() >= 3;
    }).forEach(name -> System.out.println(name));

    // 방법1
//    letterStream.forEach(name -> {
//      if (name.length() >= 3) {
//        System.out.println(name);
//      }
//    });
    
	}

}



















