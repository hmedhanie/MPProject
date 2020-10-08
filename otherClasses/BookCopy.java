package otherClasses;

public class BookCopy {

	private int copyNumber;
	private Book book;
	
	public BookCopy(Book book) {
		this.book = book;
		book.addBookCopy(this);
		Book.setCounter(Book.getCounter() + 1); 
		this.copyNumber = Book.getCounter();
	}
	
	
}
