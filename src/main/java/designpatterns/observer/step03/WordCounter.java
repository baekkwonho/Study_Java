package designpatterns.observer.step03;

public class WordCounter {
  MyObserver observer;
  
  public int count(String str) {
    int words = 0;
    boolean charFlag = false;
    StringBuffer wordBuf = new StringBuffer(); // 워드를 저장하는 용도
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        if (charFlag) {
          words++;
          charFlag = false;
          
          // 워드를 한 개 찾았다면 옵저버에게 보고하자!
          if (observer != null) { // 옵저버가 파견나와 있다면,
            observer.findWord(wordBuf.toString());
          }
          
          wordBuf.setLength(0); // 새 단어를 저장하기 위해 버퍼를 초기화시킨다.
        }
        continue;
      }
      charFlag = true;
      wordBuf.append(str.charAt(i)); // 버퍼에 문자 저장
    }
    
    if (charFlag) {
      words++;

      if (observer != null) { 
        observer.findWord(wordBuf.toString());
      }
    }
    
    return words;
  }

  public void addObserver(MyObserver observer) { // 옵저버 등록
    this.observer = observer;
  }
}










