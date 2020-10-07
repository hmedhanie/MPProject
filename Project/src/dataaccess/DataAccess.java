package dataaccess;
import otherClasses.LibraryMember;
import otherClasses.Address;
import otherClasses.Book;



public interface DataAccess {

	public void saveLibraryMember(LibraryMember member, Address address);
	public void saveLibraryMember(String member, String address);
	public LibraryMember searchMember(String memberId);
	
	public Book searchBook(int isbn);
	
	public void saveBook();
	
}

