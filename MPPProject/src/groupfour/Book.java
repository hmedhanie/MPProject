package groupfour;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Book {

	private String title;
	private int isbn;
	private int maxCheckOutDuration;
	private int availablity;
	private List<Author> author;
	//private List<BookCopy> bookCopy;
	
	private Queue<BookCopy> bookCopy = new LinkedList<>();
	

	public boolean isAvailable() {
		if (bookCopy.size() > 0) {
			return true;
		}else {
			return false;
		}
	}

	public BookCopy nextAvailableCopy() {
		
		return  bookCopy.remove();
		
	}
	
	public int getMaxCheckOutLength() {
		System.out.println("The maximum checkout length is "
				+ maxCheckOutDuration);
		return maxCheckOutDuration;
	}
}
