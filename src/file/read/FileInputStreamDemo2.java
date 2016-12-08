package file.read;
import java.io.FileInputStream;

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws Exception {

		long start = System.currentTimeMillis();

		FileInputStream fis = new FileInputStream("sample.txt");
		int count = 0;
		byte[] buf = new byte[1024];

		while ((count = fis.read(buf)) != -1) {// 1024개가 읽어질 때까지 실행
			String str = new String(buf, 0, count);
			System.out.println(str);
		}
		fis.close();

		long stop = System.currentTimeMillis();
		System.out.println("\n소요시간: " + (stop - start) + "밀리초");

	}
}