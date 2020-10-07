package otherClasses;

import java.util.Date;

public class LibraryMember extends Person{

	private String memberId;
	private CheckOutRecord checkOutRecord; 
	
	public LibraryMember(String fname, String lname, String tel, Address address, String memberId) {
		super(fname, lname, tel, address);
		this.memberId = memberId;
	}
	
	public void checkOut(String copy, Date todayDate, int todayPlusCheckOutLength) {
		
	}

	public String getMemberId() {
		return memberId;
	}


	public CheckOutRecord getCheckOutRecord() {
		return checkOutRecord;
	}

	public void setCheckOutRecord(CheckOutRecord checkOutRecord) {
		this.checkOutRecord = checkOutRecord;
	}

	@Override
	public String toString() {
		return "LibraryMember [memberId=" + memberId + ", checkOutRecord=" + checkOutRecord + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getPhoneNumber()=" + getPhoneNumber() + "]";
	}

	

	

	
	
}
