package otherClasses;

public class DataBase {

	private Address address;
	private LibraryMember libraryMember;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LibraryMember getLibraryMember() {
		return libraryMember;
	}

	public void setLibraryMember(LibraryMember member) {
		this.libraryMember = member;
	}

	public void print() {
		System.out.println(address);
		System.out.println(libraryMember);
	}
	
	Address addr1 = new Address("street", "city", "state", 10);
	LibraryMember one = new LibraryMember("fff", "lll", "123456", addr1, "one");
	LibraryMember two = new LibraryMember("ggg", "hhh", "654321", addr1, "two");
	LibraryMember three = new LibraryMember("fff", "lll", "123456", addr1, "three");
	LibraryMember four = new LibraryMember("fff", "lll", "123456", addr1, "four");
	
	LibraryMember[] lib = {one, two, three, four};
	
	public LibraryMember searchMemberDataBase(String memberId) {
		LibraryMember library = null;
		for (LibraryMember libraryMember : lib) {
			if (libraryMember.getMemberId().equals(memberId)) {
				library = libraryMember;
			}
		}
		return library;
}
	
	public Book[] bookDataBase() {
		Book bOne = new Book("Java", 15, 20, 30);
		BookCopy copy11 = new BookCopy(bOne); BookCopy copy12 = new BookCopy(bOne); BookCopy copy13 = new BookCopy(bOne);
		bOne.addListOfBookCopy(copy11); bOne.addListOfBookCopy(copy12);  bOne.addListOfBookCopy(copy13); 
		
		Book bTwo = new Book("avaJ", 10, 20, 30);
		BookCopy copy21 = new BookCopy(bTwo); BookCopy copy22 = new BookCopy(bTwo); BookCopy copy23 = new BookCopy(bTwo);
		bTwo.addListOfBookCopy(copy21); bTwo.addListOfBookCopy(copy22); bTwo.addListOfBookCopy(copy23);
		
		Book bThree = new Book("Java", 20, 20, 30);
		BookCopy copy31 = new BookCopy(bTwo);
		bThree.addListOfBookCopy(copy31);
		
		Book bFour = new Book("Java", 25, 20, 30);
		BookCopy copy41 = new BookCopy(bTwo);
		bFour.addListOfBookCopy(copy41);
		
		Book[] b = {bOne, bTwo, bThree, bFour};	
		return b;
	}
	
	public Book searchBookFromDataBase(int memberId) {
		Book[] b = bookDataBase();
		Book book = null;
		for (Book bok : b) {
		if (bok.getIsbn() == memberId) {
			book = bok;
		}	
		}
		return book;
	}
}



