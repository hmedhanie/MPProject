package otherClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dataaccess.User;

public class DataBase {

	private List<LibraryMember> libraryMemberList = new ArrayList<LibraryMember>();
	private List<Book> bookList = new ArrayList<Book>();
	private List<User> users = new ArrayList<>();


	public DataBase() {
		createUser();
		addLibraryMemberToDB();
		 addBookToDB();
	}

	private void createUser() {
		User admin = new User("Abrham", "1020", 1);
		User librarian = new User("Tsega", "1020", 0);
		User both = new User("Daniel", "1020", 2);
		Collections.addAll(users, admin, librarian, both);
	}
	
	public List<User> getUsers() {
		return users;
	}

	private void addLibraryMemberToDB() {
		Address addressMemberOne = new Address("1000 N main st", "FairField", "Iowa", 52557);
		LibraryMember memberOne = new LibraryMember("Tsega", "Abraham", "215-658-963", addressMemberOne, "1406");
		Address addressMemberTwo = new Address("2000 E main st", "Dallas", "Texas", 52557);
		LibraryMember memberTwo = new LibraryMember("Tsega", "Abraham", "215-658-963", addressMemberTwo, "1500");
		Address addressMemberThree = new Address("25ME Avenu", "Denver", "Colardo", 65253);
		LibraryMember memberThree = new LibraryMember("Medhanine", "Habtu", "215-658-963", addressMemberThree, "1625");
		Address addressMemberFour = new Address("4634 N Jupiter rd", "Garland", "Texas", 75042);
		LibraryMember memberFour = new LibraryMember("Gutu", "Dessisa", "215-658-963", addressMemberFour, "1808");
		Collections.addAll(libraryMemberList, memberOne, memberTwo, memberThree, memberFour);
	}
	
	public void addLibraryMemberToDB(LibraryMember member) {
	libraryMemberList.add(member);
	}
		
	public List<LibraryMember> getLibraryMemberFromDB() {
		return libraryMemberList;
	}

	private void addBookToDB() {
		Address addressOfAuthorOne = new Address("69N st", "Irving", "Texas", 2596);
		Address addressOfAuthorTwo = new Address("70N st", "Iowa city", "Iowa", 1425);
		Address addressOfAuthorThree = new Address("71N st", "RichLand", "Iowa", 3658);
		Address addressOfAuthorFour = new Address("81N st", "Houston", "Texas", 8563);
		
		Book firstBook = new Book("CoreJava", 2025425689, 7, 1);
		Author authorOne = new Author("Peter", "John", "214-663-4238", addressOfAuthorOne, "bio ", "BestSeller");
		firstBook.addAuthor(authorOne);
		
		Book secondBook = new Book("C++", 256345865, 21, 3);
		Author authorTwo = new Author("Reqiq", "Higemengist", "251-663-4238", addressOfAuthorTwo, "bio ", "BestSeller");
		secondBook.addAuthor(authorTwo);
		
		Book thirdBook = new Book("Java How To Program", 658933665, 21, 3);
		Author authorThree = new Author("Qecco", "Beza", "365-663-4238", addressOfAuthorThree, "bio ", "BestSeller");
		thirdBook.addAuthor(authorThree);
		
		Book fourthBook = new Book("Fikir Iski Meqabir", 698755664, 7, 1);
		Author authorFour = new Author("Ameha", "Abrham", "586-663-4238", addressOfAuthorFour, "bio ", "BestSeller");
		fourthBook.addAuthor(authorFour);
		
		Collections.addAll(bookList, firstBook, secondBook, thirdBook, fourthBook);	
	}
	public void addBookToDB(Book book) {
		bookList.add(book);
	}
	
	public List<Book> getBooksFromDB() {
		return bookList;
	}
	
	
}



