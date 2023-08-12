package pkg1;

public class Book{
	//member variables
	private int bookId;
	private String bookName;
	private String author;
	private String publishedYear;
	private String status;
	

	//constructor
	public Book(int bookId, String bookName, String author, String publishedYear, String status) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publishedYear = publishedYear;
		this.status = status;
	}

	//Getters and Setters
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
