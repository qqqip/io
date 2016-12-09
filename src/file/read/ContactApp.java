package file.read;

import java.io.FileInputStream;
import java.util.ArrayList;

public class ContactApp {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("contacts.txt");

		int count = 0;
		byte[] bytes = new byte[1024];

		StringBuilder sb = new StringBuilder();

		// 1. contacts.txt의 내용을 읽어서 화면에 표시하기
		while ((count = fis.read(bytes)) != -1) {
			String text = new String(bytes, 0, count);
			sb.append(text);

		String[] info = text.split(":");
		ArrayList<Contact> contact = new ArrayList<>();

		for (String s : info) {
			// s에 저장된 데이터를 "," 구분자로 자르기
			String[] a = s.split(",");
			
			Contact c = new Contact(); // ArrayList에 담을 객체 생성하기 
			
			c.setName(a[0]);
			c.setTel(a[1]);
			c.setEmail(a[2]);
			
			contact.add(c);
			
//			System.out.printf("이름: " + c.getName() + "\t전번: " + c.getTel() + "\t이메일: " + c.getEmail());
			System.out.printf("%3s\t %10s\t %20s \n", c.getName(), c.getTel(), c.getEmail());
			// 잘라진 데이터(이름, 전번, 이메일)을 담을 Contact객체 생성하기
			// Contact 객체에 이름, 전번, 이메일 저장
			// 연락처 정보가 저장된 Contact객체를 ArrayList에 저장하기
			
		}

		// 2.contacts.txt의 내용을 한 사람씩 구분해서 화면에 표시하기
		// 3.ArrayList<Contact>를 생성해서 모든 사람의 정보를 저장하기

		
		
		}
		fis.close();
		// 문자열 처리는 여기서...
		String data = sb.toString();
		System.out.println(data);

	}

}

/*
 * 
*/
