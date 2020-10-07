package otherClasses;
import controller.SystemController;

public class UI {

	private SystemController systemController;

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

	}

	public void displaySuccess() {

	}

}
