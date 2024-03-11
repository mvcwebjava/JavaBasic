package c90_basic_api;

import java.text.DecimalFormat;

public class Ex110_DecimalFormat {

	public static void main(String[] args) {
		/*
		 * 숫자를 원하는 형식의 문자열로 변환 
		 * 
		 * DecimalFormat df = new DecimalFormat();
		 * 
		 * 포매팅 문자 규칙 
		 * 
		 *  #		- 1자리 숫자 (자리수 보존 안됨)
		 * 	0 		- 1자리 숫자 000 (자리수 보존)
		 *  
		 */
	  DecimalFormat df = new DecimalFormat("####.##");
		
		Double num = 135.5678;
		
		//예시1
		String strNum = df.format(num);//135.57 자동 반올림처리 
		System.out.printf("1. 출력 결과는 %s 입니다.\n",strNum);
		
		
		//예시2 - 표현해야 할 자리수가 모자를 경우 원래수를 다 출력  
		num = 2580.5678;
		strNum = df.format(num);//135.57 자동 반올림처리 		
		System.out.printf("2. 출력 결과는 %s 입니다.\n",strNum);

		
		//예시3 - 자리수가 남을 경우 0으로 채워서 출력 
		num = 85.68;
		df = new DecimalFormat("0000.00");
		strNum = df.format(num);	
		System.out.printf("3. 출력 결과는 %s 입니다.\n",strNum);
		
		//예시4
		num = 999999.90; 
		strNum = df.format(num);//마지막 소수점도 0으로 출력됨 
		System.out.printf("4. 출력 결과는 %s 입니다.\n",strNum);
		
		//예시5
		num = 2588.70;
		
		//에러발생함 - 소수점 첫째 자리가 있어야 둘째자리도 있을 수 있기 때문 
		//df = new DecimalFormat("####.#0");
		
		//소수점을 모두 00으로 해야 함 
		df = new DecimalFormat("####.00");		
		
		df.format(num);

		System.out.printf("5. 출력 결과는 %s 입니다.\n",strNum);
	}

}