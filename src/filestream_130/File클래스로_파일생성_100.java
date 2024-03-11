package filestream_130;

import java.io.File;
import java.io.IOException;

public class File클래스로_파일생성_100 {

  public static void main(String[] args) throws IOException {
    
    File file = new File("duly.txt");//접근권한이 없을경우 파일 생성이 안되므로 다른 드라이브로 바꿔서 실행할것
    file.createNewFile();
    
    System.out.println("존재유무확인 : "+file.exists());
    System.out.println("파일길이 : "+file.length());
    System.out.println("파일인지 아닌지 : "+file.isFile());
    System.out.println("파일명 : "+file.getName());
    System.out.println("상대경로 : "+file.getPath());
    System.out.println("절대경로 : "+file.getAbsolutePath());
    System.out.println();
    System.out.println();
    System.out.println();
  }

}
