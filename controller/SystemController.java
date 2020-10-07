// system Controller
package controller;

import java.time.LocalDate;

import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import otherClasses.Address;
import otherClasses.Book;
import otherClasses.BookCopy;
import otherClasses.LibraryMember;
import otherClasses.UI;

public class SystemController {

	private UI uI;
	private DataAccess dataAccess;

	public SystemController(UI uI) {
		super();
		dataAccess = new DataAccessFacade();

	}

	public void addMember(LibraryMember libraryMember, Address address) {
		dataAccess.saveLibraryMember(libraryMember, address);
	}

//	public void checkOutBook(String memberId, int isbn) {
//		LibraryMember member = dataAccess.searchMember(memberId);
//		System.out.println(member +"=");
//		
//		//Book book = new Book();//redundant
//	    Book book = dataAccess.searchBook(isbn);
//	
//	}
	
    public void checkOutBook(String memberId, int isbn) {
    	LibraryMember member = dataAccess.searchMember(memberId);
		System.out.println(member +"=");
		
		//Book book = new Book();//redundant
	    Book book = dataAccess.searchBook(isbn);

		
		//Assumption: member ID and the book Id are found and we would like to check if there is available copy
		//say the book as 'book'
		
		BookCopy bookCopyTemp = null;
		int maxCheckoutLength = 0;
		
		if(book.isAvailable()) {
			bookCopyTemp = book.getAvailableCopy();
			maxCheckoutLength = book.getMaxCheckOutLength();
		}else {
			System.out.println("book is not available");
		}
		
	
		LocalDate todayDate = LocalDate.now();
		//
		
		member.checkOut(bookCopyTemp, todayDate, maxCheckoutLength);
		
		//TODO finalize this
		
		//15.saveMember(member)
		//16. saveBook(book)
		//17.displaySuccess
	}
}
