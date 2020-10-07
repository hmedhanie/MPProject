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

	public void checkOutBook(String memberId, int isbn) {
		LibraryMember member = dataAccess.searchMember(memberId);
		System.out.println(member +"=");
		
		Book book = new Book();
	    book = dataAccess.searchBook(isbn);
		
		
	}
}
