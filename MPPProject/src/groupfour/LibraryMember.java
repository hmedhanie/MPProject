package groupfour;

import java.util.Date;

public class LibraryMember extends Person{

	private String memberId;
	private CheckOutRecord checkOutRecord; 
	
	public LibraryMember(String fname, String lname, String tel, Address address, String memberId) {
		super(fname, lname, tel, address);
		this.memberId = memberId;
	}
	
	public void checkOut(BookCopy copy, Date todayDate, int checkoutLength) {	//int todayPlusCheckOutLength) {
		
		copy.changeAvailability();
		
		//TODO change the format of the todayDate to int and add the checkoutLength
		
		//todayDate.toString()
		
		int dueDate = todayDate + checkoutLength;
		//convert dueDate back to Date format
		
		CheckOutRecordEntry tempCheckOutRecordEntry = CheckOutRecordEntry (BookCopy copy, Date todayDate, Date dueDate);
		
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
		return "LibraryMember [memberId=" + memberId + " : " + super.getFirstName() + " " + super.getLastName() + ", " +  "checkOutRecord = " + checkOutRecord + "]";
	}

	
	
}
