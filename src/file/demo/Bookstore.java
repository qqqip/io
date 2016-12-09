package file.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Bookstore {
	
	ArrayList<Book> bookList = new ArrayList<>();
	
	public Bookstore() throws IOException {
		loadBookData();
	}
	
	private void loadBookData() throws IOException {
		// books.txt 파일을 읽어서 책정보를 ArrayList에 담기 
		// BufferedReader를 사용해서 파일 내용 읽기
		BufferedReader br = new BufferedReader(new FileReader("books.txt"));
		String text = null;
		while( (text = br.readLine()) !=null) {
			System.out.println(text);
			
			String[] text2 = text.split(",");
			
			Book book = new Book();
			
			book.setName(text2[0]);
			book.setAuthor(text2[1]);
			book.setPub(text2[2]);
			book.setPrice(Integer.parseInt(text2[3]));
			
			bookList.add(book);		
			
		}
	}
	
	public void displayBooks() {
		// ArrayList에 저장된 책 정보를 화면에 출력하기
		/*
		 * PrintWriter writer = new PrintWriter(new FileWriter("address.txt"), true);
		for (int i = 1; i <= 3; i++) {
			System.out.println("배송주소를 입력하세요: ");
			String text = sc.nextLine();

			writer.println(text);
			// writer.flush();
		}		
		writer.close();
		sc.close();
		 */
		for (Book b : bookList) {
			System.out.println(b.getName() + "," + b.getAuthor() + "," + b.getPub() + "," + b.getPrice());
		}
	}
	
	public void addBook(Book book) {
		// 전달받은 책 정보를 ArrayList에 저장하기 
		
		bookList.add(book);
	}
	
	public void saveBooks() throws IOException {
		// ArrayList에 저장된 책 정보를 books.txt 파일에 저장하기(덮어쓰기)

		PrintWriter writer = new PrintWriter(new FileWriter("books.txt"), true);
		
		for (Book b : bookList) {
			String str = b.getName() + "," + b.getAuthor() + "," + b.getPub() + "," + b.getPrice();
			writer.println(str);
		}
	}
	
}
