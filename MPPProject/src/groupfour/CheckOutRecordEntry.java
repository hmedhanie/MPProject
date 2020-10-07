package groupfour;

import java.util.Date;

public class CheckOutRecordEntry {

	private Date dateOfCheckOut;
	private Date dueDate;
	private BookCopy bookCopy;
	
	
	public CheckOutRecordEntry(BookCopy bookCopy, Date dateOfCheckOut, Date dueDate) {
		super();
		this.dateOfCheckOut = dateOfCheckOut;
		this.dueDate = dueDate;
		this.bookCopy = bookCopy;
	}


//	public void createEntry(bookCopy copy, Date todayDate, Date dueDate) {
//		
//	}
	
}
