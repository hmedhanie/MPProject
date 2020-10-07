package otherClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.SystemController;

public class UI {

	private SystemController systemController;
	
	 public UI() {
		super();
		systemController = new SystemController(this);
	}
	  

	public void addMember() {
		handle();
	}

	public void handle() {
		String fname = "John";
		String lname = "Peter";
		String tel = "254-441-6258";
		String memberId = "1406";
		String street = "4634 N Jupiter Road";
		String city = "FairField";
		String state = "Iowa";
		int zip = 52557;	
		Address address = new Address(street, city, state, zip);
		LibraryMember libraryMember = new LibraryMember(fname, lname, tel, address, memberId);
		systemController.addMember(libraryMember, address);
		
	}


	public void checkOut() {
		checkOutHandle();
	}

	private void checkOutHandle() {
		String memberId = "two";
		int isbn = 100;
		systemController.checkOutBook(memberId, isbn);
	}


	public void displaySuccess() {

	}

}
