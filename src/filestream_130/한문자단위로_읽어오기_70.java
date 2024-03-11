package filestream_130;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 한문자단위로_읽어오기_70 {

  public static void main(String[] args) {
    
    FileReader fr;
    
    try {
      fr = new FileReader("todayLetter.txt");
      
      int data = -1;
      while((data=fr.read())!=-1) {
        System.out.print((char)data);//문자단위로 읽어오기 때문에 한글도 정상출력
      }
      
      fr.close();
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("\n프로그램을 종료합니다.");
    }

  }

}
