package groupfour;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CheckOutRecord {

	private double fines;
	private Date paidDate;
	private List<CheckOutRecordEntry> checkOutRecordEntry = new LinkedList<>();
	
	public void addEntry(CheckOutRecordEntry checkOutEntry) {
		
		checkOutRecordEntry.add(checkOutEntry);
	}
	
}
