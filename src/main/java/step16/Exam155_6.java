/* 주제: 파일을 다루는 도구 - File 사용법, 디렉토리 내용 알아내기4
 */
package step16;

import java.io.File;
import java.io.FilenameFilter;

public class Exam155_6 {

  public static void main(String[] args) throws Exception {
    File f2 = new File("src/main/java/step16"); // .(현재폴더), ..(상위폴더)

    // 자바 파일만 출력하라!
    File[] list = f2.listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        if (name.endsWith(".java"))
          return true;
        return false;
      }
    });
    
    for (File item : list) {
      System.out.printf("%s %s\n", 
          item.isDirectory() ? "d":"-", 
          item.getName());
    }
    
  }

}










