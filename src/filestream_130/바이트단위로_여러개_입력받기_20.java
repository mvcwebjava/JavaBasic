package filestream_130;

import java.io.IOException;
import java.io.InputStreamReader;

public class 바이트단위로_여러개_입력받기_20 {

  public static void main(String[] args) {
    

    System.out.println("여러문자를 입력후 엔터를 누르세요");
    int data;
    
    //이 로직을 ex30-jsp-basic의 120_fileupload 에서 활용할 수 있다. 
    try {
      //System.in은 바이트단위로 읽어드리는 InputStream 이므로 1바이트만 읽는다. 영어 한개문자가 1바이트
      //파일의 끝에 도달하면 -1 리턴
      while((data=System.in.read()) != '\n') {
        System.out.print((char)data);
      }
      
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("프로그램이 종료되었습니다.");
    }
    

  }

}
