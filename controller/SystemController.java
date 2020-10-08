// system Controller
package controller;

import java.time.LocalDate;

import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import otherClasses.Address;
import otherClasses.Book;
import otherClasses.BookCopy;
import otherClasses.LibraryMember;
import otherClasses.Main;
//import otherClasses.UI;

public class SystemController {

	private Main main;
	private DataAccess dataAccess;

	public SystemController(Main main) {
		super();
		dataAccess = new DataAccessFacade();
		this.main = main;
	}

	public void addMember(LibraryMember libraryMember) {
		dataAccess.saveLibraryMember(libraryMember);
	}

	public void checkOutBook(String memberId, int isbn) {
		LibraryMember member = dataAccess.searchMember(memberId);	
		
		Book book = dataAccess.searchBook(isbn);
		
		
		BookCopy bookCopyTemp = null;
		int maxCheckoutLength = 0;

		if (book != null) {
			if (book.isAvailable()) {
				bookCopyTemp = book.getAvailableCopy();
				maxCheckoutLength = book.getMaxCheckOutLength();
			} else {
				System.out.println("book is not available");
			}
		}
		if (book != null) {
		LocalDate todayDate = LocalDate.now();
		member.checkOut(bookCopyTemp, todayDate, maxCheckoutLength);
		}
		
		dataAccess.saveBook(book);
		main.displaySuccess();
	}

	public void addBookCopy(int isbn) {
		Book book = dataAccess.searchBook(isbn);
		if (book != null) {
			dataAccess.saveBook(book);
		}
		
	}
	public boolean searchUsername(String input) {
	return dataAccess.searchUsername(input);
	}
	
	public boolean matchPswd(String userID, String pswd) {
		return dataAccess.matchPswd(userID, pswd );
	}
	
	public int authorization(String userID) {
		return dataAccess.authorization(userID);
	}
	
	public LibraryMember searchMember(String memberID) {
		return dataAccess.searchMember(memberID);
	}

	public Book searchBook(int inputIsbn) {
		return dataAccess.searchBook(inputIsbn);
	}

}
