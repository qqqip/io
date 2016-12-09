package file.copy;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class FileCopyDemo2 {
	public static void main(String[] args) throws Exception {
		
		String path = "http://imgnews.naver.com/image/5090/2016/06/18/20160617093826815654_99_20160618000807.jpg";
		URL url = new URL(path);
		
		InputStream is = url.openStream();	// 읽어오는 빨대 생성 
		
		FileOutputStream fos = new FileOutputStream("ken.jpg");	// 내 컴퓨터에 저장 
		
		IOUtils.copy(is, fos);
		
		
	}
}
