package groupfour;

public class Address {

	private String street;
	private String city;
	private String state;
	private int zip;
	
	
	public Address(String street, String city, String state, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
}
