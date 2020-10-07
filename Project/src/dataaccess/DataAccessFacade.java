package dataaccess;
import otherClasses.*;

public class DataAccessFacade implements DataAccess{

	private DataBase dataBase;
	
	
	
	public DataAccessFacade() {
		super();
		dataBase = new DataBase();
	}

	@Override
	public void saveLibraryMember(LibraryMember member, Address address) {
		dataBase.setLibraryMember(member);
		dataBase.setAddress(address);
		dataBase.print();
	}

	@Override
	public LibraryMember searchMember(String memberId) {
		return dataBase.searchMemberDataBase(memberId);
	}

	@Override
	public Book searchBook(int isbn) {
		return dataBase.searchBookFromDataBase(isbn);
	}

	@Override
	public void saveBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveLibraryMember(String member, String address) {
		/*dataBase.setName(member);
		dataBase.setMemberId(address);
		dataBase.print();*/
		
		
	}

}
