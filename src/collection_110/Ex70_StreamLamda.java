package collection_110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
  스트림이란? 스트림처리 매커니즘
  
  1. 배열, 컬렉션을 대상으로 일관성 있는 자료의 처리 연산을 수행
  2. 스트림연산은 기존자료를 변경하지 않음(불변)
  
  [스트림처리 매커니즘]
  3. 스트림연산은 중간연산과 최종연산으로 구분
  4. 중간연산은 여러개의 연산이 적용될 수 있지만, 최종연산은 마지막에 한번만 적용됨  
  5. 최종연산이 호출되어야 중간연산에 대한 수행이 이루어지고 그 결과가 만들어진다.
  6. 따라서 중간연산에 대한 결과를 연산중에는 알수 없다.
  
  [중요한 특징]
  7. 한번 생성하고 사용한 스트림은 재사용할 수 없음
  8. 자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모됨
  9. 다른 연산을 수행하기 위해서는 스트림을 다시 생성해야 한다.
  
  
  
  중간 연산과 최종 연산  
  
  01. 중간 연산의 예 - filter(), map(), sorted() 등
  02. 조건에 맞는 요소를 추출(filter)하거나 요소를 변환 함(map)  
  
  03. 최종 연산이 호출될 때 중간 연산이 수행되고 결과가 생성 됨 
  
  04. 문자열 리스트에서 문자열의 길이가 5 이상인 요소만 출력하기
      sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
  
  
  05. filter()는 중간 연산이고, forEach()는 최종 연산임  
      1) 고객 클래스 배열에서 고객 이름만 가져오기
      2) customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));


  06. map()은 중간 연산이고, forEach()는 최종 연산임
      1) 람다식(화살표 함수)을 활용함
      2) 최종 연산의 예 - forEach(), count(), sum() 등
      3) 스트림이 관리하는 자료를 하나씩 소모해가며 연산이 수행 됨
      4) 최종 연산 후에 스트림은 더 이상 다른 연산을 적용할 수 없음
      5) forEach() : 요소를 하나씩 꺼내서 공통적인 작업을 수행
      6) count() : 요소의 개수
      7) sum() : 요소들의 합  
*/

public class Ex70_StreamLamda {

  public static void main(String[] args) {

    // 1,2,3,4,5를 원소로하는 정수배열 arrNum을 선언하시오.
    int[] arrNum = { 1, 2, 3, 4, 5 };

    // 1. 어드밴스드 for문을 이용하여 콘솔창에 출력하시오
    for (int num : arrNum) {
      System.out.println(num);
    }

    System.out.println();

    // 2. arrNum 배열에서 뽑아낸 스트림객체 numStream을 이용하여 제곱한 후 그값중 9이상인 값을 출력하시오.
    if (false) {
      IntStream numStream = Arrays.stream(arrNum);
      numStream.map(num -> num * num).filter(num -> num >= 9)
          .forEach(num -> System.out.println(num));
    }

    // 3. arrNum 배열원소의 개수를 출력하시오. -> 5
    if (true) {
      IntStream numStream = Arrays.stream(arrNum);
      System.out.printf("arrNum 배열원소의 개수는 %d\n\n", numStream.count());
    }

    // 4. arrNum 배열원소의 합을 출력하시오. -> 15
    System.out.printf("arrNum 배열원소의 합은 %d", Arrays.stream(arrNum).sum());

    // 5. 리스트컬렉션에 여러개의 People 객체를 저장하시오.
    List<People> peopleList = new ArrayList<People>();

    for (int i = 0; i < 10; i++) {
      People people = new People("익명_" + i, "010-1234-567" + i);
      peopleList.add(people);
    }

    System.out.println("\n\npeopleList의 크기는 " + peopleList.size());

    // 6. peopleList에 저장된 데이터를 출력하시오.
    for (People p : peopleList) {
      System.out.println(p.toString());
    }

    peopleList.clear();// 초기화

    System.out.println();

    // 5-1
    // IntStream.rangeClosed(0, 10).forEach(num->System.out.println(num));
    peopleList = IntStream.range(0, 10).mapToObj((i) -> {
      People people = new People("익명_" + i, "010-1234-567" + i);
      return people;
    }).collect(Collectors.toList());

    // 6-1
    peopleList.forEach(p -> System.out.println(p.toString()));

    peopleList.clear();// 초기화
    System.out.println();

    // 5-1,6-1과정을 통합
    IntStream.range(0, 10).mapToObj((i) -> {
      People people = new People("익명_" + i, "010-1234-567" + i);
      return people;
    }).collect(Collectors.toList()).forEach(p -> System.out.println(p.toString()));
	
	
	//IntStream과 LongStream 에는 range와 rangeClosed 메소드를 지원한다. 이 둘로 범위를 지정할 수 있는데, Closed가 붙으면 끝 개수를 포함한다.
	IntStream.rangeClosed(1, 100).forEach(i->{
		System.out.println(i);
	});

  }// end of main

}
