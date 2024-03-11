package exception_120;

public class Ex70_ExceptionLogic {

	public static void main(String[] args) {

		/*
			오류의 종류 : 
				1. 문법(Compile)오류 - 해결난이도 쉬움
				2. 논리오류 - 해결난이도 어려움
				
				3. 실행(Runtime)오류 - 실행조건에 따라 발생할 수 있는 오동작 -> 예외오류					
					예) HDD고장, 메모리고장, 메모리부족, 인터넷끊김, 정전 시 오동작

						논리적으로 문제가 없는 코드이기는 하지만....
						int i = Integer.parseInt(args[0]);  "0-9"-->정수 

						명령행매개변수 입력x-->java.lang.ArrayIndexOutofBoundsException /  
						명령행매개변수 "0" --> 정상 
						명령행 매개변수 "백" --> java.lang.NumberFormatException 					


					해결방법
						수많은 예외 상황 --> 클래스 정의 --> xxxxException 클래스들 
						예외 더이상 발생하지 않도록 제어 --> 예외처리  			

						만약 내가 작성하는 코드가 오류가 발생할 여지가 있는 코드라면 반드시 try~catch 구문을 작성한다.
						-->try catch finally throws throw 


				4. Exception의 종류

					1) checked 익셉션
						-> 컴파일러가 예외처리 구문 작성을 강제적으로 지시함

					2) unChecked 익셉션
						-> RuntimeException은 개발자들에 의해 실수로 발생하는 것들이기 때문에 에러를 강제하지 않는 것입니다.
						-> RuntimeException 을 상속받은 익셉션의 경우 예외처리 구문을 만들지 않아도 됨
		*/

	  //예시1
	  String msg = null;//null은 아주 특별한 값인데 "지금 현재 값을 알수없다"라는 의미의 값  
	  msg = "안녕하세요";


		//예시2 - 실행시 입력조건 : 2개 이상 값 입력, 정수로 변경가능, 0 제외 
		int i = 100;
	  int j = 0;

		try {

			// 오류가 발생할 여지가 있는 코드
			System.out.println("msg 문자열의 길이 = " + msg.length());

			//int i = Integer.parseInt(args[0]);
			//j = Integer.parseInt(args[1]);
			System.out.println(i/j);

		} catch (NullPointerException e) {

      System.out.println("null값을 가진 문자열 변수의 길이를 측정시도해서 오류가 발생했습니다.");

			//try 구문안에 많은 코드가 있을 때 어디서 문제가 발생했는지 찾기 어려울때는 ....
      e.printStackTrace();//예외 발생정보를 찾아서 출력
      
    }catch(ArithmeticException e){
			System.out.println("0으로 나누어 오류가 발생했습니다.");			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("2개 이상의 값을 입력해야 합니다.");
		}catch(NumberFormatException e){
			System.out.println("정수로 변환가능한 값으로 입력해 주세요");
		}finally {
      System.out.println("1. 오류가 있건 없건간에 무조건 실행됩니다.");
    }
    
    
    System.out.println("2. 실제로 이 뒤로 엄청 많은 출력이 있어요~!");
		System.out.println("★★★프로그램 종료★★★");

	}
}
