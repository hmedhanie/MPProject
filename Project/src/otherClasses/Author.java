package otherClasses;

public class Author extends Person{
	
	private String shortBio;
	private String credentials;
	

	public Author(String firstName, String lastName, String phoneNumber, Address address, String shortBio, String credentials) {
		super(firstName, lastName, phoneNumber, address);
		this.shortBio = shortBio;
		this.credentials = credentials;
	}

}
