package groupfour;

public class DataBase {

	private Address address;
	private LibraryMember member;

	public static void main(String[] args) {
		System.out.println();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setMember(LibraryMember member) {
		this.member = member;
	}

	public Address getAddress() {
		return address;
	}

	public LibraryMember getMember() {
		return member;
	}

}
