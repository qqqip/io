package file.read;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamDemo1 {
	public static void main(String[] args) throws Exception {

		URL url = new URL(
				"http://mblogthumb2.phinf.naver.net/MjAxNjEwMjBfNTUg/MDAxNDc2OTQzNDI1Nzk4.rFdwtuHehELGrxEM9xEGr4xNKiqtXU2L7BqOKrlC9S8g.bL0AZlOaLXHPuf7lp4PNk7icmI_36n95tLcRq8sylM8g.JPEG.jihae1262/b51bfedc88f6029b2200bfcb57a22cd9.jpg?type=w420");

		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("a.jpg");

		int count = 0;
		byte[] buf = new byte[1024 * 8];
		while ((count = is.read(buf)) != -1) {
			fos.write(buf, 0, count);
		}
		fos.close();
	}
}
/*
 * URL url = new URL("http://edition.cnn.com"); InputStream is =
 * url.openStream();
 * 
 * int count = 0; byte[] buf = new byte[1024]; while ( (count=is.read(buf)) !=
 * -1) { String str = new String(buf, 0, count); System.out.println(str);
 */