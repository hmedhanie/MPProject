package otherClasses;

public class Person {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	
	public Person(String firstName, String lastName, String phoneNumber, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [First name = " + firstName + ", last name = " + lastName + ", phone number =" + phoneNumber + 
				", address = " + address.toString() + " ]";
	}
	

	
}
