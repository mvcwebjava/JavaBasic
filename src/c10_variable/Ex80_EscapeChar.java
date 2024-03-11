package c10_variable;

//이스케이프 특수문자의 기능을 설명하는 예제

// 이스케이프 문자 : 프로그램의 문자열 안에 포함될 수 있는 특수 문자
public class Ex80_EscapeChar {
  public static void main(String[] args) {
    
    String src = "JAVA";
    
    // 문자열 안에 쌍따옴표 포함시키기
    System.out.println("\"" + src);        
    System.out.println("---------------");
    
    // 문자열 안에 홑따옴표 포함시키기
    System.out.println("\'" + src);
    System.out.println("---------------");
    
    // 줄바꿈 문자
    System.out.println("\n" + src);
    System.out.println("---------------");
    
    // 탭키에 해당하는 문자
    System.out.println("\t" + src);
  }
}
