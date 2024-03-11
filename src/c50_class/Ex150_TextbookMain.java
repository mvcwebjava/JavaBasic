package c50_class;

//생성자 오버로딩 - 같은 기능을 매개변수 유형별로 여러개 제공하는 개념
class Textbook{
  String title;
  int grade;
  
  //생성자 오버로딩
  public Textbook(){     
      title = "국어";
      grade = 1;
  }
  
  public Textbook(String title, int grade){
      this.title = title; 
      this.grade = grade;
  }
  
  public void getBook(){
      System.out.println("과목 : "+ title);
      System.out.println("학년 : "+ grade);
  }
}//end of class

public class Ex150_TextbookMain {
  public static void main(String[] args) 
    {
        Textbook book1 = new Textbook();   
        book1.getBook();
        
        System.out.println("-------------------------");
        
        Textbook book2 = new Textbook("수학", 3);
        book2.getBook();
    }
}
