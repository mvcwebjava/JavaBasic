package filestream_130;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 파일로부터_한바이트씩_읽어오기_30 {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("loveLetter.txt");
      
      for(int i=0;i<12;i++) {
        System.out.print((char)fis.read());//바이트 단위로 읽어오기 때문에 한글은 출력안됨
      }
      fis.close(); 
      
      System.out.println("");
      
      fis = new FileInputStream("myLetter.txt");
      int i = -1;
      
      //파일의 끝에 도달하면 -1 리턴
      while((i=fis.read())!=-1) {
        System.out.print((char)i);
      }
      
      
      System.out.println("");
      
      fis.close(); 
      
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("프로그램이 종료되었습니다.");
    } 
    
  }

}
