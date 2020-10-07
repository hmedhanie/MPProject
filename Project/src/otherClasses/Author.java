package otherClasses;
import java.util.ArrayList;
import java.util.List;

public class Author extends Person{
	
	private String shortBio;
	private String credentials;
	private List<Book> books;
	

	public Author(String firstName, String lastName, String phoneNumber, Address address, String shortBio, String credentials, Book book) {
		super(firstName, lastName, phoneNumber, address);
		this.shortBio = shortBio;
		this.credentials = credentials;
		books = new ArrayList<Book>();
		books.add(book);
	}
	
	public void addToBook(Book book) {
		books.add(book);
	}

}
