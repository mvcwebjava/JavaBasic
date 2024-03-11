package filestream_130;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일에_바이트배열로_한꺼번에_출력하기_60 {

  public static void main(String[] args)  {
    
    FileOutputStream fos;
    
    try {
      fos = new FileOutputStream("arrOutput.txt");
      byte[] cont = new byte[26];
      byte data = 65;//'A'의 아스키값
      
      //배열에 데이터 저장
      for(int i=0;i<26;i++) {
        cont[i] = data;
        data++;
      }
      
      fos.write(cont);
      
      fos.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("프로그램을 종료합니다.");
    } 

  }

}
