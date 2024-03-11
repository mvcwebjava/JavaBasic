package filestream_130;

import java.io.FileWriter;
import java.io.IOException;

public class 문자단위로_파일에_출력하기_90 {

  public static void main(String[] args) {
    
    FileWriter fw;
    
    try {
      fw = new FileWriter("hello.txt");
      
      fw.write(65);
      
      fw.write('A');
      
      fw.write("\n안녕");
      
      char[] cont = {'\n','H','E','L','L','O'};
      
      fw.write(cont);
      
      fw.close();
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("hello.txt 파일에 출력완료~!");
    }

  }

}
