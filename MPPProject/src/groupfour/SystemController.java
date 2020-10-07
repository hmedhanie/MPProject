package groupfour;

import java.awt.print.Book;
import java.util.Date;

public class SystemController {

	private UI uI;
	private DataAccess dataAccess;
	
	public void addMember(LibraryMember libraryMember, Address address) {
		dataAccess.saveLibraryMember(libraryMember, address);
		
		
		
		/*String street = libraryMember.getAddress().getStreet();
		String city = libraryMember.getAddress().getCity();
		String state = libraryMember.getAddress().getState();
		int zip = libraryMember.getAddress().getZip();
		Address address = new Address(street, city, state, zip);
		String fname = libraryMember.getFirstName();
		String lname = libraryMember.getLastName();
		String tel = libraryMember.getPhoneNumber();
		String memberId = libraryMember.getMemberId();
		LibraryMember LibraryMember = new LibraryMember(fname, lname, tel, address, memberId); 
		dataAccess.saveLibraryMember(fname, memberId);*/
	}
	
	public void checkOutBook(String memberId, String isbn) {
		
		//Assumption: member ID and the book Id are found and we would like to check if there is available copy
		//say the book as 'book'
		
		if(book.isAvailable()) {
			BookCopy bookCopyTemp = book.nextAvailableCopy();
			int maxCheckoutLength = book.getMaxCheckOutLength();
		}else {
			System.out.println("book is not available");
		}
		
		//Say libraryMember obj is 
	
		libraryMember.checkOut(copy, todayDate, todayPlusCheckOutLength);
		
		//TODO finalize this
		
		//15.saveMember(member)
		//16. saveBook(book)
		//17.displaySuccess
	}	
}
