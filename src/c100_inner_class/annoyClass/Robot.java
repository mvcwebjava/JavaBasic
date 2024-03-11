package c100_inner_class.annoyClass;

//메소드가 추가되어도 기존의 설계를 변경할 필요가 없다.
//JDK8 버전부터 가능 - default메소드, static메소드
public interface Robot {
	
	void walk();
	
	//상황1
	//인터페이스르 구현한 하위 클래스 다수개가 사용중인 상황에서 mb 메소드 추가해야 하는 상황
	//구현된 상태로 제공 - 상속받아도 반드시 오버라이딩 할 필요가 없는 default 메소드
	//필요에 따라 선택적으로 오버라이딩 해도 된다.
	default void run() {
		System.out.println("2. 인터페이스에서 default로 구현한 run() 메소드 호출");
	}
	
	
	//상황2
	//인터페이스르 구현한 하위 클래스 다수개가 사용중인 상황에서 fly 메소드 추가해야 하는 상황
	//구현된 상태로 제공 - 절대 오버라이딩 할 수 없는 static 메소드
	//사용시에는 인터페이스의 이름으로 사용한다. Robot.fly(); 이런식으로...
	static void fly() {
		System.out.println("3. 인터페이스에서 static으로 구현한 fly() 메소드 호출");
	}	
}
