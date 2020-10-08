package otherClasses;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Book {

	private String title;
	private int isbn;
	private int maxCheckOutDuration;
	private int availablity;
	//private static int availability = 1; // 
	private List<Author> authorsList = new LinkedList<>();
	private Queue<BookCopy> bookCopyList = new LinkedList<>();
	private static int counter = 0;		//this serves as a counter for the total number of copies a library owns

	public Book(String title, int isbn, int maxCheckOutDuration, int availablity) {

		this.title = title;
		this.isbn =isbn;
		this.maxCheckOutDuration=maxCheckOutDuration;
		this.availablity=availablity;
		//Availability shall be a static boolean so that it can be manipulated 
		//by BookCopy when called in create copyRecord(for checking out)
	}

	
	public void addBookCopy(BookCopy bookCopy) {
		bookCopyList.add(bookCopy);
	}
	
	//TODO Reminder: create the author and pass it as a parameter
	
	public void addAuthor(Author author) {	
		authorsList.add(author);
		author.addToBook(this);
	}

	
	//need update maybe return type is not boolean myb int
	public boolean isAvailable() {
		if (bookCopyList.size() > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public BookCopy getAvailableCopy() {
		
		return  bookCopyList.remove();		
	}

	public int getMaxCheckOutLength() {
		return  maxCheckOutDuration;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int value) {
		counter = value;
	}

	
	//TODO include the list of authors and bookCopy

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", maxCheckOutDuration=" + maxCheckOutDuration
				+ ", availablity=" + availablity + ", authors=" + ", bookCopys=" + "]";
	}

	public int getIsbn() {
		return isbn;
	}
	
	
	public List<Author> getAuthorsList() {
		return authorsList;
	}


	public Queue<BookCopy> getBookCopyList() {
		return bookCopyList;
	}


	
}
