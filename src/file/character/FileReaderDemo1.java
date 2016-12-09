package file.character;

import java.io.FileReader;

public class FileReaderDemo1 {
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("song.txt");
		
		int count = 0;
		char[] buf = new char[1024];	// 보통 크기는 1k로 지정한다. 
		while ( (count = reader.read(buf)) !=-1	) {	//리더에 있는 리드 메소드는 버퍼에 차곡차곡 쌓는다. // 1024개가 넘으면 while문 한 번 실행. // 
			String str = new String(buf, 0, count);
			System.out.println(str);
			
		}
		reader.close();
		
	}
}
