package filestream_130;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 문자배열에_담아_한꺼번에_읽어오기_80 {

  public static void main(String[] args) {

    FileReader fr;
    
    
    try {
      fr = new FileReader("todayLetter.txt");
      
      char[] cont = new char[16];
      
      int data = -1;
      
      //파일의 끝에 도달하면 -1
      while((data=fr.read(cont))!=-1) {
        for(char c : cont) {
          System.out.print(c);
        }
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
