package filestream_130;

import java.io.IOException;

public class 바이트단위로_여러개_입력받기_배열이용_21 {

  public static void main(String[] args) {

    byte[] cont = new byte[12];//상황에 맞게 알맞은 숫자로 대체

    System.out.println("여러문자를 입력후 엔터를 누르세요");
    int data = -1;
    
    try {
      //System.in은 바이트단위로 읽어드리는 InputStream 이므로 1바이트만 읽는다. 영어 한개문자가 1바이트
      //파일의 끝에 도달하면 -1 리턴
      while((data=System.in.read(cont)) != -1) {
        for(byte c : cont) {
          System.out.print((char)c);
        }        
      }
      
      System.out.println(cont.toString());
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("프로그램 종료");
    }
    

  }

}
