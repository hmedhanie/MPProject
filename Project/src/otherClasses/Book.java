package groupfour;

import java.util.List;

public class Book {

	private String title;
	private int isbn;
	private int maxCheckOutDuration;
	private int availablity;
	private List<Author> author;
	private List<BookCopy> bookCopy;

	public void isAvailable() {

	}

	public BookCopy nextAvailableCopy() {
		return new BookCopy();
	}
	
	public void getMaxCheckOutLength() {

	}
}
