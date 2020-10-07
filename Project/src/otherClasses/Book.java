package otherClasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Book {

	private String title;
	private int isbn;
	private int maxCheckOutDuration;
	private int availablity;
	private List<Author> authors;
	private List<BookCopy> bookCopys;
	private Queue<BookCopy> bookCopy = new LinkedList<>();

	public Book(String title, int isbn, int maxCheckOutDuration, int availablity) {
		BookCopy copy = new BookCopy(this);
		bookCopys = new ArrayList<>();
		bookCopys.add(copy);
		authors = new ArrayList<>();
		this.title = title;
		this.isbn =isbn;
		this.maxCheckOutDuration=maxCheckOutDuration;
		this.availablity=availablity;
	}

	
	public void addListOfBookCopy(BookCopy bookCopy) {
		bookCopys.add(bookCopy);
	}
	
	public void addToAuthor(String firstName, String lastName, String phoneNumber, Address address, String shortBio,
			String credentials) {
		Author author = new Author(firstName, lastName, phoneNumber, address, shortBio, credentials, this);
		authors.add(author);
	}

	//need update maybe return type is not boolean myb int
	public boolean isAvailable() {
		if (bookCopy.size() > 0) {
			return true;
		}else {
			return false;
		}
	}


	public BookCopy nextAvailableCopy() {
		
		return null;
	}

	public int getMaxCheckOutLength() {
		return  maxCheckOutDuration;
	}

	public int getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", maxCheckOutDuration=" + maxCheckOutDuration
				+ ", availablity=" + availablity + ", authors=" + authors + ", bookCopys=" + bookCopys + "]";
	}
	
}
