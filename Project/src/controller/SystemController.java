package controller;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import otherClasses.*;

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
		
	}
}
