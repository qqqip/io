package file.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.commons.io.IOUtils;

public class FileCopoyDemo1 {
		public static void main(String[] args) throws Exception {
			
			FileInputStream fis = new FileInputStream("a.jpg");
			FileOutputStream fos = new FileOutputStream("b.jpg");
			
			IOUtils.copy(fis, fos);
			
		}
}
