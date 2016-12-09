package file.character;

import java.io.FileWriter;

public class FileWriterDemo1 {
	public static void main(String[] args) throws Exception {
		
		FileWriter writer = new FileWriter("song.txt");
		
		writer.write("학교종이 땡땡땡 어서 모이자 선생님이 우리를 기다리신다.");
		writer.flush(); // FileWriter의 내부버퍼에 보관된 잔류 데이터를 진짜로 출력하게 한다. // 8k(4000자)가 차야 출력. 그 이하는 flush를 실행해준다.  
		writer.close(); // 
		
	}
}
