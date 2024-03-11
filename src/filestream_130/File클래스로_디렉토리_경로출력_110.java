package filestream_130;

import java.io.File;
import java.io.IOException;

//파일업로드 로직작성시 활용
public class File클래스로_디렉토리_경로출력_110 {

  public static void main(String[] args) throws IOException {
    
    File file = new File("duly.txt");//접근권한이 없을경우 파일 생성이 안되므로 다른 드라이브로 바꿔서 실행할것
    String absPath = file.getAbsolutePath();
    
    //예제1 - 디렉토리 기본정보
    File dir1 = new File(absPath.substring(0,absPath.lastIndexOf(File.separator)));//File.separator는 OS에 따라 / or \ 이다.
    
    System.out.println("디렉토리인지 아닌지 : "+dir1.isDirectory());
    System.out.println(dir1.getAbsolutePath());
    System.out.println(dir1.getCanonicalPath());
    
    //예제2 - 폴더생성
    File dir2 = new File(absPath.substring(0,absPath.lastIndexOf(File.separator))+File.separator+"newdir");
    if(!dir2.exists()) {
      dir2.mkdir();
    }
    
  }

}
