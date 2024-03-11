package filestream_130;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 바이트배열에_담아_한꺼번에_읽어오기_40 {

  public static void main(String[] args) throws IOException {
    
    FileInputStream fis;
    
    try {
      fis = new FileInputStream("loveLetter.txt");
      
      byte[] cont = new byte[12];
      
      int i = -1;
      
      //파일의 끝에 도달할때까지 cont 배열에 저장한후 for문을 실행함
      while((i = fis.read(cont))!=-1) {
        for(byte c : cont) {
          System.out.print((char)c);
        }
        System.out.println("");
      }
      
      fis.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("프로그램을 종료합니다.");
    }

  }

}
