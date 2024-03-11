package filestream_130;

import java.io.IOException;
import java.io.InputStreamReader;

public class 문자단위로_여러개_입력받기_25 {

  public static void main(String[] args) {
    

    System.out.println("여러문자를 입력후 엔터를 누르세요");
  
    //InputStream의 변형 -> 보조기능의 보조스트림
    InputStreamReader isr = new InputStreamReader(System.in);
    
    int i;
    try {
      while((i=isr.read())!=-1) {
        System.out.print((char) i);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
       

  }

}
