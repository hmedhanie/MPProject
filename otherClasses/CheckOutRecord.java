package otherClasses;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CheckOutRecord {

	private double fines;
	private LocalDate paidDate;
	private List<CheckOutRecordEntry> checkOutRecordEntryList = new LinkedList<>();	
 
	
	public CheckOutRecord(double fines, LocalDate paidDate) {
		super();
		this.fines = fines;
		this.paidDate = paidDate;
	}

		
	public void addEntry(CheckOutRecordEntry checkOutEntry) {
		
		checkOutRecordEntryList.add(checkOutEntry);
	}
	
	
	public double getFines() {
		return fines;
	}

	public LocalDate getPaidDate() {
		return paidDate;
	}

//	public List<CheckOutRecordEntry> getCheckOutRecord() {
//		return checkOutRecordEntryList;
//	}

}
