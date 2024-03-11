package c100_inner_class.innerClass;

public class InnerDuly {
	
	public void hoi() {
		System.out.println("1. 둘리의 hoi() 메소드 호출~!");
	}
	
	//멤버 내부 클래스
	public class Friends {
		String name;
		
		public Friends(String name) {
			this.name = name;
		}
		
		public void hello() {
			System.out.printf("2. 안녕하세요~ %s입니다.\n",name);
			
			//지역 내부 클래스
			class Music{
				void play(){
					System.out.println("3. 뮤직 고~! 고~! 고~!");
				}
			}//end of Music
			
			Music music = new Music();
			music.play();
			
		}//end of hello()
	}//end of Friends
}
