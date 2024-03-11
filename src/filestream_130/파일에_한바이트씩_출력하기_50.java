package filestream_130;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일에_한바이트씩_출력하기_50 {

  public static void main(String[] args) {
    
    FileOutputStream fos;
    
    try {
      //최초 파일이 없을 경우 자동으로 생성되면서 기록된다.
      fos = new FileOutputStream("output.txt");
      
      fos.write(65);
      fos.write(66);
      fos.write(67);
      fos.write(68);
      fos.write(69);
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("프로그램을 종료합니다.");
    }

  }

}
