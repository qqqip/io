package file.demo;

public class Book {
	private String name;
	private String author;
	private String pub;
	private int price;
	
	public Book() {}

	public Book(String name, String author, String pub, int price) {
		super();
		this.name = name;
		this.author = author;
		this.pub = pub;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
