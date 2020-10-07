package groupfour;

public interface DataAccess {

	public void saveLibraryMember(LibraryMember member, Address address);
	
	public void searchMember(String memberId);
	
	public void searchBook(String isbn);
	
	public void saveBook();
	
}
