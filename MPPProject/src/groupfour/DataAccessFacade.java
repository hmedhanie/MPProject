package groupfour;

public class DataAccessFacade implements DataAccess{

	private DataBase dataBase;
	
	@Override
	public void saveLibraryMember(LibraryMember member, Address address) {
		dataBase.setAddress(address);
		System.out.println(member);
		dataBase.setMember(member);
	}

	@Override
	public void searchMember(String memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchBook(String isbn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveBook() {
		// TODO Auto-generated method stub
		
	}

}
