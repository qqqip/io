package file.demo;

public class BookApp {
	public static void main(String[] args) throws Exception {
		
		Bookstore store = new Bookstore();
		
		store.displayBooks();
	
		
		Book book = new Book();
		book.setName("자바입문");
		book.setAuthor("니니");
		book.setPub("sk");
		book.setPrice(12500);
		
		store.addBook(book);
		
	}
}
