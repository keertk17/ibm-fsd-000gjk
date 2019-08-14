package comm.example;

public class Book extends Product {
	private String bookName;
	private String authorName;
	public Book() {
		
	}
	public Book(String bookName,String authorName) {
		this.bookName=bookName;
		this.authorName=authorName;
	}
	public void getBookDetails() {
		System.out.println("Bookname:" +bookName+ " Authorname:"+authorName);
	}
}

