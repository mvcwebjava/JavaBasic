package filestream_130;

import java.io.IOException;

public class 바이트문자_하나를_입력받기_10 {

  public static void main(String[] args) {
    
    System.out.println("문자 하나만 입력후 엔터를 누르세요");
    
    /*
      data = System.in.read()
      
      스트림으로 데이터가 들어올때까지 작업을 진행하지 않고 대기하고 있는것이 특징이다.
      임의의 데이터를 입력한후 엔터키를 누르면 그때 read()가 반응하게 된다.
    
      System.in은 바이트단위로 읽어드리는 InputStream 이므로 1바이트만 읽는다. 
      영어 한개문자가 1바이트 이므로 여러문자를 입력해도 맨 앞에 한문자만 인식한다.
    */
    
    try {
      int data = System.in.read();//실행후 엔터
      
      System.out.println("data = "+data);//아스키코드로 출력 d->97
      System.out.println("data = "+(char)data);//문자로 형변환하여 출력
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }//end of main

}
