package otherClasses;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Author extends Person{
	
	private String shortBio;
	private String credentials;
	private List<Book> books = new LinkedList<>();
	

	public Author(String firstName, String lastName, String phoneNumber, Address address, String shortBio, String credentials, Book book) {
		super(firstName, lastName, phoneNumber, address);
		this.shortBio = shortBio;
		this.credentials = credentials;
	}
	
	public void addToBook(Book book) {
		books.add(book);
	}

}
