package otherClasses;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class CheckOutRecord {

	private double fines;
	private LocalDate paidDate;
	private List<CheckOutRecordEntry> checkOutRecord;
	
	public CheckOutRecord() {}
	
	public void addEntry(String checkOutEntry) {
		
	}

	public double getFines() {
		return fines;
	}

	public void setFines(double fines) {
		this.fines = fines;
	}

	public LocalDate getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}

	public List<CheckOutRecordEntry> getCheckOutRecord() {
		return checkOutRecord;
	}

	public void setCheckOutRecord(List<CheckOutRecordEntry> checkOutRecord) {
		this.checkOutRecord = checkOutRecord;
	}
	
}
