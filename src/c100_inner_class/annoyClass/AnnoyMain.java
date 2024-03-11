package c100_inner_class.annoyClass;

public class AnnoyMain {

	public static void main(String[] args) {
		
		TaekwonV tav = new TaekwonV();
		
		tav.walk();
		tav.run();
		
		Robot.fly();
		
		//스프링의 TransactionTemplate.execute() 메소드 구현시 이런 방식을 사용함
		//I인터페이스 타입의 anonymous 익명클래스를 구현
		//JDK8 버전부터 가능
		Robot kakao = new Robot() {

			@Override
			public void walk() {
				System.out.println("4. 카카오 걷기버전이 곧 출시됩니다.");				
			}
			
		};
		
		kakao.walk();
	}

}
