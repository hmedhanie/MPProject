package otherClasses;

import java.time.LocalDate;
import java.util.Date;

public class LibraryMember extends Person{

	private String memberId;
	private CheckOutRecord checkOutRecord; 
	
	public LibraryMember(String fname, String lname, String tel, Address address, String memberId) {
		super(fname, lname, tel, address);
		this.memberId = memberId;
		this.checkOutRecord = new CheckOutRecord(0, LocalDate.now());
	}
	
	public void checkOut(BookCopy copy, LocalDate todayDate, int checkoutLength) {	

		LocalDate dueDate = LocalDate.now().plusDays(checkoutLength);
		
		CheckOutRecordEntry tempCheckOutRecordEntry = new CheckOutRecordEntry (copy, todayDate, dueDate);
		
		checkOutRecord.addEntry(tempCheckOutRecordEntry);
		
	}

	public String getMemberId() {
		return memberId;
	}

	public CheckOutRecord getCheckOutRecord() {
		return checkOutRecord;
	}

	@Override
	public String toString() {
		return "LibraryMember [memberId=" + memberId + ", checkOutRecord=" + checkOutRecord + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getPhoneNumber()=" + getPhoneNumber() + "]";
	}

	

	

	
	
}
