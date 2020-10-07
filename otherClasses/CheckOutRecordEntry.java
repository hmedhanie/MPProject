package otherClasses;

import java.time.LocalDate;
import java.util.Date;

public class CheckOutRecordEntry {

	private LocalDate dateOfCheckOut;
	private LocalDate dueDate;
	private BookCopy bookCopy;
	
	
	public CheckOutRecordEntry(BookCopy bookCopy, LocalDate dateOfCheckOut, LocalDate dueDate) {
		super();
		this.dateOfCheckOut = dateOfCheckOut;
		this.dueDate = dueDate;
		this.bookCopy = bookCopy;
	}

	
}
