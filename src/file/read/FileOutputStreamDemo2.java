package file.read;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws Exception {

		ArrayList<String> names = new ArrayList<>();

		names.add("박재범");
		names.add("성시경");
		names.add("권건");
		names.add("켄타로");
		names.add("서강준");

		// "names.txt" 파일에 모든 이름을 기록하기...
		FileOutputStream fos = new FileOutputStream("name.txt");
		
		for (String name : names) {
			name = name + System.lineSeparator();
			byte[] b = name.getBytes();
			fos.write(b);
		}
		fos.close();
	}
}